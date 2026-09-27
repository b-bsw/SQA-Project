package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((hi!))))))", "((((((((((((((hi!))))))))))))))", (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(Unknown class name)", "((((((Unknown class name))))))", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((hi!)))))))))))))))))", "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((hi!)))))))))))))))))))))))))", "((((((((((((((((Not declared as a constructor))))))))))))))))", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((hi!))))))))))))))))))))", "((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((Not declared as a constructor))", "(((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((Not declared as a type name))))))))))", "((((((((hi!))))))))", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((Not declared as a type name)))))", "(((((((((((((Named type with empty name component)))))))))))))", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))", "(((((((((((((Not declared as a type name)))))))))))))", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((hi!))", "((((Not declared as a type name))))", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((hi!))))))))))))))))))))", "Unknown class name", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((hi!)))))))))))", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((Named type with empty name component)))", "((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((hi!)))))))))))))", "", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((Named type with empty name component))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((()))))))))))))))))))", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Unknown class name))))))))", "(((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((Unknown class name))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))))))", (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((hi!)))))))))))))))))", "(((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))", "(((Not declared as a type name)))", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((())))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))))", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))", "(((((((((((((((Not declared as a constructor)))))))))))))))", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))))", "(Not declared as a constructor)", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Unknown class name))))))))", "((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))", (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((((((((((((((hi!))))))))))))))))))))))))", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))", "(((((Unknown class name)))))", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))))))))))", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((Unknown class name)))))))))))))))", "((((((((Not declared as a constructor))))))))", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))", "((((((((((()))))))))))", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))", 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))", "(((((((((((((((((hi!)))))))))))))))))", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "(((((((Not declared as a type name)))))))", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))))", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((hi!))))))))))))))", "((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((Not declared as a constructor))))))))))", "((((((((Not declared as a type name))))))))", (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((())))))))))))))))))))))", "(((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))", "(((((((((((((hi!)))))))))))))", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((Named type with empty name component))))))))))))))", "(((((((((((((((((hi!)))))))))))))))))", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((())))))))))))", "((((((Unknown class name))))))", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((Not declared as a constructor))))))))))))))))))))", "(((((((((((((((((((hi!)))))))))))))))))))", (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))", (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))", "((((((Named type with empty name component))))))", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "Unknown class name", "((((((((((((((((((Not declared as a constructor))))))))))))))))))", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((())))))))))))))))))))))))", (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))))))))", "(Not declared as a type name)", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((Unknown class name))))))", "(((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))", (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))", "(((((((((((Not declared as a type name)))))))))))", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(Not declared as a type name)", "((((((((((((((((((((((Unknown class name))))))))))))))))))))))", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))", "((((((((((Named type with empty name component))))))))))", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((Not declared as a constructor)))))))))))", "(((((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))))", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((Not declared as a type name)))))))", "(((((((Not declared as a type name)))))))", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))", "((((((((((((hi!))))))))))))", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", "Named type with empty name component", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))", "(((((((((((())))))))))))", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))", "((((((((((((((hi!))))))))))))))", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((())))))))))", "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((Not declared as a type name))))))))))))", "((((((((((((((((((((Not declared as a type name))))))))))))))))))))", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((()))))))", "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((()))))))", "(((Not declared as a type name)))", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((Not declared as a constructor))))", "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((())))))))))", "(((((((((((((((((((())))))))))))))))))))", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))", "((((((((((()))))))))))", 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((())))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((Named type with empty name component))))))))))))))))))", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((hi!))))))))))))))))))))))))", "(((Not declared as a constructor)))", (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((hi!))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((Not declared as a type name))))))))))))))))))", "((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((Not declared as a type name)))))))))))))", "(((((((((((((((Unknown class name)))))))))))))))", (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))", "((((((()))))))", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((Named type with empty name component)))))))))))))))))", "((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((Not declared as a type name))))", "(((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Not declared as a constructor))))))))", "(hi!)", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((Unknown class name)))))))))))))", "((((((((((((((((()))))))))))))))))", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((()))))))))))))", "Named type with empty name component", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((hi!))))))))", "((((((((((((Not declared as a constructor))))))))))))", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((Unknown class name)))", "(((((((((((((((((Not declared as a type name)))))))))))))))))", (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))", 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((hi!)))))))))", "((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))))))))))))))))", (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))", 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))))", "((((Not declared as a type name))))", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((()))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))))", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((()))))))))))))))))))))))", "(((((((((((((((Not declared as a type name)))))))))))))))", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))", "(((((((((((Unknown class name)))))))))))", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))", "Unknown class name", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))", (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((hi!)))))))))", "((((((((((((((((((()))))))))))))))))))", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((Unknown class name))))", "(((((Named type with empty name component)))))", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))", "((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((Not declared as a type name)))))))))))))))))", "(((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((hi!))))))))))))", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((Not declared as a constructor)))", "(((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((Unknown class name))))))))))", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((Unknown class name)))))))))))))))", "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))", "(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))", (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((Not declared as a type name))))))", "((((((((((((Unknown class name))))))))))))", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((hi!)))))))))))))))))))))", "(((((((())))))))", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((Named type with empty name component))", "((((((((((((((((((((((hi!))))))))))))))))))))))", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((Not declared as a type name)))))))))))))))", "(((((((((((((((Not declared as a constructor)))))))))))))))", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((hi!))))))", "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((Not declared as a constructor)))", "", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))", "(((((hi!)))))", (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((Not declared as a type name))))))", "(((((((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))))))", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Unknown class name))))))))", "(((((((((((((((((((Unknown class name)))))))))))))))))))", 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((hi!)))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "Named type with empty name component", "(((((Not declared as a constructor)))))", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(Not declared as a constructor)", "(((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", "", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((Named type with empty name component)))))))))))))))))))", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((Unknown class name))))))))))))))", "((((((((Not declared as a constructor))))))))", 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))", (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((Not declared as a constructor))))))))))))))", "", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))", "((((Unknown class name))))", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((Not declared as a constructor))))))))))", "(((((((((((((((hi!)))))))))))))))", (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((()))))))))))))))))))))))))", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((Unknown class name)))))", "((((((((((((((hi!))))))))))))))", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))))))))))))))))))))))))))", "((Not declared as a constructor))", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))", 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))", "(((((((((((((hi!)))))))))))))", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))))))))", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((Not declared as a type name))))))))))))", "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((Named type with empty name component)))))))", "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))))))))))))", "(((((((Unknown class name)))))))", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((hi!)))))))))))))))", "(Not declared as a type name)", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))))))))))))))))))))", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((hi!)))))))))))", "((((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))))", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((()))))))))))))))))))", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((Not declared as a constructor)))))))))))))))))))))", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))", "(((((((((((((((((((((Unknown class name)))))))))))))))))))))", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((Not declared as a constructor)))))))))))))))))", "(((((((((Unknown class name)))))))))", 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))", "((((((((Named type with empty name component))))))))", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "(((((((((((((((((Unknown class name)))))))))))))))))", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))", "((((((((((((((((((((((()))))))))))))))))))))))", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "(((((((((((((Not declared as a constructor)))))))))))))", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))" + "'", str1, "(((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))))))))", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((Not declared as a constructor))))))))", "((((((((((((((((((((((((((((((((((((((Named type with empty name component))))))))))))))))))))))))))))))))))))))", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((Not declared as a type name))", "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((hi!))))))))))))))))))))))))))", "((((((((((((((((((((Unknown class name))))))))))))))))))))", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((Not declared as a type name)))))))))))))))))))))))))))))))))))))", "hi!", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))", "(Unknown class name)", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((Unknown class name))))))))))))", "(((((((((((((((((((((Not declared as a type name)))))))))))))))))))))", 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a type name))))))))))))))))))))))))))))))", "", (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))", "((((((((((((((((((((((((((((((((((((((Not declared as a constructor))))))))))))))))))))))))))))))))))))))", (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((((((((((((((((((Unknown class name)))))))))))))))))))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))", 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((((((Named type with empty name component)))))))))))))))))))))))))", "(((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((Not declared as a constructor)))))))))))", "((((hi!))))", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "(((((((((((((((((((((Named type with empty name component)))))))))))))))))))))", "((((((((((hi!))))))))))", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((()))))))))))))", "((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((Unknown class name))))", "((((((((((((((((((((((((((((((((((Unknown class name))))))))))))))))))))))))))))))))))", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))", "((((((((((((((((((Named type with empty name component))))))))))))))))))", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("(((((((((((((((((((((((((((((((((((((((((hi!)))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "((((((((((((((((((((((((((((((((((((((((((hi!))))))))))))))))))))))))))))))))))))))))))");
    }
}

