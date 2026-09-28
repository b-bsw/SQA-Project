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
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray2, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 10, byteArray6, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 5");
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
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray2, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray2, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray2, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (short) 100, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(zipEncoding15);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(10L, byteArray7, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray2, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray6, 0, (-1));
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
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 103 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, 1);
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '4', byteArray6, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 1, byteArray6, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray2, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, 100, (int) (byte) 0, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 100, 10, zipEncoding11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(zipEncoding11);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray7, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 0, byteArray2, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10, byteArray6, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 100, byteArray6, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray6, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 10 });
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 100, byteArray2, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 0, byteArray6, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray6, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray1, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray6, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray6, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) -1, byteArray3, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) 'a', (-1), zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 97 out of bounds for byte[5]");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray7, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) ' ', zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(zipEncoding18);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) ' ', zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(zipEncoding14);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 32 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray6, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, (int) (byte) 10, (int) (short) 10);
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray6, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass10 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray7, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(320L, byteArray2, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length -2");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 100, byteArray6, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray6, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray1, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 100, byteArray5, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1 });
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray2, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 1");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (-1), (int) (short) 1);
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray17, (int) (short) 0, (int) (byte) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, (int) (short) 0, zipEncoding40);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray5, (int) (short) 10, (int) (byte) 0, zipEncoding40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 310L + "'", long27 == 310L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, 0, (int) (byte) 100, zipEncoding26);
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 10, byteArray6, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 53 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 10, (int) (short) 100);
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (short) 10, 100, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertNotNull(zipEncoding16);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray4, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) -1, byteArray6, (int) (short) 100, (int) 'a');
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray4, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 1, (int) (byte) 1, zipEncoding16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 100, (int) (short) 10, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding0 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.Class<?> wildcardClass1 = zipEncoding0.getClass();
        org.junit.Assert.assertNotNull(zipEncoding0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '#', byteArray2, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray7, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 10, byteArray7, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (short) -1, (int) (short) 0);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, (int) (short) 0, (int) (byte) 1);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) 1, zipEncoding44);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (byte) 0, (int) (byte) -1, zipEncoding44);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 0, (int) (short) 0, zipEncoding44);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 1, (int) (byte) 100, zipEncoding44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 310L + "'", long31 == 310L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\001" + "'", str45, "\001");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray6, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray2, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray6, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray4, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray4, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray7, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) ' ', (-1));
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (short) -1, (int) (short) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray23, (int) (short) 0, (int) (byte) 1);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        byte[] byteArray37 = new byte[] { (byte) 10 };
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray37);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 1, (int) (byte) 1, zipEncoding46);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (byte) 0, (int) (byte) -1, zipEncoding46);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 0, (int) (short) 0, zipEncoding46);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (int) ' ', zipEncoding46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\001" + "'", str47, "\001");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 1, (int) (byte) 1, zipEncoding27);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (byte) 0, (int) (byte) -1, zipEncoding27);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) (short) 10, zipEncoding27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\001" + "'", str28, "\001");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray3, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray4, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 1, byteArray6, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray3, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, 1, (int) (byte) 1, zipEncoding17);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 100, 0, zipEncoding17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[5]");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray2, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1 });
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray6, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (-1));
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray7, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray3, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray7, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 103 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray2, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 1");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray6, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) -1, (int) '#');
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(10L, byteArray3, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray2, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        byte[] byteArray1 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray1, (int) (short) 0, (int) (byte) 0, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEncoding4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(310L, byteArray3, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 10, zipEncoding24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) ' ', (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) 1, zipEncoding28);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) 0, (int) (byte) -1, zipEncoding28);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 2, (int) (short) 0, zipEncoding28);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray2, (-1), (int) (short) -1, zipEncoding28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001" + "'", str29, "\001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 53 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 10, 10, zipEncoding25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) ' ', (-1));
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) -1, (int) (short) 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, (int) (short) 0, (int) (byte) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        byte[] byteArray25 = new byte[] { (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, 1, (int) (byte) 1, zipEncoding34);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) (byte) 0, (int) (byte) -1, zipEncoding34);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 0, (int) (short) 0, zipEncoding34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 10, (int) (short) 100, zipEncoding34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 310L + "'", long21 == 310L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\001" + "'", str35, "\001");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray6, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray4, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray6, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(100L, byteArray2, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 192 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray7, 2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray7, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray5, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray6, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
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
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 1, byteArray6, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(10L, byteArray6, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 100, zipEncoding36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertNotNull(zipEncoding36);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray7, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 32 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray6, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) ' ', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (short) -1, (int) (short) 0);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray20, (int) (short) 0, (int) (byte) 1);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 0, (int) (short) 0, zipEncoding43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 10, zipEncoding43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 310L + "'", long30 == 310L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(1L, byteArray2, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) ' ', (-1));
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, (int) (short) 0, (int) (byte) 1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 0, (int) (short) 0, zipEncoding39);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 1, (int) (byte) 1, zipEncoding39);
        java.lang.Class<?> wildcardClass44 = zipEncoding39.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 310L + "'", long26 == 310L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 100, byteArray6, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding25);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray43 = new byte[] { (byte) 10 };
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) (byte) 0, (int) (byte) -1, zipEncoding52);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 2, (int) (short) 0, zipEncoding52);
        byte[] byteArray59 = new byte[] { (byte) 10 };
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray59);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding63 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) (short) -1, (int) (short) 0, zipEncoding63);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) 'a', (int) (byte) -1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) 'a', (int) (short) 0, zipEncoding67);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 100, 10, zipEncoding67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 320L + "'", long39 == 320L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) (short) -1, (int) (short) 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray26, (int) (short) 0, (int) (byte) 1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) 1, zipEncoding44);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray26, 0, (-1), zipEncoding44);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) '#', (int) (byte) -1, zipEncoding44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 310L + "'", long36 == 310L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\001" + "'", str45, "\001");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray2, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 1");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray1, 2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (short) 10, (int) (byte) 10);
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
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 100, byteArray7, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (-1));
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) (short) -1, (int) (short) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray24, (int) (short) 0, (int) (byte) 1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray24, 0, (-1), zipEncoding42);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) '4', 2, zipEncoding42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 52 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 0, (-1), zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray8, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, (int) (short) 10, (int) (short) 0, zipEncoding22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        java.lang.Class<?> wildcardClass33 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 0, (-1), zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) ' ', (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 2, (int) (short) 0, zipEncoding30);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) '#', (-1), zipEncoding30);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray4, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) 'a', 1, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(zipEncoding9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (short) -1, (int) (short) 0, zipEncoding19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 10, (int) '#', zipEncoding19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(365L, byteArray7, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 365=555 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) (short) -1, (int) (short) 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray26, (int) (short) 0, (int) (byte) 1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray40 = new byte[] { (byte) 10 };
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding49 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, 1, (int) (byte) 1, zipEncoding49);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, (int) (byte) 0, (int) (byte) -1, zipEncoding49);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 0, (int) (short) 0, zipEncoding49);
        int int53 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray17, (int) (short) 1, (int) (byte) 1, zipEncoding49);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (short) -1, (int) (short) 0, zipEncoding49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 310L + "'", long36 == 310L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\001" + "'", str50, "\001");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray2, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length 0");
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '4', byteArray4, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) 'a', (int) (byte) -1, zipEncoding9);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(zipEncoding9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 320L + "'", long40 == 320L);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding25);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray2, (int) (short) 100, 100);
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
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(310L, byteArray3, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 310=466 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '4', byteArray7, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '4', byteArray6, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 98 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        java.lang.Class<?> wildcardClass7 = zipEncoding5.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) 'a', (int) (byte) -1, zipEncoding9);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(zipEncoding9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) ' ', (-1));
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray24 = new byte[] { (byte) 10 };
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 1, (int) (byte) 1, zipEncoding33);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) (byte) 0, (int) (byte) -1, zipEncoding33);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 2, (int) (short) 0, zipEncoding33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) ' ', zipEncoding33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 320L + "'", long20 == 320L);
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray7, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(10L, byteArray6, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray6, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        byte[] byteArray1 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 2, (int) (short) 0, zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, (int) '4', 2, zipEncoding26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray7, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(11L, byteArray7, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (short) 1, 0);
        byte[] byteArray11 = new byte[] { (byte) 10 };
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 1, (int) (byte) 1, zipEncoding20);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 0, (int) (byte) -1, zipEncoding20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) 'a', (int) ' ', zipEncoding20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (short) 1, 0);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) ' ', (-1));
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 2, (int) (short) 0, zipEncoding39);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) '#', (-1), zipEncoding39);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (-1), (int) (short) 0, zipEncoding39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 365L + "'", long14 == 365L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 320L + "'", long26 == 320L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) ' ', (-1));
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, (int) (short) 0, (int) (byte) 1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 0, (int) (short) 0, zipEncoding39);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 1, (int) (byte) 1, zipEncoding39);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 310L + "'", long26 == 310L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (byte) 100, zipEncoding41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 196 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray7, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray4, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray7, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray7, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(1L, byteArray1, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray6, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 0");
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray6, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) 'a', (int) (byte) -1, zipEncoding9);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) -1, (int) (byte) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(zipEncoding9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 10, (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 52 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(10L, byteArray3, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 1");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 2, (int) (short) 0, zipEncoding42);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) '#', (-1), zipEncoding42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 0, (int) 'a', zipEncoding42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 365L + "'", long17 == 365L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 320L + "'", long29 == 320L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray2, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray4, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 100, byteArray6, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 1, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(zipEncoding13);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray6, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray6, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 55, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 10, (int) (byte) 10);
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (byte) 0);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0, zipEncoding22);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) 'a', (int) (byte) -1, zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '#', (int) (byte) 0, zipEncoding26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (short) 1, 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray3, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (-1));
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) -1, (int) (short) 0);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray19, (int) (short) 0, (int) (byte) 1);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) 1, zipEncoding37);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray19, 0, (-1), zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, 2, (int) '#', zipEncoding37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 310L + "'", long29 == 310L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\001" + "'", str38, "\001");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray4, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray7, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(320L, byteArray6, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 320=500 will not fit in octal number buffer of length -2");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 1, 0);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray2, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray7, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray6, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 2, (int) (short) 0, zipEncoding43);
        byte[] byteArray50 = new byte[] { (byte) 10 };
        long long51 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray50);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding54 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) (short) -1, (int) (short) 0, zipEncoding54);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding58 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) 'a', (int) (byte) -1, zipEncoding58);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) 'a', (int) (short) 0, zipEncoding58);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 10, (int) (short) 1, zipEncoding58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 320L + "'", long30 == 320L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(zipEncoding58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        byte[] byteArray0 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) ' ', (-1));
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) -1, (int) (short) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) (short) 0, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) 1, zipEncoding28);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray10, 0, (-1), zipEncoding28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) '#', (int) (short) 1, zipEncoding28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 310L + "'", long20 == 310L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001" + "'", str29, "\001");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0, zipEncoding21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), 2, zipEncoding21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray2, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 61 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 97 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '4', (int) '4', zipEncoding10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) ' ', (-1));
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, (int) (short) 0, (int) (byte) 1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 0, (int) (short) 0, zipEncoding39);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 1, (int) (byte) 1, zipEncoding39);
        java.lang.Class<?> wildcardClass44 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 310L + "'", long26 == 310L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 365L + "'", long6 == 365L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        java.lang.Class<?> wildcardClass40 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray6, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 52, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray7, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray6, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) 'a', zipEncoding24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (short) 1, 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 100, byteArray3, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) ' ', (-1));
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray30, (int) (short) 0, (int) (byte) 1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 0, (int) (short) 0, zipEncoding53);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray21, (int) (short) 1, (int) (byte) 1, zipEncoding53);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 100, (int) (short) 0, zipEncoding53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 310L + "'", long40 == 310L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (byte) 0, (int) (byte) 10);
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
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 100, byteArray7, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 2, (int) (short) 0, zipEncoding43);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) '#', (-1), zipEncoding43);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0, zipEncoding43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray7, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 365L + "'", long18 == 365L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 320L + "'", long30 == 320L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long45 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 101 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 365L + "'", long6 == 365L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 2, (int) (short) 0, zipEncoding43);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) '#', (-1), zipEncoding43);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0, zipEncoding43);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray7, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 365L + "'", long18 == 365L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 320L + "'", long30 == 320L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(320L, byteArray2, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (byte) -1);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) ' ', (-1));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        byte[] byteArray36 = new byte[] { (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray36);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding45 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (byte) 1, zipEncoding45);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (byte) 0, (int) (byte) -1, zipEncoding45);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 2, (int) (short) 0, zipEncoding45);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 0, 10, zipEncoding45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 320L + "'", long32 == 320L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\001" + "'", str46, "\001");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 1, byteArray3, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray6, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 64 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray4, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 151 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        java.lang.Class<?> wildcardClass26 = zipEncoding22.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray17, (int) (short) 0, (int) (byte) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, (int) (short) 0, zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, (int) (short) 1, (int) (byte) 1, zipEncoding40);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long51 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray50);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) ' ', (-1));
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray59);
        byte[] byteArray67 = new byte[] { (byte) 10 };
        long long68 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray67);
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding76 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray73, 1, (int) (byte) 1, zipEncoding76);
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) (byte) 0, (int) (byte) -1, zipEncoding76);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, 2, (int) (short) 0, zipEncoding76);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) '#', (-1), zipEncoding76);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 100, (int) (short) -1, zipEncoding76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray8, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 310L + "'", long27 == 310L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 365L + "'", long51 == 365L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 320L + "'", long63 == 320L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L + "'", long68 == 10L);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\001" + "'", str77, "\001");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 2, (int) (short) 0, zipEncoding42);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 100, (int) (byte) -1, zipEncoding42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 320L + "'", long29 == 320L);
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(11L, byteArray6, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray6, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray2, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 191 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding25);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) ' ', (-1));
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, (int) (short) 0, (int) (byte) 1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 0, (int) (short) 0, zipEncoding39);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 1, (int) (byte) 1, zipEncoding39);
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray49);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) ' ', (-1));
        long long62 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray66 = new byte[] { (byte) 10 };
        long long67 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray66);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding75 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, 1, (int) (byte) 1, zipEncoding75);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, (int) (byte) 0, (int) (byte) -1, zipEncoding75);
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, 2, (int) (short) 0, zipEncoding75);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, (int) '#', (-1), zipEncoding75);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 100, (int) (short) -1, zipEncoding75);
        // The following exception was thrown during execution in test generation
        try {
            long long83 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 310L + "'", long26 == 310L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 365L + "'", long50 == 365L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 320L + "'", long62 == 320L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L + "'", long67 == 10L);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\001" + "'", str76, "\001");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray2, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) ' ', (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 2, (int) (short) 0, zipEncoding30);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) '#', (-1), zipEncoding30);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray4, 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray4, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray6, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 127 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 0, (-1), zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(11L, byteArray8, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray7, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray6, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 132 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) 'a', (int) (byte) -1, zipEncoding9);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 0, (int) (byte) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(zipEncoding9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray17, (int) (short) 0, (int) (byte) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, (int) (short) 0, zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, (int) (short) 1, (int) (byte) 1, zipEncoding40);
        byte[] byteArray53 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray53, (int) (byte) 0);
        boolean boolean57 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray53, (int) (byte) 1);
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray63);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, (int) ' ', (-1));
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray72);
        byte[] byteArray80 = new byte[] { (byte) 10 };
        long long81 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray80);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray86, 1, (int) (byte) 1, zipEncoding89);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, (int) (byte) 0, (int) (byte) -1, zipEncoding89);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, 2, (int) (short) 0, zipEncoding89);
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) '#', (-1), zipEncoding89);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) (short) -1, (int) (short) 0, zipEncoding89);
        java.lang.String str95 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (-1), zipEncoding89);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(310L, byteArray8, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 310L + "'", long27 == 310L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 365L + "'", long64 == 365L);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 320L + "'", long76 == 320L);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10L + "'", long81 == 10L);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\001" + "'", str90, "\001");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray6, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray7, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        byte[] byteArray1 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray1, (int) (byte) 1, (-1), zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEncoding4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray2, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 1");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '#', byteArray7, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray7, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 640L + "'", long12 == 640L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 1, 0);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 2, byteArray6, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length 0");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(640L, byteArray4, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 147 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray7, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 133 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) ' ', (-1));
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (short) -1, (int) (short) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray23, (int) (short) 0, (int) (byte) 1);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        byte[] byteArray37 = new byte[] { (byte) 10 };
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray37);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 1, (int) (byte) 1, zipEncoding46);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (byte) 0, (int) (byte) -1, zipEncoding46);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 0, (int) (short) 0, zipEncoding46);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray14, (int) (short) 1, (int) (byte) 1, zipEncoding46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 3, (int) 'a', zipEncoding46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\001" + "'", str47, "\001");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(640L, byteArray2, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding48 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 1, (int) (byte) 1, zipEncoding48);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) ' ', zipEncoding48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\001" + "'", str49, "\001");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 0, byteArray7, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 10, byteArray3, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) ' ', (-1));
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray16, (int) (short) 0, (int) (byte) 1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 1, (int) (byte) 1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) 0, (int) (byte) -1, zipEncoding39);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, 0, (int) (short) 0, zipEncoding39);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 1, (int) (byte) 1, zipEncoding39);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean54 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray52, (int) (byte) 0);
        boolean boolean56 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray52, (int) (byte) 1);
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray71, (int) ' ', (-1));
        long long75 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray71);
        byte[] byteArray79 = new byte[] { (byte) 10 };
        long long80 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray79);
        byte[] byteArray85 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding88 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray85, 1, (int) (byte) 1, zipEncoding88);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray79, (int) (byte) 0, (int) (byte) -1, zipEncoding88);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray71, 2, (int) (short) 0, zipEncoding88);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) '#', (-1), zipEncoding88);
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, (int) (short) -1, (int) (short) 0, zipEncoding88);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (-1), zipEncoding88);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 310L + "'", long26 == 310L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\001" + "'", str40, "\001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 365L + "'", long63 == 365L);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 320L + "'", long75 == 320L);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 10L + "'", long80 == 10L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\001" + "'", str89, "\001");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 2, (int) (short) 0, zipEncoding43);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) '#', (-1), zipEncoding43);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) '#', (-1), zipEncoding43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 365L + "'", long18 == 365L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 320L + "'", long30 == 320L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 320L + "'", long40 == 320L);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1));
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 1, (int) (byte) 1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (byte) 0, (int) (byte) -1, zipEncoding38);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 2, (int) (short) 0, zipEncoding38);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) '#', (-1), zipEncoding38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (short) 10, zipEncoding38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 365L + "'", long13 == 365L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 320L + "'", long25 == 320L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\001" + "'", str39, "\001");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray7, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(11L, byteArray6, 2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(640L, byteArray7, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) ' ', (-1));
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray30, (int) (short) 0, (int) (byte) 1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 0, (int) (short) 0, zipEncoding53);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray21, (int) (short) 1, (int) (byte) 1, zipEncoding53);
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray63);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, (int) ' ', (-1));
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray72);
        byte[] byteArray80 = new byte[] { (byte) 10 };
        long long81 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray80);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding89 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray86, 1, (int) (byte) 1, zipEncoding89);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, (int) (byte) 0, (int) (byte) -1, zipEncoding89);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, 2, (int) (short) 0, zipEncoding89);
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) '#', (-1), zipEncoding89);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 100, (int) (short) -1, zipEncoding89);
        // The following exception was thrown during execution in test generation
        try {
            int int95 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray6, 10, (-1), zipEncoding89);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 310L + "'", long40 == 310L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 365L + "'", long64 == 365L);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 320L + "'", long76 == 320L);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10L + "'", long81 == 10L);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\001" + "'", str90, "\001");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (byte) 10, (int) (byte) 0, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 0, (-1), zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(367L, byteArray7, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 367=557 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 55, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 1, 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.Class<?> wildcardClass8 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 0, (-1), zipEncoding26);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray8, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long45 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray7, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 3, (int) (short) 0);
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
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(640L, byteArray2, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 132 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) -1, byteArray2, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 32 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(640L, byteArray7, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 640L + "'", long12 == 640L);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(310L, byteArray5, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 102 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 365L + "'", long6 == 365L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray7, 4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray2, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (byte) 0, (int) (byte) -1, zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 2, (int) (short) 0, zipEncoding42);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) '#', (-1), zipEncoding42);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0, zipEncoding42);
        java.lang.Class<?> wildcardClass48 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 365L + "'", long17 == 365L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 320L + "'", long29 == 320L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 3, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 320L + "'", long41 == 320L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 10, (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 53 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray6, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte[] byteArray0 = null;
        java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 10, byteArray2, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray1, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 4, byteArray3, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 86 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 2, (int) (short) 0, zipEncoding43);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) '#', (-1), zipEncoding43);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0, zipEncoding43);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray7, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 365L + "'", long18 == 365L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 320L + "'", long30 == 320L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) ' ', (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, 2, (int) (short) 0, zipEncoding29);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) '#', (-1), zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 100, byteArray7, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray17, (int) (byte) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray17, (int) (byte) 1);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) ' ', (-1));
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray36);
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, 2, (int) (short) 0, zipEncoding53);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) '#', (-1), zipEncoding53);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0, zipEncoding53);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (byte) -1, zipEncoding53);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray5, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 365L + "'", long28 == 365L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 320L + "'", long40 == 320L);
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray2, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(10L, byteArray6, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 640L + "'", long11 == 640L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0, zipEncoding20);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) 'a', (int) (byte) -1, zipEncoding24);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 2, (int) (byte) 1, zipEncoding24);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 0, 0);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (short) -1, (int) (short) 0, zipEncoding37);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (-1), zipEncoding37);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) ' ', (-1));
        long long58 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray54);
        byte[] byteArray62 = new byte[] { (byte) 10 };
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, 1, (int) (byte) 1, zipEncoding71);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (byte) 0, (int) (byte) -1, zipEncoding71);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 2, (int) (short) 0, zipEncoding71);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) '#', (-1), zipEncoding71);
        // The following exception was thrown during execution in test generation
        try {
            int int76 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 100, (int) (byte) 100, zipEncoding71);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 365L + "'", long46 == 365L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 320L + "'", long58 == 320L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\001" + "'", str72, "\001");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(365L, byteArray7, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 365=555 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray3, (int) (byte) 0, (int) (byte) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray17, (int) (short) 0, (int) (byte) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, (int) (short) 0, zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, (int) (short) 1, (int) (byte) 1, zipEncoding40);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray8, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 310L + "'", long27 == 310L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (short) -1, (int) (short) 0, zipEncoding25);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 10, 0, zipEncoding25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 1, (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray6, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(10L, byteArray6, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 132 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 98 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 151 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray2, 3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) -1, (int) (byte) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (-1));
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) -1, (int) (short) 0);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray19, (int) (short) 0, (int) (byte) 1);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 1, (int) (byte) 1, zipEncoding37);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray19, 0, (-1), zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) -1, 2, zipEncoding37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 310L + "'", long29 == 310L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\001" + "'", str38, "\001");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray6, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (byte) 0);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (int) '#', (int) ' ', zipEncoding22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(100L, byteArray4, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(365L, byteArray5, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 365=555 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 100, byteArray4, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) 1, zipEncoding7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray4, (int) (byte) 0, (int) (byte) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray4, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\001" + "'", str8, "\001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) ' ', (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, 2, (int) (short) 0, zipEncoding29);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) '#', (-1), zipEncoding29);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray42, (int) (byte) 0);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray42, (int) (byte) 1);
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray52);
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) ' ', (-1));
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray61);
        byte[] byteArray69 = new byte[] { (byte) 10 };
        long long70 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray69);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, 1, (int) (byte) 1, zipEncoding78);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray69, (int) (byte) 0, (int) (byte) -1, zipEncoding78);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, 2, (int) (short) 0, zipEncoding78);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, (int) '#', (-1), zipEncoding78);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (short) -1, (int) (short) 0, zipEncoding78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 0, (int) (short) 10, zipEncoding78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 365L + "'", long53 == 365L);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 320L + "'", long65 == 320L);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L + "'", long70 == 10L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\001" + "'", str79, "\001");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (short) -1, (int) (short) 0, zipEncoding19);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) 'a', (int) (byte) -1, zipEncoding23);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 2, (int) (byte) 1, zipEncoding23);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, 0);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (short) -1, (int) (short) 0, zipEncoding36);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) ' ', 1, zipEncoding36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 33 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '#', byteArray3, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) 'a', (int) (byte) -1, zipEncoding9);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(zipEncoding9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) 1, zipEncoding44);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) -1, (int) (byte) -1, zipEncoding44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: destination index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\001" + "'", str45, "\001");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) ' ', (-1));
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray45, 0, 0);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray45, 1, 3);
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long62 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray61);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) ' ', (-1));
        long long74 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray70);
        byte[] byteArray78 = new byte[] { (byte) 10 };
        long long79 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray78);
        byte[] byteArray84 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding87 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray84, 1, (int) (byte) 1, zipEncoding87);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray78, (int) (byte) 0, (int) (byte) -1, zipEncoding87);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 2, (int) (short) 0, zipEncoding87);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) '#', (-1), zipEncoding87);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 0, (int) (short) -1, zipEncoding87);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 100, 100, zipEncoding87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 320L + "'", long49 == 320L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 365L + "'", long62 == 365L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 320L + "'", long74 == 320L);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10L + "'", long79 == 10L);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\001" + "'", str88, "\001");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) 0, (int) ' ');
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, (int) (short) 10, (int) '4', zipEncoding22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 11 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(zipEncoding22);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 1, byteArray2, 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray16, (int) (byte) 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray16, (int) (byte) 1);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray43 = new byte[] { (byte) 10 };
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) (byte) 0, (int) (byte) -1, zipEncoding52);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 2, (int) (short) 0, zipEncoding52);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) '#', (-1), zipEncoding52);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0, zipEncoding52);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (int) (byte) -1, zipEncoding52);
        // The following exception was thrown during execution in test generation
        try {
            long long61 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 365L + "'", long27 == 365L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 320L + "'", long39 == 320L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 0, (int) (byte) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray2, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray16, (int) (byte) 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray16, (int) (byte) 1);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray43 = new byte[] { (byte) 10 };
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) (byte) 0, (int) (byte) -1, zipEncoding52);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 2, (int) (short) 0, zipEncoding52);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) '#', (-1), zipEncoding52);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0, zipEncoding52);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (int) (byte) -1, zipEncoding52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 365L + "'", long27 == 365L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 320L + "'", long39 == 320L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray6, 3, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 320L + "'", long41 == 320L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray1, 4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) ' ', (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, 2, (int) (short) 0, zipEncoding29);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) '#', (-1), zipEncoding29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }
}

