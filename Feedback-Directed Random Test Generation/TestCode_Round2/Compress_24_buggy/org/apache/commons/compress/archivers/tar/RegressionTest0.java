package org.apache.commons.compress.archivers.tar;

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
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray7, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 134 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 1, byteArray7, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 0, byteArray3, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) -1, byteArray5, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray2, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(1L, byteArray7, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 0, byteArray7, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1 });
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray2, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1 });
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 1, byteArray4, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (-1), byteArray5, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value -1 is too large for 1 byte field.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 13 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray4, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray4, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (int) (short) 10, (int) (byte) 100, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 10, byteArray6, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray5, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 127 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray4, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 10, byteArray6, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 97 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray4, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        byte[] byteArray0 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 0, (int) (byte) 100, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEncoding3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray4, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray6, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (short) 100, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(zipEncoding9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray6, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray4, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(10L, byteArray6, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray6, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 100, (int) (byte) 1, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(zipEncoding15);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(1L, byteArray1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray5, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 103 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(10L, byteArray6, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray2, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray4, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '4', byteArray4, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 1, byteArray2, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray4, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 100, byteArray6, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 3 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 100, (int) (byte) 0, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(zipEncoding15);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 100, 10, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipEncoding15);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray6, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 0, byteArray4, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10, byteArray4, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 100, byteArray4, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray4, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 100, byteArray4, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 0, byteArray6, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray4, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray6, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray6, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray4, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) -1, byteArray6, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) 'a', (-1), zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 97 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(zipEncoding16);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray5, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, (int) ' ', zipEncoding12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(zipEncoding12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) ' ', zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipEncoding8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray4, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 32 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray4, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray4, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass14 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray5, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(320L, byteArray4, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 100, byteArray5, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray5, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray5, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 100, byteArray6, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray4, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1));
        byte[] byteArray28 = new byte[] { (byte) 10 };
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) 1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (byte) 0, (int) (byte) -1, zipEncoding37);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 0, (int) (short) 0, zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (short) 10, (int) (byte) 0, zipEncoding37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\001" + "'", str38, "\001");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 1, (int) (byte) 1, zipEncoding16);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) (byte) -1, zipEncoding16);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, 0, (int) (byte) 100, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 3 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 1, byteArray6, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 53 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (short) 10, 100, zipEncoding17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(zipEncoding17);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray6, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) ' ', byteArray5, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray6, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (short) 10, zipEncoding21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        java.lang.Class<?> wildcardClass13 = zipEncoding10.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 10 };
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 1, (int) (byte) 1, zipEncoding19);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, (int) (byte) -1, zipEncoding19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) '4', zipEncoding19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\001" + "'", str20, "\001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray5, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray6, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 1, byteArray6, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(10L, byteArray5, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) ' ', (-1));
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 1, (int) (byte) 1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) 0, (int) (byte) -1, zipEncoding38);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 0, (int) (short) 0, zipEncoding38);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, 1, (int) (byte) 100, zipEncoding38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 4 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\001" + "'", str39, "\001");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray6, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray2, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 'a', byteArray5, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray4, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 1, byteArray5, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(100L, byteArray6, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1));
        byte[] byteArray28 = new byte[] { (byte) 10 };
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) 1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (byte) 0, (int) (byte) -1, zipEncoding37);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 0, (int) (short) 0, zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 1, (int) ' ', zipEncoding37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\001" + "'", str38, "\001");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) 1, zipEncoding28);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) 0, (int) (byte) -1, zipEncoding28);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, 0, (int) (short) 10, zipEncoding28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 3 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001" + "'", str29, "\001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 100, byteArray4, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(320L, byteArray5, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding0 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.Class<?> wildcardClass1 = zipEncoding0.getClass();
        org.junit.Assert.assertNotNull(zipEncoding0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray5, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 100, byteArray4, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 100, 0, zipEncoding21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 1, byteArray5, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray3, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray3, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray4, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(100L, byteArray2, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray6, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        byte[] byteArray12 = new byte[] { (byte) 10 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 0, (int) (byte) -1, zipEncoding21);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 0, zipEncoding21);
        java.lang.Class<?> wildcardClass25 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray3, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray3, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray4, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 192 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) ' ', (-1));
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 1, (int) (byte) 1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) 0, (int) (byte) -1, zipEncoding38);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 0, (int) (short) 0, zipEncoding38);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (byte) -1, (int) (short) -1, zipEncoding38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\001" + "'", str39, "\001");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(10L, byteArray5, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(320L, byteArray5, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(10L, byteArray6, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        byte[] byteArray1 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray1, (int) 'a', 0, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEncoding4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray3, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (short) 0, zipEncoding24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (-1), (int) (short) 1, zipEncoding24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) 1, zipEncoding28);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) 0, (int) (byte) -1, zipEncoding28);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray2, (int) (short) 100, (int) (byte) -1, zipEncoding28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001" + "'", str29, "\001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) ' ', (-1));
        byte[] byteArray22 = new byte[] { (byte) 10 };
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, (int) (byte) 1, zipEncoding31);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (byte) 0, (int) (byte) -1, zipEncoding31);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, 0, (int) (short) 0, zipEncoding31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 100, (int) (short) 100, zipEncoding31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\001" + "'", str32, "\001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 10, 10, zipEncoding26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 10, (int) (short) 100, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipEncoding9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray4, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray6, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray4, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 2, byteArray4, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 192 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 100, byteArray5, 2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray2, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        byte[] byteArray12 = new byte[] { (byte) 10 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 0, (int) (byte) -1, zipEncoding21);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 0, zipEncoding21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray6, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray5, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray3, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray6, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 100, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipEncoding9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray6, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 32 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray4, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 10, zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipEncoding8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 0, byteArray1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray6, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray4, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '#', byteArray5, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray4, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 1, byteArray6, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, 10, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(zipEncoding15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) '#', (int) (byte) -1, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipEncoding9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray1, 2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 100, byteArray2, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 196 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray15);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, 1, (int) (byte) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray15, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) ' ', (-1));
        byte[] byteArray37 = new byte[] { (byte) 10 };
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray37);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 1, (int) (byte) 1, zipEncoding46);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (byte) 0, (int) (byte) -1, zipEncoding46);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 0, (int) (short) 0, zipEncoding46);
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) 'a', (int) (byte) -1, zipEncoding46);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) '4', 2, zipEncoding46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 52 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\001" + "'", str47, "\001");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray4, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray3, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray2, (int) (short) 10, (int) (short) 0, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(zipEncoding16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 1, (int) (byte) 1, zipEncoding20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) '#', (int) (byte) 100, zipEncoding20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 134 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001" + "'", str21, "\001");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(320L, byteArray5, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        byte[] byteArray12 = new byte[] { (byte) 10 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 0, (int) (byte) -1, zipEncoding21);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 0, zipEncoding21);
        java.lang.Class<?> wildcardClass25 = zipEncoding21.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray1, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray6, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value -1 is too large for 1 byte field.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        byte[] byteArray24 = new byte[] { (byte) 10 };
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, (int) (byte) 1, zipEncoding33);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) (byte) 0, (int) (byte) -1, zipEncoding33);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, (int) (short) 0, zipEncoding33);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 1, (int) 'a', zipEncoding33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\001" + "'", str34, "\001");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (short) -1, (int) (short) 0, zipEncoding15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) '#', (int) (short) 1, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(320L, byteArray4, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(10L, byteArray6, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21L + "'", long6 == 21L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray4, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 1, byteArray6, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 10, byteArray6, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray5, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray2, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 98 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding0 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.Class<?> wildcardClass1 = zipEncoding0.getClass();
        org.junit.Assert.assertNotNull(zipEncoding0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (-1));
        byte[] byteArray26 = new byte[] { (byte) 10 };
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, 1, (int) (byte) 1, zipEncoding35);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) (byte) 0, (int) (byte) -1, zipEncoding35);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 0, (int) (short) 0, zipEncoding35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) 'a', (int) ' ', zipEncoding35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\001" + "'", str36, "\001");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(320L, byteArray1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(100L, byteArray5, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) 0, zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray5, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        byte[] byteArray1 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (short) 0, zipEncoding25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, (int) '4', 2, zipEncoding25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray2, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray5, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', (int) (byte) 0, zipEncoding25);
        java.lang.Class<?> wildcardClass29 = zipEncoding25.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray2, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray2, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray2, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray2, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 2, byteArray6, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray4, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 10, 1, zipEncoding26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 10, byteArray4, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(10L, byteArray1, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, 1, (int) (byte) 1, zipEncoding17);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) '4', 0, zipEncoding17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 52 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\001" + "'", str18, "\001");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(10L, byteArray2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray20);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) -1);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray20, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        byte[] byteArray42 = new byte[] { (byte) 10 };
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) 1, zipEncoding51);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (byte) 0, (int) (byte) -1, zipEncoding51);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 0, (int) (short) 0, zipEncoding51);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) 'a', (int) (byte) -1, zipEncoding51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) 'a', zipEncoding51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\001" + "'", str52, "\001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray6, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1));
        byte[] byteArray28 = new byte[] { (byte) 10 };
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) 1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (byte) 0, (int) (byte) -1, zipEncoding37);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 0, (int) (short) 0, zipEncoding37);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (byte) -1, zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray6, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\001" + "'", str38, "\001");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass9 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 100, byteArray6, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        byte[] byteArray11 = new byte[] { (byte) 10 };
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 1, (int) (byte) 1, zipEncoding20);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 0, (int) (byte) -1, zipEncoding20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 1, zipEncoding20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001" + "'", str21, "\001");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray2, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray5, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 55, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 0, byteArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(320L, byteArray5, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 1, (int) (short) 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray5, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, 2, (int) '#', zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(zipEncoding8);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray6, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray6, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray5, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) 0, zipEncoding26);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(320L, byteArray5, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 256L + "'", long30 == 256L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1));
        byte[] byteArray28 = new byte[] { (byte) 10 };
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) 1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (byte) 0, (int) (byte) -1, zipEncoding37);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 0, (int) (short) 0, zipEncoding37);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (byte) -1, zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\001" + "'", str38, "\001");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray6, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 1, byteArray6, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 42 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray6, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) -1);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray23, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) ' ', (-1));
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) 0, (int) (byte) -1, zipEncoding54);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 0, (int) (short) 0, zipEncoding54);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) 'a', (int) (byte) -1, zipEncoding54);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding54);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) ' ', (-1));
        byte[] byteArray74 = new byte[] { (byte) 10 };
        long long75 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray74);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding83 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, 1, (int) (byte) 1, zipEncoding83);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, (int) (byte) 0, (int) (byte) -1, zipEncoding83);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, 0, (int) (short) 0, zipEncoding83);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 10, (int) (short) 1, zipEncoding83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L + "'", long75 == 10L);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\001" + "'", str84, "\001");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        byte[] byteArray0 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray9);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray9, (int) (byte) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray25);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) -1);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray25, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, (int) ' ', (-1));
        byte[] byteArray47 = new byte[] { (byte) 10 };
        long long48 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray47);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding56 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 1, (int) (byte) 1, zipEncoding56);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) (byte) 0, (int) (byte) -1, zipEncoding56);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 0, (int) (short) 0, zipEncoding56);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) 'a', (int) (byte) -1, zipEncoding56);
        int int61 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray9, 0, (-1), zipEncoding56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) '#', (int) (short) 1, zipEncoding56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\001" + "'", str57, "\001");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) -1);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray21, (int) (byte) 0, (int) (byte) -1);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray37);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) -1);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray37, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, (int) ' ', (-1));
        byte[] byteArray59 = new byte[] { (byte) 10 };
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray59);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding68 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, 1, (int) (byte) 1, zipEncoding68);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) (byte) 0, (int) (byte) -1, zipEncoding68);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 0, (int) (short) 0, zipEncoding68);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) 'a', (int) (byte) -1, zipEncoding68);
        int int73 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray21, 0, (-1), zipEncoding68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 2, zipEncoding68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 21L + "'", long29 == 21L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\001" + "'", str69, "\001");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1));
        byte[] byteArray28 = new byte[] { (byte) 10 };
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) 1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (byte) 0, (int) (byte) -1, zipEncoding37);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 0, (int) (short) 0, zipEncoding37);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (byte) -1, zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray6, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 61 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\001" + "'", str38, "\001");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 97 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        byte[] byteArray1 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, (int) '4', (int) '4', zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass10 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(356L, byteArray6, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 356=544 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray11);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 1, (int) (byte) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray11, (int) (byte) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray27);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) -1);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray27, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) ' ', (-1));
        byte[] byteArray49 = new byte[] { (byte) 10 };
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray49);
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding58 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, 1, (int) (byte) 1, zipEncoding58);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, (int) (byte) 0, (int) (byte) -1, zipEncoding58);
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 0, (int) (short) 0, zipEncoding58);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) 'a', (int) (byte) -1, zipEncoding58);
        int int63 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray11, 0, (-1), zipEncoding58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 10, (int) 'a', zipEncoding58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 106 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21L + "'", long19 == 21L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\001" + "'", str59, "\001");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray5, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray6, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 40 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray5, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 'a', byteArray6, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 100, (int) (short) 0, zipEncoding17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
        org.junit.Assert.assertNotNull(zipEncoding17);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray4, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray5, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 356L + "'", long8 == 356L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (short) -1, (int) (short) 0, zipEncoding23);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 10, (int) ' ', zipEncoding23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray6, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(320L, byteArray5, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray21);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, (int) (short) 0, (int) (byte) 1);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray21, 0, (int) (byte) 100);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (int) (byte) 0, zipEncoding42);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) 0, 10, zipEncoding42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray6, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 197 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray6, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 64 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray3, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 151 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.Class<?> wildcardClass14 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass16 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(21L, byteArray6, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 21=25 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 100, byteArray4, (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 48, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray5, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray6, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 191 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', (int) (byte) 0, zipEncoding25);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray5, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray6, 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray5, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) 0, zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 100, byteArray5, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 127 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray3, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray5, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 256L + "'", long11 == 256L);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray2, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 132 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray6, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray6, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray4, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        byte[] byteArray1 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray9);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray9, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (-1));
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 0, (int) (short) 0, zipEncoding40);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) 'a', (int) (byte) -1, zipEncoding40);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray1, (int) (byte) 1, (-1), zipEncoding40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray5, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) -1);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray23, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) ' ', (-1));
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) 0, (int) (byte) -1, zipEncoding54);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 0, (int) (short) 0, zipEncoding54);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) 'a', (int) (byte) -1, zipEncoding54);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding54);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '#', byteArray7, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray3, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 2, byteArray2, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(11L, byteArray2, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 147 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 2, byteArray6, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray1, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray5, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray10 = new byte[] { (byte) 10 };
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 1, (int) (byte) 1, zipEncoding19);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, (int) (byte) -1, zipEncoding19);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, (int) (byte) 1, zipEncoding31);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 1, (int) (byte) 0, zipEncoding31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (byte) 10, zipEncoding31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\001" + "'", str20, "\001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\001" + "'", str32, "\001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(256L, byteArray2, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 256=400 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) 0, zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray5, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray3, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(356L, byteArray3, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 356=544 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray5, 2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 0, (int) (short) 0, zipEncoding41);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 1, 1, zipEncoding41);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray6, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) -1);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray22, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) ' ', (-1));
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 0, (int) (short) 0, zipEncoding53);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) 'a', (int) (byte) -1, zipEncoding53);
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, 0, (-1), zipEncoding53);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding61 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 100, (int) (short) -1, zipEncoding61);
        java.lang.Class<?> wildcardClass63 = zipEncoding61.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(zipEncoding61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (-1), zipEncoding22);
        java.lang.Class<?> wildcardClass26 = zipEncoding22.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.Class<?> wildcardClass15 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray4, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 256L + "'", long10 == 256L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray1, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid byte 100 at offset 1 in 'dd' len=2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        byte[] byteArray1 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray1, (int) (byte) -1, (int) 'a', zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEncoding4);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(256L, byteArray3, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray5, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray5, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray5, 3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 103 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (byte) 0, (int) (byte) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 21L + "'", long13 == 21L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        java.lang.Class<?> wildcardClass10 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 100, byteArray6, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 52, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray1, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) -1);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray23, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) ' ', (-1));
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) 0, (int) (byte) -1, zipEncoding54);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 0, (int) (short) 0, zipEncoding54);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) 'a', (int) (byte) -1, zipEncoding54);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding54);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding62 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 100, (int) (short) -1, zipEncoding62);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray7, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(zipEncoding62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray4, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray4, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray4, 3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 52 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 'a', byteArray4, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (-1), byteArray6, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 9 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 100, byteArray6, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray2, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray2, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray3, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray4, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 10, byteArray1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) -1, (int) (byte) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((-1L), byteArray3, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray2, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(320L, byteArray5, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (-1), zipEncoding22);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray2, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray5, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0, zipEncoding20);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray17);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray17);
        byte[] byteArray27 = new byte[] { (byte) 10 };
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, 1, (int) (byte) 1, zipEncoding36);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) (byte) 0, (int) (byte) -1, zipEncoding36);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, (-1), zipEncoding36);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 100, (int) (short) 1, zipEncoding36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\001" + "'", str37, "\001");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray6, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(256L, byteArray5, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 256L + "'", long11 == 256L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (short) 0, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, (int) (byte) 100);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', (int) (byte) 0, zipEncoding25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) 1, zipEncoding28);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) 0, (int) (byte) -1, zipEncoding28);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) -1, (int) (short) -1, zipEncoding28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001" + "'", str29, "\001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray10, (int) (byte) 1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) ' ', (-1));
        byte[] byteArray36 = new byte[] { (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray36);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding45 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (byte) 1, zipEncoding45);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (byte) 0, (int) (byte) -1, zipEncoding45);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 0, (int) (short) 0, zipEncoding45);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (byte) 1, 1, zipEncoding45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 0, (int) (byte) 10, zipEncoding45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 21L + "'", long21 == 21L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\001" + "'", str46, "\001");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 0, byteArray6, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray4, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(320L, byteArray5, 3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 102 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21L + "'", long6 == 21L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray6, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray4, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 1, (int) (byte) -1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray29, (int) (byte) 1);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 0, (int) (byte) -1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, (int) ' ', (-1));
        byte[] byteArray55 = new byte[] { (byte) 10 };
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray55);
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding64 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, 1, (int) (byte) 1, zipEncoding64);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, (int) (byte) 0, (int) (byte) -1, zipEncoding64);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 0, (int) (short) 0, zipEncoding64);
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray29, (int) (byte) 1, 1, zipEncoding64);
        int int69 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, (int) (byte) 1, 0, zipEncoding64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 21L + "'", long34 == 21L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 21L + "'", long40 == 21L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\001" + "'", str65, "\001");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray16);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 1, (int) (byte) -1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray16, (int) (byte) 0, (int) (byte) -1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray32);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, 1, (int) (byte) -1);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray32, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) ' ', (-1));
        byte[] byteArray54 = new byte[] { (byte) 10 };
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding63 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 1, (int) (byte) 1, zipEncoding63);
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) (byte) 0, (int) (byte) -1, zipEncoding63);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, 0, (int) (short) 0, zipEncoding63);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) 'a', (int) (byte) -1, zipEncoding63);
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, 2, (int) (byte) 1, zipEncoding63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', (int) (short) 1, zipEncoding63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21L + "'", long6 == 21L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 21L + "'", long24 == 21L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\001" + "'", str64, "\001");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray4, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 38 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21L + "'", long16 == 21L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray4, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray6, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, (int) (short) 0, zipEncoding7);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, (-1), zipEncoding23);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(20L, byteArray4, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 20=24 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 100);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(21L, byteArray6, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 21=25 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 1, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', 0);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) 1, zipEncoding28);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray25);
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray25, 0);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray42);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray42, (int) (short) 0, (int) (byte) 1);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray42, 0, (int) (byte) 100);
        byte[] byteArray54 = new byte[] { (byte) 10 };
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding63 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 1, (int) (byte) 1, zipEncoding63);
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) (byte) 0, (int) (byte) -1, zipEncoding63);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) ' ', (int) (byte) 0, zipEncoding63);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) (byte) 10, (int) (byte) -1, zipEncoding63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) '4', zipEncoding63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001" + "'", str29, "\001");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\001" + "'", str64, "\001");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(256L, byteArray6, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        byte[] byteArray12 = new byte[] { (byte) 10 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 1, (int) (byte) 1, zipEncoding21);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 0, (int) (byte) -1, zipEncoding21);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 0, zipEncoding21);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding32 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 1, (int) (byte) 1, zipEncoding32);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray29);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray29, 0);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) -1, (int) (byte) 0);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray46);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray46);
        int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray46, (int) (short) 0, (int) (byte) 1);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray46, 0, (int) (byte) 100);
        byte[] byteArray58 = new byte[] { (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, 1, (int) (byte) 1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (byte) 0, (int) (byte) -1, zipEncoding67);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) ' ', (int) (byte) 0, zipEncoding67);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) 10, (int) (byte) -1, zipEncoding67);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) '#', zipEncoding67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\001" + "'", str22, "\001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\001" + "'", str33, "\001");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L + "'", long59 == 10L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\001" + "'", str68, "\001");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', 0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) (short) -1, (int) (short) 0, zipEncoding30);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 100, (int) (byte) 0, zipEncoding30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) -1);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray22, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) ' ', (-1));
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 0, (int) (short) 0, zipEncoding53);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) 'a', (int) (byte) -1, zipEncoding53);
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 2, (int) (byte) 1, zipEncoding53);
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long62 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 20L + "'", long59 == 20L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, 3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 3 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0, zipEncoding23);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray34);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) -1);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray34, (int) (byte) 0, (int) (byte) -1);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray50);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) -1);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray50, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, (int) ' ', (-1));
        byte[] byteArray72 = new byte[] { (byte) 10 };
        long long73 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray72);
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding81 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray78, 1, (int) (byte) 1, zipEncoding81);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, (int) (byte) 0, (int) (byte) -1, zipEncoding81);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, 0, (int) (short) 0, zipEncoding81);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) 'a', (int) (byte) -1, zipEncoding81);
        int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray34, 0, (-1), zipEncoding81);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 100, (int) (short) -1, zipEncoding89);
        // The following exception was thrown during execution in test generation
        try {
            int int91 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, 100, 1, zipEncoding89);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 21L + "'", long42 == 21L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73 == 10L);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\001" + "'", str82, "\001");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) -1);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray22, (int) (byte) 0, (int) (byte) -1);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray38);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) -1);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray38, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) ' ', (-1));
        byte[] byteArray60 = new byte[] { (byte) 10 };
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (byte) 0, (int) (byte) -1, zipEncoding69);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 0, (int) (short) 0, zipEncoding69);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) 'a', (int) (byte) -1, zipEncoding69);
        int int74 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray22, 2, (int) (byte) 1, zipEncoding69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 3, (int) (byte) 1, zipEncoding69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 21L + "'", long30 == 21L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\001" + "'", str70, "\001");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 1, (int) (short) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (int) (byte) -1, 2, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(zipEncoding16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (byte) 0, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray23);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) -1);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray23, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) ' ', (-1));
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 1, (int) (byte) 1, zipEncoding54);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (byte) 0, (int) (byte) -1, zipEncoding54);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 0, (int) (short) 0, zipEncoding54);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) 'a', (int) (byte) -1, zipEncoding54);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding54);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray7, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21L + "'", long15 == 21L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\001" + "'", str55, "\001");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(100L, byteArray4, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 356L + "'", long9 == 356L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 100, (int) (byte) 0);
        byte[] byteArray22 = new byte[] { (byte) 10 };
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, (int) (byte) 1, zipEncoding31);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (byte) 0, (int) (byte) -1, zipEncoding31);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (short) 1, (int) (byte) 0, zipEncoding43);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '4', 0, zipEncoding43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 52 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\001" + "'", str32, "\001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) ' ', byteArray5, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 0, (int) (short) 0, zipEncoding41);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 1, 1, zipEncoding41);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 100, byteArray6, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 104, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21L + "'", long17 == 21L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, 1, (int) (byte) 1, zipEncoding18);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, 1, zipEncoding18);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(256L, byteArray3, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 256=400 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001" + "'", str19, "\001");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(256L, byteArray1, 2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding6);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (-1), zipEncoding22);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 0, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray22);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) -1);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray22, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) ' ', (-1));
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 0, (int) (short) 0, zipEncoding53);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) 'a', (int) (byte) -1, zipEncoding53);
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, 0, (-1), zipEncoding53);
        // The following exception was thrown during execution in test generation
        try {
            long long61 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21L + "'", long14 == 21L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray1, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', 0);
        byte[] byteArray26 = new byte[] { (byte) 10 };
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, 1, (int) (byte) 1, zipEncoding35);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) (byte) 0, (int) (byte) -1, zipEncoding35);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray26);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding48 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (short) -1, (int) (short) 0, zipEncoding48);
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray45);
        byte[] byteArray55 = new byte[] { (byte) 10 };
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray55);
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding64 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, 1, (int) (byte) 1, zipEncoding64);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, (int) (byte) 0, (int) (byte) -1, zipEncoding64);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 0, (-1), zipEncoding64);
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray26, (int) (byte) 0, (int) (byte) 1, zipEncoding64);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, (int) (short) 100, 3, zipEncoding64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 104 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\001" + "'", str36, "\001");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(zipEncoding48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\001" + "'", str65, "\001");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\001", byteArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray5, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }
}

