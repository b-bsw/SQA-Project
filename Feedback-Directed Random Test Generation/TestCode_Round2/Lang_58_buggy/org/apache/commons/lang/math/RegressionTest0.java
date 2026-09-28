package org.apache.commons.lang.math;

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
        java.lang.Short short0 = org.apache.commons.lang.math.NumberUtils.SHORT_ONE;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0 == (short) 1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 0, (-1L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, (float) 0L, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        java.lang.Class<?> wildcardClass1 = numberUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.Short short0 = org.apache.commons.lang.math.NumberUtils.SHORT_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) -1 + "'", short0 == (short) -1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.DOUBLE_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + (-1.0d) + "'", double0 == (-1.0d));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang.math.NumberUtils.createDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.Byte byte0 = org.apache.commons.lang.math.NumberUtils.BYTE_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) -1 + "'", byte0 == (byte) -1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, (float) 0L, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang.math.NumberUtils.createNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.DOUBLE_ZERO;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 0, (long) '#', (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.Byte byte0 = org.apache.commons.lang.math.NumberUtils.BYTE_ZERO;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Integer int0 = org.apache.commons.lang.math.NumberUtils.INTEGER_ONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.LONG_ZERO;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.LONG_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 10, (long) (byte) -1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.Integer int0 = org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.FLOAT_ZERO;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(35L, 100L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) (byte) 10, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0.0f, (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) ' ', 10L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.LONG_ONE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100.0f, (double) (short) 1, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.FLOAT_ONE;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        java.lang.Class<?> wildcardClass15 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((-1), (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Integer int0 = org.apache.commons.lang.math.NumberUtils.INTEGER_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) (short) 100, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray7 = null;
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) (-1), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.DOUBLE_ONE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, 10L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.Short short0 = org.apache.commons.lang.math.NumberUtils.SHORT_ZERO;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, (long) (short) 0, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang.math.NumberUtils.createLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int1 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, 32, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) ' ', (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1), 0.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, (-1.0f), (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang.math.NumberUtils.createNumber("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        java.lang.Class<?> wildcardClass28 = byteArray17.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang.math.NumberUtils.createLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1), 0.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) (byte) 1, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int1 = org.apache.commons.lang.math.NumberUtils.stringToInt("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 10, (double) (short) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.FLOAT_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + (-1.0f) + "'", float0 == (-1.0f));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 100, (float) (byte) 10, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.Byte byte0 = org.apache.commons.lang.math.NumberUtils.BYTE_ONE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0 == (byte) 1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1.0f, (double) 0, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang.math.NumberUtils.createDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) ' ', (double) (short) 0, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(1.0d, 0.0d, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 10, (float) (short) -1, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) (byte) 100, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray12);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray12);
        java.lang.Class<?> wildcardClass16 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 1, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10L, (float) (byte) 10, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 100, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, 0.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '#', (float) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 100, (long) (byte) 10, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (-1), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 10, (double) 32, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1), (float) 35L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, (long) (byte) 10, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0L, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35.0f, (double) 32, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) (short) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', 0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), 52.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100L, (double) (short) 1, 97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 100, (double) (-1L), (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0.0f, (double) 1.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) (short) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, (float) 0, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 100, (double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double double23 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray17);
        double[] doubleArray29 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray33 = new double[] { (byte) 10, 1, 1L };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        double[] doubleArray36 = new double[] { 10L };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray36);
        double[] doubleArray42 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray46 = new double[] { (byte) 10, 1, 1L };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        double[] doubleArray49 = new double[] { 10L };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray49);
        double[] doubleArray55 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray59 = new double[] { (byte) 10, 1, 1L };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray59);
        double double61 = org.apache.commons.lang.math.NumberUtils.min(doubleArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray55);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray46);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray46);
        java.lang.Class<?> wildcardClass65 = doubleArray17.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0, (-1.0f), 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            byte byte28 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 10, (long) (byte) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(52.0d, (double) 1.0f, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 10, (double) 10.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, (float) 32, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray21 = new float[] { 1.0f, (short) 100, 0L };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray26 = new float[] { 1.0f, (short) 100, 0L };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray26);
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray30 = new float[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray30);
        // The following exception was thrown during execution in test generation
        try {
            float float33 = org.apache.commons.lang.math.NumberUtils.max(floatArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100.0f, (double) ' ', (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) '#', (float) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        long[] longArray18 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray18);
        java.lang.Class<?> wildcardClass21 = longArray18.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, 0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(100.0d, (double) '4', (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) (short) -1, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32, (double) 32L, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(32.0d, (double) (byte) 10, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), 1L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, 52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        short[] shortArray18 = new short[] { (byte) 0, (short) 0 };
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray18);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray18);
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 100.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(1.0f, (float) (short) 100, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, 35L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) (short) 1, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (-1L), (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        java.lang.Class<?> wildcardClass16 = shortArray14.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) 35, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, (float) 1L, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, (int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray5);
        java.lang.Class<?> wildcardClass19 = floatArray5.getClass();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 35.0f + "'", float18 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray7 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray7);
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (int) (short) 0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100L, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double[] doubleArray24 = new double[] { 10L };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray24);
        double[] doubleArray30 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray34 = new double[] { (byte) 10, 1, 1L };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double double36 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray30);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray21);
        java.lang.Class<?> wildcardClass39 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, (long) (byte) -1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35, (float) (byte) 10, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) 10, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0, (double) (short) -1, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        java.lang.Class<?> wildcardClass41 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(1.0f, (float) 35, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray7 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray7);
        int[] intArray16 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray20 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        java.lang.Class<?> wildcardClass24 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1, (double) 100.0f, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, (float) 100, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 100L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray7 = null;
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte16 = org.apache.commons.lang.math.NumberUtils.min(byteArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = org.apache.commons.lang.math.NumberUtils.max(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (long) (byte) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 10, (float) 'a', (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) 0, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, (float) ' ', (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, (-1.0f), (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double[] doubleArray17 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray21 = new double[] { (byte) 10, 1, 1L };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double double23 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray17);
        double[] doubleArray29 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray33 = new double[] { (byte) 10, 1, 1L };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        double[] doubleArray36 = new double[] { 10L };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray36);
        double[] doubleArray42 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray46 = new double[] { (byte) 10, 1, 1L };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        double[] doubleArray49 = new double[] { 10L };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray49);
        double[] doubleArray55 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray59 = new double[] { (byte) 10, 1, 1L };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray59);
        double double61 = org.apache.commons.lang.math.NumberUtils.min(doubleArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray55);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray46);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray46);
        double double65 = org.apache.commons.lang.math.NumberUtils.max(doubleArray46);
        double double66 = org.apache.commons.lang.math.NumberUtils.min(doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) -1, (float) 1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, (long) 100, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) (byte) 100, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 0, (double) (short) -1, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) -1, (float) 10, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '4', (float) 32L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, (float) (byte) 0, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) ' ', (long) 'a', (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) -1, (long) ' ', (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 1, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 10, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, (long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0L, (double) 32L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double[] doubleArray25 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray29 = new double[] { (byte) 10, 1, 1L };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray29);
        double double31 = org.apache.commons.lang.math.NumberUtils.min(doubleArray25);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray25);
        double[] doubleArray37 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray41 = new double[] { (byte) 10, 1, 1L };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray44 = new double[] { 10L };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray44);
        double[] doubleArray50 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray54 = new double[] { (byte) 10, 1, 1L };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray50, doubleArray54);
        double[] doubleArray57 = new double[] { 10L };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray57);
        double[] doubleArray63 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray67 = new double[] { (byte) 10, 1, 1L };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray63, doubleArray67);
        double double69 = org.apache.commons.lang.math.NumberUtils.min(doubleArray63);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray63);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray54);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray54);
        double double73 = org.apache.commons.lang.math.NumberUtils.max(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 97.0d + "'", double73 == 97.0d);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, 0.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(52.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) (short) -1, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), 35.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1L, (float) ' ', (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, (long) (byte) -1, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(100.0f, (float) '4', 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) (short) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray28);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        byte byte47 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte54 = org.apache.commons.lang.math.NumberUtils.min(byteArray53);
        byte byte55 = org.apache.commons.lang.math.NumberUtils.min(byteArray53);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray61);
        byte[] byteArray63 = null;
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray63);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte72 = org.apache.commons.lang.math.NumberUtils.min(byteArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray65);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray65);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte83 = org.apache.commons.lang.math.NumberUtils.min(byteArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray76, byteArray82);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray76);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray76);
        // The following exception was thrown during execution in test generation
        try {
            byte byte87 = org.apache.commons.lang.math.NumberUtils.max(byteArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte47 + "' != '" + (byte) -1 + "'", byte47 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) -1 + "'", byte54 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) -1 + "'", byte55 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -1 + "'", byte62 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) -1 + "'", byte72 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) -1 + "'", byte83 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        long[] longArray6 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray6);
        java.lang.Class<?> wildcardClass9 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertArrayEquals(longArray6, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        java.lang.Class<?> wildcardClass42 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, (long) 32, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray23 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray27 = new float[] { 1.0f, (short) 100, 0L };
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray27);
        float[] floatArray32 = new float[] { 1.0f, (short) 100, 0L };
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray27, floatArray32);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray27);
        float[] floatArray39 = new float[] { 1.0f, (short) 100, 0L };
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        float[] floatArray44 = new float[] { 1.0f, (short) 100, 0L };
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray44);
        float[] floatArray50 = new float[] { 1.0f, (short) 100, 0L };
        float float51 = org.apache.commons.lang.math.NumberUtils.min(floatArray50);
        float[] floatArray55 = new float[] { 1.0f, (short) 100, 0L };
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray50, floatArray55);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray50);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray50);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray23);
        float float61 = org.apache.commons.lang.math.NumberUtils.max(floatArray9);
        float float62 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertArrayEquals(floatArray27, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertArrayEquals(floatArray44, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertArrayEquals(floatArray50, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, (int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 100, (float) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, (float) (byte) 100, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, (float) (short) 10, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, 32L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '4', (double) (byte) 1, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        int[] intArray47 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray54 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray58 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray58);
        int int60 = org.apache.commons.lang.math.NumberUtils.max(intArray54);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray54);
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray54);
        int int63 = org.apache.commons.lang.math.NumberUtils.max(intArray54);
        int[] intArray70 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray74 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(intArray70, intArray74);
        int[] intArray82 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray86 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray82, intArray86);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(intArray74, intArray82);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray82);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray82);
        java.lang.Class<?> wildcardClass91 = intArray82.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) 32, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100L, 32.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, (-1L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, (double) (byte) -1, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, (float) '4', (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52.0f, (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 10, (double) '#', (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray18 = new int[] { (byte) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int[] intArray24 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray24);
        int[] intArray33 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray37 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray33);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray33);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int[] intArray43 = null;
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray43);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10, 97.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, 10.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 32, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray12 = new float[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray12);
        java.lang.Class<?> wildcardClass14 = floatArray12.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 10, (double) 100L, 97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long long11 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        java.lang.Class<?> wildcardClass12 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 10, (long) 52, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, (long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52, (float) 32L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray18 = new double[] { (byte) 10, 1, 1L };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray14);
        double double21 = org.apache.commons.lang.math.NumberUtils.min(doubleArray14);
        double[] doubleArray26 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray30 = new double[] { (byte) 10, 1, 1L };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        double double32 = org.apache.commons.lang.math.NumberUtils.min(doubleArray26);
        double double33 = org.apache.commons.lang.math.NumberUtils.min(doubleArray26);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray26);
        double[] doubleArray39 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray43 = new double[] { (byte) 10, 1, 1L };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray43);
        double[] doubleArray46 = new double[] { 10L };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray43, doubleArray46);
        double double48 = org.apache.commons.lang.math.NumberUtils.max(doubleArray46);
        double[] doubleArray53 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray57 = new double[] { (byte) 10, 1, 1L };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray57);
        double[] doubleArray60 = new double[] { 10L };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray60);
        double[] doubleArray66 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray70 = new double[] { (byte) 10, 1, 1L };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray66, doubleArray70);
        double[] doubleArray73 = new double[] { 10L };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray70, doubleArray73);
        double[] doubleArray79 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray83 = new double[] { (byte) 10, 1, 1L };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray79, doubleArray83);
        double double85 = org.apache.commons.lang.math.NumberUtils.min(doubleArray79);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray70, doubleArray79);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray70);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray46, doubleArray57);
        double double89 = org.apache.commons.lang.math.NumberUtils.max(doubleArray46);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray46);
        java.lang.Class<?> wildcardClass91 = doubleArray46.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray11 = new long[] { (byte) -1 };
        long long12 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        long[] longArray15 = new long[] { (byte) -1 };
        long long16 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray15);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        long[] longArray20 = new long[] { ' ' };
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray20);
        java.lang.Class<?> wildcardClass25 = longArray11.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 32L });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(52.0d, (double) (byte) 1, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) '4', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '#', (double) (byte) 100, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int[] intArray4 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int6 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int[] intArray8 = new int[] { (byte) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.max(intArray8);
        int[] intArray16 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray20 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray8);
        int[] intArray25 = new int[] { (byte) -1 };
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray25);
        int[] intArray31 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int32 = org.apache.commons.lang.math.NumberUtils.max(intArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray31);
        int[] intArray40 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray44 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray40);
        int[] intArray54 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray61 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray65 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray65);
        int int67 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray61);
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int int70 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        int[] intArray77 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray81 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(intArray77, intArray81);
        int[] intArray89 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray93 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray89, intArray93);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(intArray81, intArray89);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray89);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray89);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray40);
        int int99 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 35 + "'", int67 == 35);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 10 + "'", int99 == 10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32.0f, (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(52, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32, 35.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, (double) 32.0f, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short7 = org.apache.commons.lang.math.NumberUtils.min(shortArray6);
        short[] shortArray14 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray14);
        java.lang.Class<?> wildcardClass16 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        float[] floatArray0 = null;
        float[] floatArray4 = new float[] { 1.0f, (short) 100, 0L };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray9);
        float[] floatArray15 = new float[] { 1.0f, (short) 100, 0L };
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        float[] floatArray20 = new float[] { 1.0f, (short) 100, 0L };
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray15);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray9);
        float[] floatArray30 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray34 = new float[] { 1.0f, (short) 100, 0L };
        float float35 = org.apache.commons.lang.math.NumberUtils.min(floatArray34);
        float[] floatArray39 = new float[] { 1.0f, (short) 100, 0L };
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray34);
        float[] floatArray46 = new float[] { 1.0f, (short) 100, 0L };
        float float47 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        float[] floatArray51 = new float[] { 1.0f, (short) 100, 0L };
        float float52 = org.apache.commons.lang.math.NumberUtils.min(floatArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray51);
        float float54 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        float[] floatArray55 = new float[] {};
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray34, floatArray55);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray55);
        float[] floatArray63 = new float[] { 10.0f, 10L, 0L, (short) 0 };
        float float64 = org.apache.commons.lang.math.NumberUtils.max(floatArray63);
        float float65 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        float float66 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        float float67 = org.apache.commons.lang.math.NumberUtils.max(floatArray63);
        float float68 = org.apache.commons.lang.math.NumberUtils.min(floatArray63);
        float[] floatArray69 = null;
        float[] floatArray73 = new float[] { 1.0f, (short) 100, 0L };
        float float74 = org.apache.commons.lang.math.NumberUtils.min(floatArray73);
        float[] floatArray78 = new float[] { 1.0f, (short) 100, 0L };
        float float79 = org.apache.commons.lang.math.NumberUtils.min(floatArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray73, floatArray78);
        float[] floatArray84 = new float[] { 1.0f, (short) 100, 0L };
        float float85 = org.apache.commons.lang.math.NumberUtils.min(floatArray84);
        float[] floatArray89 = new float[] { 1.0f, (short) 100, 0L };
        float float90 = org.apache.commons.lang.math.NumberUtils.min(floatArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(floatArray84, floatArray89);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(floatArray78, floatArray84);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray69, floatArray78);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray63, floatArray78);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray78);
        // The following exception was thrown during execution in test generation
        try {
            float float96 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray46, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertArrayEquals(floatArray63, new float[] { 10.0f, 10.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 10.0f + "'", float64 == 10.0f);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.0f + "'", float65 == 0.0f);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.0f + "'", float66 == 0.0f);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 10.0f + "'", float67 == 10.0f);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 0.0f + "'", float68 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertArrayEquals(floatArray73, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertArrayEquals(floatArray78, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.0f + "'", float79 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(floatArray84);
        org.junit.Assert.assertArrayEquals(floatArray84, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 0.0f + "'", float85 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray89);
        org.junit.Assert.assertArrayEquals(floatArray89, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + 0.0f + "'", float90 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, (float) (byte) 10, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) '4', (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray19 = new float[] { 1.0f, (short) 100, 0L };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray8, floatArray14);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray8);
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        java.lang.Class<?> wildcardClass25 = floatArray8.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 'a', 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', 35, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 100, 0.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        byte[] byteArray28 = null;
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            byte byte30 = org.apache.commons.lang.math.NumberUtils.max(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray21 = new float[] { 1.0f, (short) 100, 0L };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray26 = new float[] { 1.0f, (short) 100, 0L };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray26);
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray30 = new float[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray30);
        float[] floatArray36 = new float[] { 1.0f, (short) 100, 0L };
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray41 = new float[] { 1.0f, (short) 100, 0L };
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray41);
        float float44 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray45 = new float[] {};
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray45);
        java.lang.Class<?> wildcardClass48 = floatArray45.getClass();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertArrayEquals(floatArray41, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) 97, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float float11 = org.apache.commons.lang.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        double[] doubleArray4 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 1, 1L };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray11 = new double[] { 10L };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray11);
        double double13 = org.apache.commons.lang.math.NumberUtils.max(doubleArray11);
        double[] doubleArray18 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray22 = new double[] { (byte) 10, 1, 1L };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray18, doubleArray22);
        double[] doubleArray25 = new double[] { 10L };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray25);
        double[] doubleArray31 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray35 = new double[] { (byte) 10, 1, 1L };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray35);
        double[] doubleArray38 = new double[] { 10L };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray38);
        double[] doubleArray44 = new double[] { 1, (-1), '#', 'a' };
        double[] doubleArray48 = new double[] { (byte) 10, 1, 1L };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray48);
        double double50 = org.apache.commons.lang.math.NumberUtils.min(doubleArray44);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray35, doubleArray44);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray22, doubleArray35);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray22);
        java.lang.Class<?> wildcardClass54 = doubleArray22.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, (-1.0d), 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray17 = new short[] { (byte) 0, (short) 0 };
        short short18 = org.apache.commons.lang.math.NumberUtils.max(shortArray17);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray17);
        java.lang.Class<?> wildcardClass20 = shortArray17.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        float[] floatArray5 = new float[] { (byte) 1, (byte) -1, (short) 10, 35L, (short) 0 };
        float[] floatArray9 = new float[] { 1.0f, (short) 100, 0L };
        float float10 = org.apache.commons.lang.math.NumberUtils.min(floatArray9);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray14);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(floatArray5, floatArray9);
        float[] floatArray21 = new float[] { 1.0f, (short) 100, 0L };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray26 = new float[] { 1.0f, (short) 100, 0L };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray26);
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float[] floatArray30 = new float[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray9, floatArray30);
        // The following exception was thrown during execution in test generation
        try {
            float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 1.0f, (-1.0f), 10.0f, 35.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertArrayEquals(floatArray9, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] {}, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35L, (double) 97, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 0, (long) (short) 0, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) -1, 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int[] intArray1 = new int[] { (byte) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10, (double) (short) 1, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte14 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray15 = null;
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray17);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray5, byteArray17);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray28, byteArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray28);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            byte byte46 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, 35L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, (short) 1, 0, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray17 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray13);
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int22 = org.apache.commons.lang.math.NumberUtils.max(intArray13);
        int[] intArray29 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray33 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray33);
        int[] intArray41 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray45 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray41);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray41);
        int int49 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int[] intArray52 = new int[] { (byte) -1 };
        int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray52);
        int[] intArray58 = new int[] { (-1), (byte) 10, (short) 0, (short) 1 };
        int int59 = org.apache.commons.lang.math.NumberUtils.max(intArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray58);
        int[] intArray67 = new int[] { (byte) 10, (byte) 0, (byte) 0, '#', (byte) 1, '#' };
        int[] intArray71 = new int[] { (byte) 10, (byte) 10, '4' };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(intArray67, intArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray67);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray52);
        int int75 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, 0, (-1), 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 10, 0, 1 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 10, 0, 0, 35, 1, 35 });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 10, 10, 52 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 10, (long) 1, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, (long) (byte) 100, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35L, (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        float[] floatArray3 = new float[] { 1.0f, (short) 100, 0L };
        float float4 = org.apache.commons.lang.math.NumberUtils.min(floatArray3);
        float[] floatArray8 = new float[] { 1.0f, (short) 100, 0L };
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray3, floatArray8);
        float[] floatArray14 = new float[] { 1.0f, (short) 100, 0L };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray19 = new float[] { 1.0f, (short) 100, 0L };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(floatArray8, floatArray14);
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray8);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray8);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertArrayEquals(floatArray8, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) '#', (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) -1, 35.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short12 = org.apache.commons.lang.math.NumberUtils.min(shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray11);
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray4);
        short[] shortArray21 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray21);
        short[] shortArray29 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray29);
        short short31 = org.apache.commons.lang.math.NumberUtils.min(shortArray29);
        short[] shortArray36 = new short[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        short[] shortArray43 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short44 = org.apache.commons.lang.math.NumberUtils.min(shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray43);
        short[] shortArray52 = new short[] { (byte) 0, (byte) 1, (byte) 1, (short) 10, (byte) 0, (short) 10 };
        short short53 = org.apache.commons.lang.math.NumberUtils.min(shortArray52);
        short[] shortArray60 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (short) -1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray60);
        short[] shortArray64 = new short[] { (byte) 0, (short) 0 };
        short short65 = org.apache.commons.lang.math.NumberUtils.max(shortArray64);
        short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray64);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray64);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray64);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray29);
        short short71 = org.apache.commons.lang.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 0 + "'", short44 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] { (short) 0, (short) 1, (short) 1, (short) 10, (short) 0, (short) 10 });
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) 0 + "'", short53 == (short) 0);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray60, new short[] { (short) -1, (short) 0, (short) 1, (short) 10, (short) 10, (short) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray64, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 0 + "'", short65 == (short) 0);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) -1 + "'", short71 == (short) -1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '#', 1.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, (double) 100, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35L, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', (long) 52, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) ' ', (double) (byte) -1, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        long[] longArray1 = new long[] { (byte) -1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray8 = new long[] { 1L, (byte) 1, 0, 0, (short) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray8);
        long[] longArray16 = new long[] { 'a', ' ', 52, (short) 0, (byte) -1, 100L };
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray16);
        java.lang.Class<?> wildcardClass20 = longArray16.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { (-1L) });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L, 1L, 0L, 0L, 100L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 97L, 32L, 52L, 0L, (-1L), 100L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97, (float) 10, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }
}

