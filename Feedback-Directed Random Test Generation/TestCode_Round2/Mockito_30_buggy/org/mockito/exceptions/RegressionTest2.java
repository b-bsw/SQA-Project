package org.mockito.exceptions;

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
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?32 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) -1, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) -1, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((-1), 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(10, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) 'a', (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 10, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 1, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 0, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 100, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 10, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 0, (int) '4', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?0 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 10, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(100, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 10, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 0 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(100, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(1, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) ' ', (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 100, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(100, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 35 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (int) (short) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 0, 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 1, (int) (byte) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations(1, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(100, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 0, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 10, (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '#', (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) -1, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '4', 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) '#', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (int) ' ', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) (short) 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 52 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) (byte) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 32 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) 'a', (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, 100, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?52 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((-1), (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?-1 matchers expected, 100 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (short) 100, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 10, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?97 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (int) (short) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) -1, (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (byte) 0, (int) 'a', printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?10 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 0, (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((-1), (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', (int) (short) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) -1, (int) (byte) 0, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) (byte) 10, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder((int) '4', (int) (short) 1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) (short) 1, (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) '#', (-1), printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(1, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?1 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?32 matchers expected, -1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers(100, 1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 1 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocations((int) ' ', (int) (byte) -1, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // The following exception was thrown during execution in test generation
        try {
            reporter0.invalidUseOfMatchers((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Invalid use of argument matchers!?100 matchers expected, 10 recorded.?This exception may occur if matchers are combined with raw values:?    //incorrect:?    someMethod(anyObject(), \"raw String\");?When using matchers, all arguments have to be provided by matchers.?For example:?    //correct:?    someMethod(anyObject(), eq(\"String by matcher\"));??For more info see javadoc for Matchers class.");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.PrintableInvocation printableInvocation3 = null;
        org.mockito.internal.debugging.Location location4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reporter0.tooManyActualInvocationsInOrder(10, (int) (byte) 10, printableInvocation3, location4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

