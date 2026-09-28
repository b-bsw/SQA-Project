package com.fasterxml.jackson.core;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 99, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 99, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.matchElement((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 34, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 34, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        java.lang.Class<?> wildcardClass4 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jsonPointer2.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 9, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonPointer6.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer5.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonPointer7.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jsonPointer5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.Class<?> wildcardClass10 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonPointer7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = jsonPointer2.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchElement(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jsonPointer3.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonPointer7.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jsonPointer3._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        java.lang.Class<?> wildcardClass4 = jsonPointer0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jsonPointer3._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = jsonPointer2.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jsonPointer2.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 9, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer6.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.Class<?> wildcardClass4 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.tail();
        java.lang.Class<?> wildcardClass15 = jsonPointer14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = jsonPointer2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jsonPointer13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jsonPointer3.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.matchElement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 96, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        boolean boolean6 = jsonPointer1.mayMatchElement();
        java.lang.Class<?> wildcardClass7 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 99, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jsonPointer6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11.tail();
        java.lang.String str13 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = jsonPointer15.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        java.lang.String str14 = jsonPointer11._asString;
        int int15 = jsonPointer11.getMatchingIndex();
        java.lang.String str16 = jsonPointer11._asString;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonPointer7._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.Class<?> wildcardClass8 = jsonPointer7.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        java.lang.Class<?> wildcardClass13 = jsonPointer11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonPointer6.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        boolean boolean7 = jsonPointer5.equals((java.lang.Object) 1L);
        boolean boolean8 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer5.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonPointer10._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 99, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int9 = jsonPointer8.getMatchingIndex();
        java.lang.String str10 = jsonPointer8._matchingPropertyName;
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer6.equals((java.lang.Object) jsonPointer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 51, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        java.lang.Class<?> wildcardClass7 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        boolean boolean9 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        java.lang.String str11 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.Class<?> wildcardClass13 = jsonPointer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = jsonPointer2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        java.lang.Class<?> wildcardClass12 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonPointer9.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 9, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jsonPointer2.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        boolean boolean15 = jsonPointer10.mayMatchElement();
        java.lang.Class<?> wildcardClass16 = jsonPointer10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchElement((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer4.getClass();
        boolean boolean8 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        java.lang.String str9 = jsonPointer4._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchElement(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jsonPointer7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        java.lang.Class<?> wildcardClass4 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9._matchingElementIndex;
        java.lang.Class<?> wildcardClass11 = jsonPointer9.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jsonPointer5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3._matchingPropertyName;
        boolean boolean11 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        int int17 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.tail();
        boolean boolean19 = jsonPointer16.mayMatchProperty();
        int int20 = jsonPointer16.getMatchingIndex();
        boolean boolean21 = jsonPointer14.equals((java.lang.Object) jsonPointer16);
        java.lang.String str22 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean24 = jsonPointer3.equals((java.lang.Object) jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = jsonPointer25._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.Class<?> wildcardClass4 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer0.matchElement(1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = jsonPointer17.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonPointer7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9.getMatchingIndex();
        java.lang.String str11 = jsonPointer9._asString;
        java.lang.Class<?> wildcardClass12 = jsonPointer9.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        boolean boolean2 = jsonPointer1.mayMatchProperty();
        java.lang.Class<?> wildcardClass3 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 9, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonPointer4._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchElement((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement((int) (short) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        java.lang.Class<?> wildcardClass17 = jsonPointer15.getClass();
        boolean boolean18 = jsonPointer0.equals((java.lang.Object) jsonPointer15);
        boolean boolean19 = jsonPointer15.matches();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) 1.0d);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("");
        java.lang.Class<?> wildcardClass9 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer4.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonPointer9.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement((int) (short) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        java.lang.Class<?> wildcardClass17 = jsonPointer15.getClass();
        boolean boolean18 = jsonPointer0.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        int int20 = jsonPointer19._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.tail();
        boolean boolean22 = jsonPointer19.mayMatchProperty();
        int int23 = jsonPointer19.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer19.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer19.matchProperty("");
        boolean boolean27 = jsonPointer19.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer33);
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer33);
        boolean boolean36 = jsonPointer35.mayMatchElement();
        java.lang.String str37 = jsonPointer35.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer35.tail();
        boolean boolean39 = jsonPointer19.equals((java.lang.Object) jsonPointer35);
        boolean boolean40 = jsonPointer15.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(jsonPointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.tail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        boolean boolean16 = jsonPointer14.matches();
        java.lang.String str17 = jsonPointer14.toString();
        boolean boolean18 = jsonPointer14.mayMatchElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonPointer13.equals((java.lang.Object) jsonPointer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonPointer10._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        int int5 = jsonPointer1._matchingElementIndex;
        java.lang.String str6 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonPointer7.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonPointer9._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.Class<?> wildcardClass2 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean12 = jsonPointer9.matches();
        java.lang.String str13 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchElement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jsonPointer3.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean10 = jsonPointer3.matches();
        java.lang.Class<?> wildcardClass11 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        java.lang.Class<?> wildcardClass10 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer();
        int int6 = jsonPointer5._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer5.tail();
        java.lang.Class<?> wildcardClass9 = jsonPointer5.getClass();
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) jsonPointer5);
        java.lang.String str11 = jsonPointer5.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean7 = jsonPointer6.mayMatchElement();
        int int8 = jsonPointer6._matchingElementIndex;
        boolean boolean9 = jsonPointer1.equals((java.lang.Object) int8);
        int int10 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 51, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean17 = jsonPointer16.mayMatchElement();
        java.lang.String str18 = jsonPointer16.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16.tail();
        boolean boolean20 = jsonPointer0.equals((java.lang.Object) jsonPointer16);
        java.lang.Class<?> wildcardClass21 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0.matchElement((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonPointer5._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jsonPointer6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        int int5 = jsonPointer1._matchingElementIndex;
        java.lang.String str6 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer4.getClass();
        boolean boolean8 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        boolean boolean9 = jsonPointer4.matches();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement(100);
        int int7 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str9 = jsonPointer8._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.matchElement((int) ' ');
        java.lang.String str20 = jsonPointer15._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        java.lang.String str22 = jsonPointer21.getMatchingProperty();
        java.lang.String str23 = jsonPointer21.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer21);
        boolean boolean25 = jsonPointer8.equals((java.lang.Object) jsonPointer21);
        java.lang.Class<?> wildcardClass26 = jsonPointer21.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.Class<?> wildcardClass3 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 99, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        boolean boolean18 = jsonPointer14.mayMatchElement();
        int int19 = jsonPointer14.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer14);
        boolean boolean21 = jsonPointer20.mayMatchProperty();
        boolean boolean22 = jsonPointer20.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        boolean boolean24 = jsonPointer3.equals((java.lang.Object) jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer3.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer26.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer26);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        int int6 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonPointer5.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        int int16 = jsonPointer15._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = jsonPointer7.equals((java.lang.Object) jsonPointer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement(100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        java.lang.String str10 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        java.lang.Class<?> wildcardClass4 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3._matchingPropertyName;
        boolean boolean11 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        int int17 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.tail();
        boolean boolean19 = jsonPointer16.mayMatchProperty();
        int int20 = jsonPointer16.getMatchingIndex();
        boolean boolean21 = jsonPointer14.equals((java.lang.Object) jsonPointer16);
        java.lang.String str22 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean24 = jsonPointer3.equals((java.lang.Object) jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchElement(100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = jsonPointer26.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer26);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonPointer7._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        java.lang.String str7 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement(0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) 1);
        int int12 = jsonPointer9.getMatchingIndex();
        java.lang.String str13 = jsonPointer9._asString;
        int int14 = jsonPointer9._matchingElementIndex;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonPointer7.equals((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean13 = jsonPointer7.equals((java.lang.Object) jsonPointer12);
        boolean boolean14 = jsonPointer12.mayMatchProperty();
        java.lang.Class<?> wildcardClass15 = jsonPointer12.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        int int11 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonPointer12.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer5.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        java.lang.String str14 = jsonPointer10.getMatchingProperty();
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        java.lang.String str16 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer10.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int21 = jsonPointer20.getMatchingIndex();
        java.lang.String str22 = jsonPointer20._matchingPropertyName;
        java.lang.String str23 = jsonPointer20._matchingPropertyName;
        java.lang.String str24 = jsonPointer20.getMatchingProperty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = jsonPointer18.equals((java.lang.Object) jsonPointer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 9, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str4 = jsonPointer3._matchingPropertyName;
        boolean boolean5 = jsonPointer3.mayMatchElement();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        int int7 = jsonPointer3._matchingElementIndex;
        java.lang.String str8 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        int int10 = jsonPointer3._matchingElementIndex;
        java.lang.Class<?> wildcardClass11 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer2.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = jsonPointer20._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = jsonPointer2._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.Class<?> wildcardClass11 = jsonPointer9.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass6 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jsonPointer3._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.Class<?> wildcardClass4 = jsonPointer0.getClass();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        java.lang.Class<?> wildcardClass12 = jsonPointer9.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.String str8 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonPointer9.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        int int6 = jsonPointer1._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        java.lang.String str9 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonPointer10.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3.matchElement((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jsonPointer3.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        boolean boolean7 = jsonPointer5.equals((java.lang.Object) 1L);
        boolean boolean8 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer5.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonPointer10._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.String str8 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer9.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        java.lang.String str4 = jsonPointer0._asString;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        boolean boolean2 = jsonPointer1.mayMatchProperty();
        boolean boolean3 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.mayMatchProperty();
        boolean boolean10 = jsonPointer8.matches();
        java.lang.String str11 = jsonPointer8.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.matchProperty("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 99, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonPointer11._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonPointer5._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer13);
        int int15 = jsonPointer13.getMatchingIndex();
        java.lang.String str16 = jsonPointer13.toString();
        java.lang.Class<?> wildcardClass17 = jsonPointer13.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str6 = jsonPointer5._asString;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.Class<?> wildcardClass8 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1._asString;
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonPointer10._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (byte) 100);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1.toString();
        java.lang.String str6 = jsonPointer1.getMatchingProperty();
        java.lang.String str7 = jsonPointer1.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer4.getClass();
        boolean boolean8 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        int int9 = jsonPointer4._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        boolean boolean10 = jsonPointer7.matches();
        java.lang.String str11 = jsonPointer7._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        boolean boolean5 = jsonPointer0.matches();
        int int6 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        boolean boolean7 = jsonPointer3.mayMatchProperty();
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        boolean boolean10 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonPointer14._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        boolean boolean14 = jsonPointer11.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass15 = jsonPointer11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        boolean boolean3 = jsonPointer0.mayMatchElement();
        java.lang.String str4 = jsonPointer0._asString;
        java.lang.String str5 = jsonPointer0._asString;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jsonPointer2.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        java.lang.String str15 = jsonPointer11._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchProperty("hi!");
        java.lang.String str9 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean3 = jsonPointer0.equals((java.lang.Object) (short) 1);
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        boolean boolean5 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0._asString;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        java.lang.String str9 = jsonPointer7._asString;
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) str9);
        java.lang.String str11 = jsonPointer0._asString;
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = jsonPointer2.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean13 = jsonPointer7.equals((java.lang.Object) jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        boolean boolean18 = jsonPointer14.mayMatchElement();
        int int19 = jsonPointer14.getMatchingIndex();
        boolean boolean20 = jsonPointer14.matches();
        boolean boolean21 = jsonPointer7.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.mayMatchProperty();
        java.lang.String str12 = jsonPointer7.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer10.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str7 = jsonPointer6.getMatchingProperty();
        java.lang.Class<?> wildcardClass8 = jsonPointer6.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        boolean boolean3 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.matchProperty("hi!");
        boolean boolean7 = jsonPointer1.equals((java.lang.Object) jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonPointer8.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean12 = jsonPointer9.matches();
        java.lang.String str13 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        boolean boolean16 = jsonPointer9.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.tail();
        int int15 = jsonPointer9._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        java.lang.String str13 = jsonPointer10._matchingPropertyName;
        int int14 = jsonPointer10.getMatchingIndex();
        java.lang.Class<?> wildcardClass15 = jsonPointer10.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        boolean boolean7 = jsonPointer5.equals((java.lang.Object) 1L);
        boolean boolean8 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer5.matchProperty("hi!");
        java.lang.String str11 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str13 = jsonPointer12._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchElement((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = jsonPointer17._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        java.lang.String str15 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer18._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean23 = jsonPointer22.mayMatchElement();
        int int24 = jsonPointer22._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer22._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = jsonPointer21.equals((java.lang.Object) jsonPointer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean12 = jsonPointer9.matches();
        java.lang.String str13 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        int int22 = jsonPointer18.getMatchingIndex();
        boolean boolean23 = jsonPointer16.equals((java.lang.Object) jsonPointer18);
        java.lang.String str24 = jsonPointer16._matchingPropertyName;
        java.lang.String str25 = jsonPointer16.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer16.matchElement((int) (short) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer31);
        java.lang.Class<?> wildcardClass33 = jsonPointer31.getClass();
        boolean boolean34 = jsonPointer16.equals((java.lang.Object) jsonPointer31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = jsonPointer15.equals((java.lang.Object) jsonPointer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertNotNull(jsonPointer31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        java.lang.String str10 = jsonPointer7.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int5 = jsonPointer4.getMatchingIndex();
        java.lang.String str6 = jsonPointer4._matchingPropertyName;
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchProperty();
        java.lang.String str9 = jsonPointer4._matchingPropertyName;
        int int10 = jsonPointer4.getMatchingIndex();
        boolean boolean11 = jsonPointer4.mayMatchProperty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNotNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer0.matchElement(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = jsonPointer17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        java.lang.String str12 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str9 = jsonPointer2.toString();
        boolean boolean10 = jsonPointer2.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str15 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer21.matchElement((int) ' ');
        java.lang.String str26 = jsonPointer21._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        java.lang.String str28 = jsonPointer27.getMatchingProperty();
        java.lang.String str29 = jsonPointer27.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer27);
        boolean boolean31 = jsonPointer14.equals((java.lang.Object) jsonPointer27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = jsonPointer5.equals((java.lang.Object) jsonPointer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        java.lang.String str9 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer();
        int int14 = jsonPointer13._matchingElementIndex;
        boolean boolean15 = jsonPointer13.matches();
        java.lang.String str16 = jsonPointer13.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonPointer12.equals((java.lang.Object) str16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean18 = jsonPointer14.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass19 = jsonPointer14.getClass();
        boolean boolean20 = jsonPointer1.equals((java.lang.Object) wildcardClass19);
        int int21 = jsonPointer1._matchingElementIndex;
        java.lang.String str22 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        int int24 = jsonPointer23._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchProperty("hi!");
        boolean boolean27 = jsonPointer23.mayMatchElement();
        boolean boolean28 = jsonPointer23.mayMatchProperty();
        int int29 = jsonPointer23.getMatchingIndex();
        boolean boolean30 = jsonPointer1.equals((java.lang.Object) int29);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean12 = jsonPointer9.matches();
        boolean boolean13 = jsonPointer9.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        int int12 = jsonPointer11.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0._asString;
        java.lang.String str7 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer14.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        java.lang.String str9 = jsonPointer1.getMatchingProperty();
        java.lang.String str10 = jsonPointer1._matchingPropertyName;
        int int11 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        boolean boolean10 = jsonPointer7.matches();
        int int11 = jsonPointer7.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("");
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer11.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3.toString();
        java.lang.String str11 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        java.lang.Class<?> wildcardClass13 = jsonPointer12.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonPointer14.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.toString();
        boolean boolean6 = jsonPointer3.matches();
        java.lang.Class<?> wildcardClass7 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean18 = jsonPointer14.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass19 = jsonPointer14.getClass();
        boolean boolean20 = jsonPointer1.equals((java.lang.Object) wildcardClass19);
        int int21 = jsonPointer1._matchingElementIndex;
        java.lang.String str22 = jsonPointer1._matchingPropertyName;
        boolean boolean23 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        boolean boolean5 = jsonPointer0.matches();
        int int6 = jsonPointer0._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer10.matchElement((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonPointer16.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 31, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonPointer9._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        java.lang.String str8 = jsonPointer1._asString;
        java.lang.String str9 = jsonPointer1._asString;
        boolean boolean10 = jsonPointer1.matches();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0._asString;
        java.lang.String str6 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonPointer15.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        int int9 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        int int5 = jsonPointer1._matchingElementIndex;
        java.lang.String str6 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = jsonPointer2.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        java.lang.String str5 = jsonPointer0._asString;
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        java.lang.String str10 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        java.lang.String str12 = jsonPointer0._matchingPropertyName;
        java.lang.Class<?> wildcardClass13 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        int int12 = jsonPointer9._matchingElementIndex;
        int int13 = jsonPointer9._matchingElementIndex;
        java.lang.Class<?> wildcardClass14 = jsonPointer9.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        int int9 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7._nextSegment;
        boolean boolean11 = jsonPointer7.matches();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.tail();
        boolean boolean6 = jsonPointer1.matches();
        boolean boolean7 = jsonPointer1.mayMatchProperty();
        java.lang.String str8 = jsonPointer1.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer10.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.matchElement((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchProperty("hi!");
        boolean boolean7 = jsonPointer1.mayMatchElement();
        boolean boolean8 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3.matchElement((int) '4');
        java.lang.Class<?> wildcardClass7 = jsonPointer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str17 = jsonPointer16._matchingPropertyName;
        boolean boolean19 = jsonPointer16.equals((java.lang.Object) (short) 1);
        java.lang.String str20 = jsonPointer16._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer16.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = jsonPointer15.equals((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9.getMatchingIndex();
        int int11 = jsonPointer9._matchingElementIndex;
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.String str8 = jsonPointer1._asString;
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str12 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        boolean boolean15 = jsonPointer13.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass16 = jsonPointer13.getClass();
        boolean boolean17 = jsonPointer1.equals((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean13 = jsonPointer7.equals((java.lang.Object) jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonPointer15.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonPointer5.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        java.lang.String str14 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer11._nextSegment;
        java.lang.String str18 = jsonPointer11._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.Class<?> wildcardClass4 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.String str8 = jsonPointer1.toString();
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str7 = jsonPointer6._asString;
        java.lang.String str8 = jsonPointer6.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        boolean boolean14 = jsonPointer11.equals((java.lang.Object) 0.0d);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str7 = jsonPointer6._asString;
        boolean boolean8 = jsonPointer6.matches();
        int int9 = jsonPointer6._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer2.mayMatchProperty();
        java.lang.String str10 = jsonPointer2._asString;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchElement((int) (short) 0);
        java.lang.String str7 = jsonPointer1._matchingPropertyName;
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        boolean boolean11 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.getMatchingProperty();
        int int8 = jsonPointer1._matchingElementIndex;
        boolean boolean9 = jsonPointer1.matches();
        java.lang.String str10 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchElement((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = jsonPointer17.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.Class<?> wildcardClass9 = jsonPointer8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        java.lang.Class<?> wildcardClass3 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        int int9 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7.matchElement((int) '4');
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2._nextSegment;
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        java.lang.String str9 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str11 = jsonPointer2._asString;
        java.lang.Class<?> wildcardClass12 = jsonPointer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        boolean boolean16 = jsonPointer11.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) 1);
        boolean boolean9 = jsonPointer6.matches();
        java.lang.String str10 = jsonPointer6.getMatchingProperty();
        boolean boolean11 = jsonPointer6.mayMatchElement();
        boolean boolean12 = jsonPointer3.equals((java.lang.Object) jsonPointer6);
        boolean boolean13 = jsonPointer6.matches();
        java.lang.String str14 = jsonPointer6.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean12 = jsonPointer11.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.Class<?> wildcardClass14 = jsonPointer13.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        int int6 = jsonPointer0._matchingElementIndex;
        int int7 = jsonPointer0._matchingElementIndex;
        java.lang.Class<?> wildcardClass8 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        boolean boolean6 = jsonPointer0.mayMatchElement();
        java.lang.Class<?> wildcardClass7 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean8 = jsonPointer7.matches();
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) boolean8);
        int int10 = jsonPointer0.getMatchingIndex();
        java.lang.String str11 = jsonPointer0.toString();
        boolean boolean12 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer0.matchElement(1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean14 = jsonPointer13.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13._nextSegment;
        int int16 = jsonPointer13._matchingElementIndex;
        int int17 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        boolean boolean19 = jsonPointer9.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass20 = jsonPointer9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        boolean boolean10 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer1.matchElement((int) 'a');
        java.lang.Class<?> wildcardClass13 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        java.lang.String str22 = jsonPointer21.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int26 = jsonPointer25.getMatchingIndex();
        java.lang.String str27 = jsonPointer25._matchingPropertyName;
        java.lang.String str28 = jsonPointer25._matchingPropertyName;
        boolean boolean29 = jsonPointer21.equals((java.lang.Object) jsonPointer25);
        boolean boolean30 = jsonPointer25.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = jsonPointer9.equals((java.lang.Object) jsonPointer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str4 = jsonPointer3._matchingPropertyName;
        boolean boolean5 = jsonPointer3.mayMatchElement();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        int int7 = jsonPointer3._matchingElementIndex;
        java.lang.String str8 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer3.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        java.lang.String str15 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer18._nextSegment;
        java.lang.Class<?> wildcardClass20 = jsonPointer18.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.getMatchingProperty();
        java.lang.Class<?> wildcardClass8 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) 1);
        boolean boolean9 = jsonPointer6.matches();
        java.lang.String str10 = jsonPointer6.getMatchingProperty();
        boolean boolean11 = jsonPointer6.mayMatchElement();
        boolean boolean12 = jsonPointer3.equals((java.lang.Object) jsonPointer6);
        java.lang.String str13 = jsonPointer6.toString();
        int int14 = jsonPointer6.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        java.lang.String str3 = jsonPointer0._asString;
        java.lang.String str4 = jsonPointer0.toString();
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int16 = jsonPointer15.getMatchingIndex();
        java.lang.String str17 = jsonPointer15._matchingPropertyName;
        java.lang.String str18 = jsonPointer15._matchingPropertyName;
        boolean boolean19 = jsonPointer11.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        java.lang.Class<?> wildcardClass21 = jsonPointer20.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        boolean boolean4 = jsonPointer0.matches();
        int int5 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        int int9 = jsonPointer7.getMatchingIndex();
        java.lang.Class<?> wildcardClass10 = jsonPointer7.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonPointer7.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        java.lang.String str13 = jsonPointer9.toString();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        int int12 = jsonPointer2._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int11 = jsonPointer10.getMatchingIndex();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9._asString;
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        java.lang.String str9 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.matchElement((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonPointer12.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3._nextSegment;
        java.lang.Class<?> wildcardClass7 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer0.matchElement(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonPointer17.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        java.lang.String str16 = jsonPointer0.getMatchingProperty();
        int int17 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean8 = jsonPointer7.matches();
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) boolean8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        boolean boolean6 = jsonPointer1.matches();
        int int7 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer9._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 96, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        java.lang.String str11 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.Class<?> wildcardClass13 = jsonPointer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        java.lang.String str9 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean18 = jsonPointer14.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass19 = jsonPointer14.getClass();
        boolean boolean20 = jsonPointer1.equals((java.lang.Object) wildcardClass19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean22 = jsonPointer21.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21._nextSegment;
        int int24 = jsonPointer21._matchingElementIndex;
        int int25 = jsonPointer21._matchingElementIndex;
        boolean boolean26 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        java.lang.Class<?> wildcardClass27 = jsonPointer21.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.toString();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonPointer5.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonPointer10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        int int4 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        int int8 = jsonPointer2._matchingElementIndex;
        int int9 = jsonPointer2._matchingElementIndex;
        java.lang.String str10 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.Class<?> wildcardClass12 = jsonPointer11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer0.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        java.lang.String str11 = jsonPointer0.toString();
        boolean boolean12 = jsonPointer0.mayMatchProperty();
        java.lang.Class<?> wildcardClass13 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jsonPointer7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        boolean boolean8 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jsonPointer11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        java.lang.String str9 = jsonPointer0._matchingPropertyName;
        java.lang.String str10 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        boolean boolean8 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonPointer11.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        boolean boolean16 = jsonPointer15.matches();
        java.lang.Class<?> wildcardClass17 = jsonPointer15.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        int int6 = jsonPointer0._matchingElementIndex;
        boolean boolean7 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        int int13 = jsonPointer10._matchingElementIndex;
        boolean boolean14 = jsonPointer10.matches();
        java.lang.Class<?> wildcardClass15 = jsonPointer10.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str11 = jsonPointer10._matchingPropertyName;
        boolean boolean12 = jsonPointer10.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchElement((int) 'a');
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer10);
        java.lang.String str16 = jsonPointer10._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        java.lang.String str16 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        int int18 = jsonPointer17.getMatchingIndex();
        boolean boolean19 = jsonPointer3.equals((java.lang.Object) int18);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.Class<?> wildcardClass13 = jsonPointer12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean14 = jsonPointer13.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13._nextSegment;
        int int16 = jsonPointer13._matchingElementIndex;
        int int17 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        boolean boolean19 = jsonPointer9.equals((java.lang.Object) "");
        java.lang.String str20 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer9.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        java.lang.String str14 = jsonPointer10.getMatchingProperty();
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        boolean boolean16 = jsonPointer10.mayMatchElement();
        java.lang.String str17 = jsonPointer10._asString;
        boolean boolean18 = jsonPointer10.matches();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonPointer5.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer10.matchElement((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jsonPointer16._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchElement((int) (short) -1);
        int int10 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer16);
        boolean boolean20 = jsonPointer16.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass21 = jsonPointer16.getClass();
        boolean boolean22 = jsonPointer3.equals((java.lang.Object) wildcardClass21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean24 = jsonPointer23.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23._nextSegment;
        int int26 = jsonPointer23._matchingElementIndex;
        int int27 = jsonPointer23._matchingElementIndex;
        boolean boolean28 = jsonPointer3.equals((java.lang.Object) jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int30 = jsonPointer29._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchProperty("");
        java.lang.String str7 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str11 = jsonPointer10._matchingPropertyName;
        boolean boolean12 = jsonPointer10.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchElement((int) 'a');
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer10);
        boolean boolean16 = jsonPointer10.matches();
        java.lang.String str17 = jsonPointer10._asString;
        java.lang.Class<?> wildcardClass18 = jsonPointer10.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.mayMatchProperty();
        boolean boolean2 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        boolean boolean7 = jsonPointer5.equals((java.lang.Object) 1L);
        boolean boolean8 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer5.matchProperty("hi!");
        java.lang.String str11 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer5.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        int int8 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        java.lang.String str10 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9._nextSegment;
        int int15 = jsonPointer9.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer2.tail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean11 = jsonPointer7.equals((java.lang.Object) 1.0d);
        java.lang.String str12 = jsonPointer7._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean19 = jsonPointer18.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer();
        int int21 = jsonPointer20._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.tail();
        boolean boolean23 = jsonPointer20.mayMatchProperty();
        int int24 = jsonPointer20.getMatchingIndex();
        boolean boolean25 = jsonPointer18.equals((java.lang.Object) jsonPointer20);
        java.lang.String str26 = jsonPointer18._matchingPropertyName;
        java.lang.String str27 = jsonPointer18.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer18);
        boolean boolean29 = jsonPointer13.equals((java.lang.Object) "");
        int int30 = jsonPointer13.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        int int18 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17._nextSegment;
        boolean boolean20 = jsonPointer3.equals((java.lang.Object) jsonPointer17);
        java.lang.String str21 = jsonPointer17._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        int int8 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
        java.lang.String str16 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean25 = jsonPointer24.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer();
        int int27 = jsonPointer26._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer26.tail();
        boolean boolean29 = jsonPointer26.mayMatchProperty();
        int int30 = jsonPointer26.getMatchingIndex();
        boolean boolean31 = jsonPointer24.equals((java.lang.Object) jsonPointer26);
        java.lang.String str32 = jsonPointer24.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer24);
        java.lang.String str34 = jsonPointer33.toString();
        boolean boolean36 = jsonPointer33.equals((java.lang.Object) 0.0d);
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer33);
        boolean boolean38 = jsonPointer19.equals((java.lang.Object) "");
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        int int6 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.tail();
        java.lang.String str8 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str9 = jsonPointer8._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.matchElement((int) ' ');
        java.lang.String str20 = jsonPointer15._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        java.lang.String str22 = jsonPointer21.getMatchingProperty();
        java.lang.String str23 = jsonPointer21.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer21);
        boolean boolean25 = jsonPointer8.equals((java.lang.Object) jsonPointer21);
        java.lang.Class<?> wildcardClass26 = jsonPointer8.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer10.matchElement((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jsonPointer16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean8 = jsonPointer7.matches();
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) boolean8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement((int) (short) 100);
        int int12 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        boolean boolean15 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str18 = jsonPointer17._matchingPropertyName;
        boolean boolean19 = jsonPointer17.mayMatchElement();
        boolean boolean20 = jsonPointer17.mayMatchProperty();
        int int21 = jsonPointer17._matchingElementIndex;
        boolean boolean22 = jsonPointer10.equals((java.lang.Object) jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer17.matchProperty("");
        java.lang.Class<?> wildcardClass25 = jsonPointer17.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchElement((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        int int7 = jsonPointer0._matchingElementIndex;
        java.lang.Class<?> wildcardClass8 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (byte) 1);
        boolean boolean3 = jsonPointer2.matches();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        boolean boolean6 = jsonPointer1.mayMatchElement();
        java.lang.String str7 = jsonPointer1._matchingPropertyName;
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = jsonPointer23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 0);
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.Class<?> wildcardClass4 = jsonPointer2.getClass();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        boolean boolean2 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonPointer4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer13);
        int int15 = jsonPointer0._matchingElementIndex;
        java.lang.String str16 = jsonPointer0.getMatchingProperty();
        java.lang.Class<?> wildcardClass17 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        java.lang.String str14 = jsonPointer10.getMatchingProperty();
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        java.lang.String str16 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean20 = jsonPointer19.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        int int25 = jsonPointer21.getMatchingIndex();
        boolean boolean26 = jsonPointer19.equals((java.lang.Object) jsonPointer21);
        java.lang.String str27 = jsonPointer19._matchingPropertyName;
        java.lang.String str28 = jsonPointer19.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer19);
        boolean boolean30 = jsonPointer10.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass31 = jsonPointer10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jsonPointer3.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        int int12 = jsonPointer9._matchingElementIndex;
        int int13 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("");
        java.lang.String str16 = jsonPointer9.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchElement((int) ' ');
        java.lang.String str14 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str16 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        boolean boolean18 = jsonPointer3.equals((java.lang.Object) jsonPointer15);
        int int19 = jsonPointer15.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        java.lang.String str9 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.matchElement((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonPointer12.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str9 = jsonPointer2.toString();
        boolean boolean10 = jsonPointer2.matches();
        java.lang.String str11 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2.tail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonPointer9._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer4.matchElement((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonPointer13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3._matchingPropertyName;
        boolean boolean11 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        int int17 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.tail();
        boolean boolean19 = jsonPointer16.mayMatchProperty();
        int int20 = jsonPointer16.getMatchingIndex();
        boolean boolean21 = jsonPointer14.equals((java.lang.Object) jsonPointer16);
        java.lang.String str22 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean24 = jsonPointer3.equals((java.lang.Object) jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer25);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer25.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.tail();
        java.lang.Class<?> wildcardClass11 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str18 = jsonPointer17._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean21 = jsonPointer20.mayMatchElement();
        int int22 = jsonPointer20._matchingElementIndex;
        java.lang.Class<?> wildcardClass23 = jsonPointer20.getClass();
        boolean boolean24 = jsonPointer17.equals((java.lang.Object) jsonPointer20);
        boolean boolean25 = jsonPointer0.equals((java.lang.Object) boolean24);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer0.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer27.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jsonPointer27);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 31, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonPointer10._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement((int) (byte) 10);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer10.equals(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchElement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        java.lang.String str8 = jsonPointer1.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        boolean boolean4 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonPointer5.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer4.getClass();
        boolean boolean8 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        boolean boolean9 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean13 = jsonPointer12.matches();
        java.lang.String str14 = jsonPointer12._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int1 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) "hi!");
        java.lang.String str10 = jsonPointer0._matchingPropertyName;
        java.lang.String str11 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        boolean boolean16 = jsonPointer10.equals((java.lang.Object) "hi!");
        java.lang.String str17 = jsonPointer10._asString;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        java.lang.String str4 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        boolean boolean3 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchElement((int) ' ');
        java.lang.String str14 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        int int16 = jsonPointer15._matchingElementIndex;
        boolean boolean17 = jsonPointer0.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer0._nextSegment;
        java.lang.String str19 = jsonPointer0._asString;
        java.lang.String str20 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        int int13 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        java.lang.String str15 = jsonPointer4._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("");
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement(1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        boolean boolean25 = jsonPointer24.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer29.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer29.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer29);
        boolean boolean35 = jsonPointer24.equals((java.lang.Object) jsonPointer34);
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int38 = jsonPointer37.getMatchingIndex();
        java.lang.String str39 = jsonPointer37._matchingPropertyName;
        java.lang.String str40 = jsonPointer37.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer42 = jsonPointer37.matchProperty("hi!");
        boolean boolean43 = jsonPointer37.mayMatchElement();
        boolean boolean44 = jsonPointer37.mayMatchElement();
        boolean boolean45 = jsonPointer24.equals((java.lang.Object) jsonPointer37);
        int int46 = jsonPointer24.getMatchingIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = jsonPointer11.equals((java.lang.Object) int46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(jsonPointer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        boolean boolean11 = jsonPointer2.matches();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        int int7 = jsonPointer0._matchingElementIndex;
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonPointer10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        java.lang.String str15 = jsonPointer14._matchingPropertyName;
        java.lang.String str16 = jsonPointer14.toString();
        java.lang.String str17 = jsonPointer14.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14._nextSegment;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        boolean boolean8 = jsonPointer5.matches();
        java.lang.String str9 = jsonPointer5.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer5.matchProperty("hi!");
        java.lang.String str12 = jsonPointer5._matchingPropertyName;
        boolean boolean13 = jsonPointer5.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        int int22 = jsonPointer18.getMatchingIndex();
        boolean boolean23 = jsonPointer16.equals((java.lang.Object) jsonPointer18);
        java.lang.String str24 = jsonPointer16._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        boolean boolean26 = jsonPointer5.equals((java.lang.Object) jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer28);
        java.lang.Class<?> wildcardClass30 = jsonPointer29.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str9 = jsonPointer2.toString();
        boolean boolean10 = jsonPointer2.matches();
        java.lang.String str11 = jsonPointer2._asString;
        boolean boolean12 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        boolean boolean9 = jsonPointer2.mayMatchElement();
        int int10 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonPointer12.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonPointer5.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        java.lang.String str7 = jsonPointer3._matchingPropertyName;
        java.lang.Class<?> wildcardClass8 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonPointer6.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonPointer9.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 9, length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer18.matchElement((int) ' ');
        java.lang.String str23 = jsonPointer18._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer18);
        int int25 = jsonPointer24.getMatchingIndex();
        boolean boolean26 = jsonPointer14.equals((java.lang.Object) jsonPointer24);
        java.lang.String str27 = jsonPointer24._asString;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) 1);
        int int8 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9._matchingElementIndex;
        int int11 = jsonPointer9.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        boolean boolean6 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 1);
        boolean boolean11 = jsonPointer8.matches();
        java.lang.String str12 = jsonPointer8.getMatchingProperty();
        boolean boolean13 = jsonPointer8.mayMatchElement();
        boolean boolean14 = jsonPointer5.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        int int22 = jsonPointer18.getMatchingIndex();
        boolean boolean23 = jsonPointer16.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer18.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer18._nextSegment;
        boolean boolean26 = jsonPointer5.equals((java.lang.Object) jsonPointer18);
        java.lang.String str27 = jsonPointer18.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        java.lang.Class<?> wildcardClass16 = jsonPointer0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) 1);
        boolean boolean9 = jsonPointer6.matches();
        java.lang.String str10 = jsonPointer6.getMatchingProperty();
        boolean boolean11 = jsonPointer6.mayMatchElement();
        boolean boolean12 = jsonPointer3.equals((java.lang.Object) jsonPointer6);
        java.lang.String str13 = jsonPointer6.toString();
        java.lang.String str14 = jsonPointer6._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        boolean boolean18 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer22.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer22);
        boolean boolean28 = jsonPointer17.equals((java.lang.Object) jsonPointer27);
        boolean boolean29 = jsonPointer1.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer27.matchElement((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer31.matchElement(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(jsonPointer31);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonPointer6.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean7 = jsonPointer2.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        java.lang.String str16 = jsonPointer14.getMatchingProperty();
        boolean boolean17 = jsonPointer14.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonPointer5.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer19.matchElement((int) ' ');
        java.lang.String str24 = jsonPointer19._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer19);
        java.lang.String str26 = jsonPointer25.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer25.tail();
        boolean boolean28 = jsonPointer9.equals((java.lang.Object) jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer();
        int int34 = jsonPointer33._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer33.tail();
        boolean boolean36 = jsonPointer33.mayMatchProperty();
        boolean boolean37 = jsonPointer33.mayMatchElement();
        int int38 = jsonPointer33.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer33);
        boolean boolean40 = jsonPointer39.mayMatchProperty();
        boolean boolean41 = jsonPointer39.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer42 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer39);
        com.fasterxml.jackson.core.JsonPointer jsonPointer43 = jsonPointer39.tail();
        java.lang.String str44 = jsonPointer43._matchingPropertyName;
        boolean boolean45 = jsonPointer9.equals((java.lang.Object) jsonPointer43);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(jsonPointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jsonPointer43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        java.lang.String str8 = jsonPointer4.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer4._nextSegment;
        java.lang.String str10 = jsonPointer4.getMatchingProperty();
        java.lang.String str11 = jsonPointer4._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.mayMatchProperty();
        int int10 = jsonPointer8.getMatchingIndex();
        java.lang.String str11 = jsonPointer8.toString();
        int int12 = jsonPointer8.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        boolean boolean12 = jsonPointer9.mayMatchProperty();
        java.lang.String str13 = jsonPointer9.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchElement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean7 = jsonPointer6.mayMatchElement();
        int int8 = jsonPointer6._matchingElementIndex;
        boolean boolean9 = jsonPointer1.equals((java.lang.Object) int8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str12 = jsonPointer11._matchingPropertyName;
        boolean boolean13 = jsonPointer11.mayMatchElement();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        int int15 = jsonPointer11._matchingElementIndex;
        java.lang.String str16 = jsonPointer11._asString;
        boolean boolean17 = jsonPointer1.equals((java.lang.Object) str16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer1.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = jsonPointer19._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonPointer10._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        boolean boolean3 = jsonPointer1.mayMatchProperty();
        java.lang.String str4 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        java.lang.String str14 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonPointer17.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.tail();
        boolean boolean15 = jsonPointer9.mayMatchProperty();
        boolean boolean16 = jsonPointer9.matches();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        java.lang.String str10 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14.matchElement((int) ' ');
        java.lang.String str19 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer14._nextSegment;
        boolean boolean22 = jsonPointer0.equals((java.lang.Object) jsonPointer21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = jsonPointer21.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        java.lang.String str10 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        int int12 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer3.matchElement(0);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        java.lang.String str11 = jsonPointer0.toString();
        boolean boolean12 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonPointer13._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean7 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        int int12 = jsonPointer8.getMatchingIndex();
        boolean boolean13 = jsonPointer6.equals((java.lang.Object) jsonPointer8);
        java.lang.String str14 = jsonPointer6.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchProperty("hi!");
        java.lang.String str18 = jsonPointer15._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer15.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer20.tail();
        boolean boolean22 = jsonPointer0.equals((java.lang.Object) jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        java.lang.String str7 = jsonPointer6.getMatchingProperty();
        boolean boolean8 = jsonPointer6.matches();
        java.lang.Class<?> wildcardClass9 = jsonPointer6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        boolean boolean7 = jsonPointer5.equals((java.lang.Object) 1L);
        boolean boolean8 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer5.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        boolean boolean12 = jsonPointer11.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonPointer18.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        boolean boolean5 = jsonPointer4.mayMatchElement();
        boolean boolean6 = jsonPointer4.matches();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer15._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0.toString();
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str8 = jsonPointer7.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer9);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer11._asString;
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0.toString();
        boolean boolean7 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        int int8 = jsonPointer1.getMatchingIndex();
        java.lang.Class<?> wildcardClass9 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.Class<?> wildcardClass12 = jsonPointer11.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonPointer6.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean13 = jsonPointer12.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        boolean boolean23 = jsonPointer12.equals((java.lang.Object) jsonPointer22);
        boolean boolean24 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer28);
        java.lang.String str30 = jsonPointer28._asString;
        java.lang.String str31 = jsonPointer28._matchingPropertyName;
        java.lang.String str32 = jsonPointer28._asString;
        boolean boolean33 = jsonPointer12.equals((java.lang.Object) str32);
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer12.matchElement(0);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonPointer28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jsonPointer35);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str11 = jsonPointer10._matchingPropertyName;
        boolean boolean12 = jsonPointer10.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchElement((int) 'a');
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer10);
        boolean boolean16 = jsonPointer1.matches();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str13 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchElement((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        java.lang.String str10 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        boolean boolean12 = jsonPointer0.mayMatchElement();
        int int13 = jsonPointer0.getMatchingIndex();
        int int14 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement(1);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        java.lang.String str14 = jsonPointer11._asString;
        int int15 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer23);
        java.lang.String str26 = jsonPointer25.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer25);
        java.lang.String str28 = jsonPointer25._matchingPropertyName;
        boolean boolean29 = jsonPointer11.equals((java.lang.Object) str28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        boolean boolean8 = jsonPointer3.mayMatchElement();
        java.lang.String str9 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer3.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonPointer7.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchElement((int) (short) 0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer8.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer8);
        java.lang.String str14 = jsonPointer13._matchingPropertyName;
        boolean boolean15 = jsonPointer0.equals((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer0.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonPointer17.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonPointer13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int14 = jsonPointer13.getMatchingIndex();
        java.lang.String str15 = jsonPointer13._matchingPropertyName;
        java.lang.String str16 = jsonPointer13._matchingPropertyName;
        boolean boolean17 = jsonPointer9.equals((java.lang.Object) jsonPointer13);
        java.lang.Class<?> wildcardClass18 = jsonPointer13.getClass();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        boolean boolean11 = jsonPointer0.matches();
        java.lang.String str12 = jsonPointer0._asString;
        java.lang.String str13 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9.getMatchingIndex();
        java.lang.String str11 = jsonPointer9._asString;
        int int12 = jsonPointer9._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        boolean boolean2 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer4._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        int int5 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = jsonPointer6._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean3 = jsonPointer0.equals((java.lang.Object) (short) 1);
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer();
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.tail();
        boolean boolean10 = jsonPointer7.mayMatchProperty();
        boolean boolean11 = jsonPointer7.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7.matchProperty("hi!");
        java.lang.Class<?> wildcardClass14 = jsonPointer7.getClass();
        boolean boolean15 = jsonPointer0.equals((java.lang.Object) jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        java.lang.String str6 = jsonPointer4._asString;
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        boolean boolean9 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10.matchProperty("hi!");
        int int14 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer10.tail();
        boolean boolean16 = jsonPointer8.equals((java.lang.Object) jsonPointer10);
        boolean boolean17 = jsonPointer10.mayMatchElement();
        boolean boolean18 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        java.lang.String str20 = jsonPointer10.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean7 = jsonPointer6.mayMatchElement();
        int int8 = jsonPointer6._matchingElementIndex;
        boolean boolean9 = jsonPointer1.equals((java.lang.Object) int8);
        java.lang.String str10 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jsonPointer10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        int int12 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchElement(0);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9._nextSegment;
        boolean boolean15 = jsonPointer9.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer9.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        java.lang.String str15 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer11.tail();
        java.lang.String str18 = jsonPointer17.toString();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        java.lang.String str17 = jsonPointer16.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer16);
        java.lang.String str20 = jsonPointer16.toString();
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement((int) (byte) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2.tail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchElement(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonPointer7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        int int9 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7._nextSegment;
        int int11 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean13 = jsonPointer12.matches();
        boolean boolean14 = jsonPointer12.matches();
        java.lang.String str15 = jsonPointer12.getMatchingProperty();
        boolean boolean16 = jsonPointer7.equals((java.lang.Object) str15);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        boolean boolean10 = jsonPointer3.matches();
        java.lang.String str11 = jsonPointer3._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        int int12 = jsonPointer11.getMatchingIndex();
        java.lang.String str13 = jsonPointer11._asString;
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        boolean boolean15 = jsonPointer11.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        java.lang.String str10 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str12 = jsonPointer3._matchingPropertyName;
        java.lang.String str13 = jsonPointer3._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        int int5 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int18 = jsonPointer17.getMatchingIndex();
        java.lang.String str19 = jsonPointer17._matchingPropertyName;
        boolean boolean20 = jsonPointer17.mayMatchProperty();
        boolean boolean21 = jsonPointer17.mayMatchProperty();
        java.lang.String str22 = jsonPointer17._matchingPropertyName;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = jsonPointer15.equals((java.lang.Object) str22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchElement((int) (short) 10);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        boolean boolean13 = jsonPointer12.mayMatchProperty();
        boolean boolean14 = jsonPointer12.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer12.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer12._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        java.lang.String str19 = jsonPointer17._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        boolean boolean4 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        boolean boolean15 = jsonPointer11.mayMatchElement();
        int int16 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        boolean boolean18 = jsonPointer17.mayMatchProperty();
        boolean boolean19 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.tail();
        java.lang.String str22 = jsonPointer21._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        boolean boolean26 = jsonPointer21.mayMatchElement();
        boolean boolean27 = jsonPointer0.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13._nextSegment;
        int int15 = jsonPointer13.getMatchingIndex();
        java.lang.Class<?> wildcardClass16 = jsonPointer13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str11 = jsonPointer10._matchingPropertyName;
        boolean boolean12 = jsonPointer10.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchElement((int) 'a');
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer10);
        int int16 = jsonPointer10.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        boolean boolean16 = jsonPointer9.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.mayMatchProperty();
        boolean boolean10 = jsonPointer8.matches();
        java.lang.String str11 = jsonPointer8.toString();
        java.lang.String str12 = jsonPointer8.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        boolean boolean9 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        java.lang.String str11 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean13 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonPointer9._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer3.tail();
        java.lang.String str12 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer3.matchElement((int) (byte) 10);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        int int4 = jsonPointer0.getMatchingIndex();
        int int5 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.toString();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        java.lang.Class<?> wildcardClass7 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        boolean boolean10 = jsonPointer9.mayMatchProperty();
        int int11 = jsonPointer9.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.tail();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("");
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonPointer16.equals(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        boolean boolean16 = jsonPointer15.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer15.matchProperty("");
        java.lang.String str19 = jsonPointer15._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean8 = jsonPointer7.matches();
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) boolean8);
        int int10 = jsonPointer0.getMatchingIndex();
        boolean boolean11 = jsonPointer0.matches();
        java.lang.String str12 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        boolean boolean12 = jsonPointer9.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        java.lang.String str14 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        java.lang.String str16 = jsonPointer13._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        boolean boolean7 = jsonPointer3.mayMatchProperty();
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        boolean boolean10 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str13 = jsonPointer12._matchingPropertyName;
        boolean boolean14 = jsonPointer12.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12._nextSegment;
        java.lang.String str16 = jsonPointer12.toString();
        boolean boolean17 = jsonPointer3.equals((java.lang.Object) jsonPointer12);
        java.lang.String str18 = jsonPointer12.getMatchingProperty();
        java.lang.Class<?> wildcardClass19 = jsonPointer12.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("");
        int int9 = jsonPointer1.getMatchingIndex();
        java.lang.String str10 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

