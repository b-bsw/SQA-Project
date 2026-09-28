package org.apache.commons.csv;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'inputStream' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'path' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 0L, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 10L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (-1L), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '#', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 100L, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (byte) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) ' ', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

