package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a type name", node2, arrowType3, objectType4, "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((Unknown class name))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Unknown class name))))))))", node2, arrowType3, objectType4, "(((((((((((((((((Not declared as a type name)))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((())))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Not declared as a constructor)))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(Unknown class name)", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Named type with empty name component)", node2, arrowType3, objectType4, "((((((((((hi!))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Not declared as a type name)))))))))))", node2, arrowType3, objectType4, "(((((Unknown class name)))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((()))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Named type with empty name component)", node2, arrowType3, objectType4, "(((((((((((((((Not declared as a type name)))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Not declared as a type name))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a constructor))))))", node2, arrowType3, objectType4, "(((((((((((((((((())))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Not declared as a type name)))))))))", node2, arrowType3, objectType4, "(((((((())))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a type name))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((()))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((Named type with empty name component)))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Named type with empty name component", node2, arrowType3, objectType4, "(((((())))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Unknown class name)))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Unknown class name))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((hi!)))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a constructor))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((())))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((hi!))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((hi!))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Named type with empty name component)))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a constructor", node2, arrowType3, objectType4, "((((((((((((((()))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Unknown class name))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((Not declared as a constructor))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((hi!)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((hi!)))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "()", node2, arrowType3, objectType4, "(((((((((((((())))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", node2, arrowType3, objectType4, "((Unknown class name))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((()))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Named type with empty name component))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((hi!))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((()))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "Not declared as a type name", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((())))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((()))))))))))))))))))))))", node2, arrowType3, objectType4, "(Not declared as a constructor)", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((Unknown class name))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((Not declared as a constructor)))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Unknown class name)", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Unknown class name))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((Unknown class name))))))))))))))))", node2, arrowType3, objectType4, "(())", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Not declared as a constructor))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((()))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((Not declared as a constructor))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((hi!))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((Named type with empty name component)))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Unknown class name)))))))))", node2, arrowType3, objectType4, "(((((((Not declared as a constructor)))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a constructor", node2, arrowType3, objectType4, "(((hi!)))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((Named type with empty name component))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((Not declared as a type name)))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((Not declared as a type name))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((hi!)))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((())))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((())))))", node2, arrowType3, objectType4, "(((((((((((((((((())))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((()))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((hi!))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a constructor))", node2, arrowType3, objectType4, "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((Not declared as a constructor)))", node2, arrowType3, objectType4, "((((((((Not declared as a type name))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Named type with empty name component)))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((())))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((Named type with empty name component))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((hi!)))))))))))))))))))", node2, arrowType3, objectType4, "(((((Not declared as a type name)))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((Named type with empty name component)))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((hi!))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((hi!)))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a constructor))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((())))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((Not declared as a type name))))))))))))", node2, arrowType3, objectType4, "(((((((Not declared as a constructor)))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((Named type with empty name component))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((()))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Not declared as a type name))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((hi!))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((hi!))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((())))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a type name))))))", node2, arrowType3, objectType4, "(((((((((((((((((((())))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((Unknown class name))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a type name))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((Unknown class name)))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((Named type with empty name component))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((hi!))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", node2, arrowType3, objectType4, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((Named type with empty name component)))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Not declared as a type name))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((()))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((Unknown class name)))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Not declared as a type name))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((())))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((())))))))))))))))", node2, arrowType3, objectType4, "(((((((hi!)))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Not declared as a type name)))))))))))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Unknown class name)))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((hi!))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((()))))))))))))))))", node2, arrowType3, objectType4, "(((hi!)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((hi!))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((hi!)))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((()))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((hi!))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Not declared as a constructor))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Not declared as a type name))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Not declared as a type name))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((())))))", node2, arrowType3, objectType4, "((((((((((((()))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(hi!)", node2, arrowType3, objectType4, "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a type name))", node2, arrowType3, objectType4, "(((Named type with empty name component)))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Named type with empty name component)))))", node2, arrowType3, objectType4, "(((((((((((((((((Not declared as a type name)))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Named type with empty name component))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((hi!))))))))))))))))))))", node2, arrowType3, objectType4, "((Not declared as a constructor))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Not declared as a type name)))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Named type with empty name component))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Not declared as a constructor))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((hi!)))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Named type with empty name component))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "Not declared as a constructor", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Not declared as a type name)))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((Not declared as a type name))))))))))))", node2, arrowType3, objectType4, "((((((Unknown class name))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((Named type with empty name component))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "hi!", node2, arrowType3, objectType4, "((((((((((Not declared as a type name))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "hi!", node2, arrowType3, objectType4, "(((((((((((((((((((((())))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((Unknown class name))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a type name))", node2, arrowType3, objectType4, "((((((((((((((hi!))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((Named type with empty name component)))))))", node2, arrowType3, objectType4, "(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((hi!)))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((hi!)))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((Unknown class name)))))))", node2, arrowType3, objectType4, "((((((((((Named type with empty name component))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Unknown class name)))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((Unknown class name)))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((hi!))))", node2, arrowType3, objectType4, "(((((((((((hi!)))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Not declared as a type name)))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((hi!))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Named type with empty name component)", node2, arrowType3, objectType4, "((((((((hi!))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((()))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((hi!))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Not declared as a type name)))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((hi!)))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((Not declared as a type name))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((Named type with empty name component))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Named type with empty name component))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Named type with empty name component", node2, arrowType3, objectType4, "(((((((Named type with empty name component)))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((hi!))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Unknown class name))", node2, arrowType3, objectType4, "(((((((((((((((((((((())))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Not declared as a constructor))))))))))", node2, arrowType3, objectType4, "((((Unknown class name))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a type name))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((Unknown class name))))))))))))", node2, arrowType3, objectType4, "((((((((Named type with empty name component))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((()))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Not declared as a constructor)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Named type with empty name component))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((Not declared as a constructor)))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((Named type with empty name component)))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Unknown class name))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((hi!))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Named type with empty name component))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((hi!))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Not declared as a type name)))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Named type with empty name component)))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "(Named type with empty name component)", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((()))))))", node2, arrowType3, objectType4, "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((())))))))))))))))))))", node2, arrowType3, objectType4, "((((()))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(hi!)", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((hi!)))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Not declared as a constructor))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((()))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((Named type with empty name component)))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Not declared as a type name))))", node2, arrowType3, objectType4, "((((((((((((((((((((((hi!))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((Named type with empty name component)))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((hi!))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((Not declared as a type name))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((Unknown class name)))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Not declared as a constructor))))))))))))))", node2, arrowType3, objectType4, "((Not declared as a constructor))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((())))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Not declared as a constructor)))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Named type with empty name component))))", node2, arrowType3, objectType4, "((((((((hi!))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((())))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Unknown class name))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", node2, arrowType3, objectType4, "((((((hi!))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((Unknown class name))))))))))", node2, arrowType3, objectType4, "(((Not declared as a type name)))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "Not declared as a constructor", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = com.google.javascript.rhino.jstype.FunctionType.forInterface(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))", node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((Not declared as a constructor))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((Not declared as a type name))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((hi!)))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Named type with empty name component)))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Not declared as a type name))))))))))))))", node2, arrowType3, objectType4, "(((((())))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((Named type with empty name component)))))))))", node2, arrowType3, objectType4, "Not declared as a type name", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((hi!))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Named type with empty name component)))))", node2, arrowType3, objectType4, "((((((((((((((Not declared as a type name))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((()))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Named type with empty name component))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((())))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Not declared as a constructor)))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((Unknown class name)))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((()))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((Named type with empty name component)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Unknown class name)))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((())))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", node2, arrowType3, objectType4, "Named type with empty name component", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((())))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(())", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Unknown class name)))))", node2, arrowType3, objectType4, "((((((((((Not declared as a type name))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Not declared as a constructor)", node2, arrowType3, objectType4, "(((((((((Not declared as a constructor)))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((hi!))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((hi!)))))))))", node2, arrowType3, objectType4, "(Not declared as a constructor)", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Not declared as a type name))))))))))))))", node2, arrowType3, objectType4, "(((())))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((hi!))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a constructor))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Unknown class name", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((Not declared as a constructor)))))))", node2, arrowType3, objectType4, "(((((((((((((())))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((Named type with empty name component)))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "Not declared as a type name", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(())", node2, arrowType3, objectType4, "((((((()))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((())))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((hi!)))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Named type with empty name component)))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a type name", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((hi!)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((hi!)))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(Not declared as a type name)", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a constructor))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Named type with empty name component))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((()))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((()))))))))", node2, arrowType3, objectType4, "(((hi!)))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a constructor))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Named type with empty name component))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((Unknown class name)))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Not declared as a constructor)))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "(((((((((((Named type with empty name component)))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Named type with empty name component))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((hi!)))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((Named type with empty name component)))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((())))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((Not declared as a constructor)))))", node2, arrowType3, objectType4, "(((((((((((((((())))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((hi!)))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((Not declared as a constructor))))))))", node2, arrowType3, objectType4, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "Not declared as a constructor", node2, arrowType3, objectType4, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((hi!))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "", node2, arrowType3, objectType4, "((((((((((((hi!))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((Named type with empty name component)))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((())))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", node2, arrowType3, objectType4, "((((((((((Unknown class name))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((Unknown class name)))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((()))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", node2, arrowType3, objectType4, "(Not declared as a type name)", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Not declared as a type name))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((hi!)))", node2, arrowType3, objectType4, "(((((((((((((Unknown class name)))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(())", node2, arrowType3, objectType4, "((((((((((((((((Unknown class name))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((())))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((hi!)))))))", node2, arrowType3, objectType4, "(((((Not declared as a constructor)))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((Not declared as a type name)))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((Named type with empty name component)))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Not declared as a constructor))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))", node2, arrowType3, objectType4, "((Named type with empty name component))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((hi!)))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Named type with empty name component))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((Unknown class name))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((()))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((())))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((Not declared as a constructor))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((()))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((Not declared as a constructor))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Not declared as a type name))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((Not declared as a constructor))))))", node2, arrowType3, objectType4, "(((((((((((((Not declared as a constructor)))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((Not declared as a constructor))))))))))))))", node2, arrowType3, objectType4, "((((((()))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((Unknown class name))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((Not declared as a type name))))", node2, arrowType3, objectType4, "((((((()))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((Unknown class name))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((hi!)))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((())))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((Not declared as a type name)))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((()))))))))", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))", node2, arrowType3, objectType4, "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.ArrowType arrowType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = new com.google.javascript.rhino.jstype.FunctionType(jSTypeRegistry0, "(((((((((((((((((((((((((())))))))))))))))))))))))))", node2, arrowType3, objectType4, "(((((((((((((((((((Unknown class name)))))))))))))))))))", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

