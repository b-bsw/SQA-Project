package org.apache.commons.jxpath.ri.compiler;

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
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator14, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator14, qName18, locale19);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = valueIterator20.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = valueIterator10.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator14, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator14, qName19, locale20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = pointerIterator21.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName17, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = pointerIterator19.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName3, locale4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = valueIterator6.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName3, locale4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = pointerIterator5.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator19, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = valueIterator20.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName13, locale14);
        java.lang.Class<?> wildcardClass16 = pointerIterator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = pointerIterator20.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator19, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator25, qName26, locale27);
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator31 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator25, qName29, locale30);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName11, locale12);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = valueIterator24.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName24, locale25);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator29 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName27, locale28);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator29.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = valueIterator20.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName15, locale16);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = valueIterator5.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator14);
        java.lang.Class<?> wildcardClass16 = valueIterator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName19, locale20);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator15, qName19, locale20);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator21, qName22, locale23);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator24);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator25.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = valueIterator10.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        java.lang.Class<?> wildcardClass11 = pointerIterator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator24);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator25);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator29 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator25, qName27, locale28);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator30 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator29);
        org.apache.commons.jxpath.ri.QName qName31 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator33 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator29, qName31, locale32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = pointerIterator29.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        java.lang.Class<?> wildcardClass17 = pointerIterator16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator19, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator19, qName23, locale24);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator27 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator19, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator25, qName26, locale27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = valueIterator25.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = pointerIterator10.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        java.lang.Class<?> wildcardClass12 = valueIterator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator14, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator14, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator21, qName22, locale23);
        org.apache.commons.jxpath.ri.QName qName25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator27 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator21, qName25, locale26);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator31 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator28, qName29, locale30);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator32 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator28);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator18, qName20, locale21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator22);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        java.lang.Class<?> wildcardClass21 = valueIterator20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = pointerIterator10.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName19, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pointerIterator21.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName17, locale18);
        java.lang.Class<?> wildcardClass20 = pointerIterator19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        java.lang.Class<?> wildcardClass12 = valueIterator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName21, locale22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = pointerIterator23.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator23.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator20, qName24, locale25);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator19, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        org.apache.commons.jxpath.ri.QName qName25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator27 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator24, qName25, locale26);
        org.apache.commons.jxpath.ri.QName qName28 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator30 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator27, qName28, locale29);
        java.lang.Class<?> wildcardClass31 = pointerIterator30.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = pointerIterator10.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        java.lang.Class<?> wildcardClass16 = valueIterator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName13, locale14);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = valueIterator24.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName20, locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = pointerIterator15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName4, locale5);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = valueIterator22.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator18, qName19, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pointerIterator18.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = valueIterator17.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator22, qName24, locale25);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator29 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator22, qName27, locale28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = valueIterator22.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator22, qName23, locale24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator22, qName26, locale27);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator28.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName20, locale21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = pointerIterator22.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName23, locale24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator25, qName26, locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = pointerIterator28.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName19, locale20);
        java.lang.Class<?> wildcardClass22 = pointerIterator21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = valueIterator19.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName24, locale25);
        java.lang.Class<?> wildcardClass27 = pointerIterator26.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        java.lang.Class<?> wildcardClass17 = valueIterator16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator16);
        java.lang.Class<?> wildcardClass21 = valueIterator16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator14, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator14, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = valueIterator21.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator15);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator22, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = pointerIterator22.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName14, locale15);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = valueIterator20.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator7);
        java.lang.Class<?> wildcardClass10 = valueIterator9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator20, qName21, locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pointerIterator23.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator21, qName23, locale24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator21, qName26, locale27);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator22, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = pointerIterator22.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = valueIterator9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName19, locale20);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName22, locale23);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator14);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator14, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator23, qName24, locale25);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator29 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator26, qName27, locale28);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName24, locale25);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator27 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = valueIterator27.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator14);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = valueIterator20.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator23, qName24, locale25);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName3, locale4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator5);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator14, qName16, locale17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = pointerIterator18.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator16);
        java.lang.Class<?> wildcardClass21 = valueIterator20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = valueIterator19.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName16, locale17);
        java.lang.Class<?> wildcardClass19 = pointerIterator18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = valueIterator22.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator24);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = valueIterator24.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = valueIterator15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName19, locale20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator21);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        org.apache.commons.jxpath.ri.QName qName25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator27 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator23, qName25, locale26);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator31 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator28, qName29, locale30);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = valueIterator12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator17);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName22, locale23);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator19, qName20, locale21);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator9);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator22, qName23, locale24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator22, qName26, locale27);
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator31 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator28, qName29, locale30);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator32 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator31);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = valueIterator22.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName19, locale20);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName22, locale23);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = valueIterator9.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName24, locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = valueIterator20.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = valueIterator13.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator18, qName19, locale20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator18);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator22.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName8, locale9);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        java.lang.Class<?> wildcardClass20 = pointerIterator19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = pointerIterator20.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator19, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator22, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = pointerIterator22.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator18, qName19, locale20);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator18, qName22, locale23);
        java.lang.Class<?> wildcardClass25 = valueIterator18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator19, qName20, locale21);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator1, qName2, locale3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator1, qName5, locale6);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator21, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator25.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName17, locale18);
        java.lang.Class<?> wildcardClass20 = pointerIterator19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator18, qName19, locale20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator15);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator23, qName24, locale25);
        java.lang.Class<?> wildcardClass27 = pointerIterator26.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator23, qName24, locale25);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = valueIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator9);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        java.lang.Class<?> wildcardClass15 = valueIterator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName19, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = pointerIterator13.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = valueIterator10.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = pointerIterator19.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator18, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator22, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = pointerIterator22.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = valueIterator19.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator17);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        java.lang.Class<?> wildcardClass15 = valueIterator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator20, qName21, locale22);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = valueIterator14.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName20, locale21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator22);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName19, locale20);
        java.lang.Class<?> wildcardClass22 = pointerIterator21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator20, qName24, locale25);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName11, locale12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = pointerIterator9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator19, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator22, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator22.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator21, qName22, locale23);
        java.lang.Class<?> wildcardClass25 = pointerIterator24.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName23, locale24);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = valueIterator20.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator24.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator28 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator25, qName26, locale27);
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator31 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator28, qName29, locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = pointerIterator28.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName21, locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pointerIterator17.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator23, qName24, locale25);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator27 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator23, qName24, locale25);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName14, locale15);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName24, locale25);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator29 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator26, qName27, locale28);
        org.apache.commons.jxpath.ri.QName qName30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator32 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator26, qName30, locale31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = pointerIterator26.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName16, locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = valueIterator5.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        java.lang.Class<?> wildcardClass17 = pointerIterator15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator20, qName21, locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = pointerIterator20.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = valueIterator13.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName13, locale14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = valueIterator9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName23, locale24);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator6, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator20);
        java.lang.Class<?> wildcardClass22 = valueIterator20.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = pointerIterator23.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator9, qName10, locale11);
        java.lang.Class<?> wildcardClass13 = pointerIterator12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName23, locale24);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator29 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName27, locale28);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator14, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName19, locale20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = pointerIterator25.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator8, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = pointerIterator15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName13, locale14);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator14, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName19, locale20);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator21, qName22, locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = pointerIterator21.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator20, qName21, locale22);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = pointerIterator19.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName15, locale16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator17);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator17, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator25.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = valueIterator14.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator22);
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator26 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator22, qName24, locale25);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName21, locale22);
        java.lang.Class<?> wildcardClass24 = pointerIterator23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator18 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName16, locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = pointerIterator15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName11, locale12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator16);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName9, locale10);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator11, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator15);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName18, locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator15, qName21, locale22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator24 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator23);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator17, qName18, locale19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = valueIterator17.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator4);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName7, locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator5, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName20, locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator16, qName23, locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = pointerIterator25.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator9);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator13, qName14, locale15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = valueIterator13.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator3);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator9, qName10, locale11);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator13);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = valueIterator15.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator11, qName12, locale13);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName2, locale3);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator5 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator8 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName6, locale7);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator4);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator12 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator4, qName10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator15 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator12, qName13, locale14);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator12);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator19 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator16, qName20, locale21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = valueIterator16.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator2, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator13 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName11, locale12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName14, locale15);
        java.lang.Class<?> wildcardClass17 = pointerIterator16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator1 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator2 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator6, qName7, locale8);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator17 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator20 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator10, qName18, locale19);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator21 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator20);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator22 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator23 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) valueIterator21);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator23.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }
}

