package org.apache.commons.compress.utils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray16);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray16);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray16);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray16);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray16);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray16);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray16, 0, (int) (byte) 0);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray16);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray16);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray16, 0, 0);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray16);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray16);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray16);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray16, (int) (byte) 0, 0);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray16, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray16);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray16);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray16);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray16);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray16);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray16);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray16);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray16);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray16, (int) (byte) 0, (int) (short) 0);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray16);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray16, 0, (int) (short) 0);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray16);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray16);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray16, 0, (int) (short) 0);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray16, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray16, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        byte[] byteArray19 = new byte[] {};
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray19);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray19);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray19);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray19);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray19);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray19);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray19, 0, (int) (byte) 0);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray19);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray19);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray19, 0, 0);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray19, (int) (short) 0, (int) (short) 0);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray19, (int) (short) 0, (int) (byte) 0);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray19);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray19);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray19);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray19);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray19);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray19);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray19);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        byte[] byteArray28 = new byte[] {};
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray28);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray28);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray28);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray28);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray28);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray28);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray28);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray28);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray28);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray28);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray28);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray28);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray28);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray28);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray28);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray28);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray28);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray28);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray28);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray28, (int) (short) 0, 0);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray28);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray28);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray28);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray28);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray28);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray28);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray28);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray28);
        java.lang.Class<?> wildcardClass59 = byteArray28.getClass();
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        byte[] byteArray29 = new byte[] {};
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray29);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray29);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray29);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray29);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray29);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray29);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray29);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray29);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray29);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray29);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray29);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray29);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray29);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray29);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray29);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray29);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray29);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray29);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray29);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray29);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray29);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray29);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray29, 0, (int) (byte) 0);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray29);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray29);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray29);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray29, 0, (int) (short) 0);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray29);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray29);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        byte[] byteArray17 = new byte[] {};
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray17);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray17);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray17);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray17);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray17);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray17);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray17);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray17);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray17, 0, 0);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray17);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray17);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray17);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray17);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray17);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray17);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray17, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray17, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15, 0, 0);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        byte[] byteArray28 = new byte[] {};
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray28);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray28);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray28);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray28);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray28);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray28);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray28);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray28);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray28);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray28, 0, 0);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray28);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray28);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray28);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray28);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray28, 0, (int) (short) 0);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray28);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray28);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray28);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray28);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray28);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray28);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray28);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray28);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray28);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray28);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray28, (int) (byte) 0, (int) (byte) 0);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray28);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray28);
        java.lang.Class<?> wildcardClass63 = byteArray28.getClass();
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        byte[] byteArray29 = new byte[] {};
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray29);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray29);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray29);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray29);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray29);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray29);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray29);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray29);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray29);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray29);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray29);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray29);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray29);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray29);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray29);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray29);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray29);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray29, 0, (int) (byte) 0);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray29, (int) (byte) 0, 0);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray29);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray29);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray29);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray29);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray29);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray29);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray29);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray29);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray29);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray29);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        byte[] byteArray21 = new byte[] {};
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray21);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray21);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray21);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray21);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray21);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray21);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray21);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray21);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray21);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray21, 0, 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray21);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray21);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray21);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray21);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray21);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray21, 0, 0);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray21);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray21);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray21);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray21, (int) (byte) 0, (int) (short) 0);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray21);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray26 = new byte[] {};
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray26);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray26);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray26);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray26);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray26);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray26);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray26);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray26);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray26);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray26);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray26);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray26);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray26);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray26);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray26);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray26);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray26);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray26);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray26);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray26, (int) (short) 0, 0);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray26);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray26);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray26);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray26, (int) (short) 0, (int) (short) 0);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray26, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray16);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray16);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray16);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray16);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray16);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray16);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray16);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray16);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray16, 0, 0);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray16);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray16);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray16);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray16, 0, (int) (byte) 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray16);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray16);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray16);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        byte[] byteArray17 = new byte[] {};
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray17);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray17);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray17);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray17);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray17);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray17);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray17, 0, 0);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray17, 0, 0);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray17);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray17);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray17);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray17);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray17);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray17);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray17);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray17);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray17);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15, (int) (byte) 0, (int) (short) 0);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15, 0, (int) (short) 0);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        java.io.InputStream inputStream29 = null;
        java.io.InputStream inputStream30 = null;
        byte[] byteArray31 = new byte[] {};
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream30, byteArray31);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream29, byteArray31);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray31);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray31);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray31);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray31);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray31);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray31);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray31);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray31);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray31);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray31);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray31);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray31, (int) (byte) 0, 0);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray31);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray31);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray31, 0, 0);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray31);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray31);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray31);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray31);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray31);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray31);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray31);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray31);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray31);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray31);
        int int63 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray31);
        int int64 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray31);
        int int65 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray31);
        int int66 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray31);
        java.lang.Class<?> wildcardClass67 = byteArray31.getClass();
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        byte[] byteArray22 = new byte[] {};
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray22);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray22);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray22);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray22);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray22);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray22);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray22);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray22);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray22);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray22);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray22);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray22);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray22);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray22);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray22, 0, (int) (short) 0);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray22);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray22);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray22);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray22);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray22);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray22, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        byte[] byteArray20 = new byte[] {};
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray20);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray20);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray20);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray20);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray20);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray20);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray20);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray20);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray20, 0, 0);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray20);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray20);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray20);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray20);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray20);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray20);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray20);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray20);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray20);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray20, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        byte[] byteArray25 = new byte[] {};
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray25);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray25);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray25);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray25);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray25);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray25);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray25);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray25);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray25);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray25);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray25);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray25);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray25);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray25);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray25, (int) (short) 0, (int) (byte) 0);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray25);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray25);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray25, 0, 0);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray25);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray25);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray25);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray25);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray25);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray25);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray25);
        java.lang.Class<?> wildcardClass55 = byteArray25.getClass();
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        java.io.InputStream inputStream29 = null;
        java.io.InputStream inputStream30 = null;
        java.io.InputStream inputStream31 = null;
        java.io.InputStream inputStream32 = null;
        java.io.InputStream inputStream33 = null;
        java.io.InputStream inputStream34 = null;
        byte[] byteArray35 = new byte[] {};
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream34, byteArray35);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream33, byteArray35);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream32, byteArray35);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream31, byteArray35);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream30, byteArray35);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream29, byteArray35);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray35);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray35);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray35);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray35, 0, 0);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray35);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray35);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray35);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray35);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray35);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray35);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray35);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray35);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray35);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray35);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray35);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray35);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray35);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray35);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray35);
        int int63 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray35);
        int int64 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray35);
        int int65 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray35);
        int int66 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray35);
        int int67 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray35);
        int int68 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray35);
        int int69 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray35);
        int int70 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray35);
        int int71 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray35);
        int int72 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray35);
        java.lang.Class<?> wildcardClass73 = byteArray35.getClass();
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        byte[] byteArray27 = new byte[] {};
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray27);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray27);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray27);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray27);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray27);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray27);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray27);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray27);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray27);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray27, 0, 0);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray27);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray27);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray27);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray27);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray27, 0, (int) (short) 0);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray27);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray27);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray27);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray27);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray27);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray27);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray27);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray27);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray27);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray27, (int) (byte) 0, 0);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray27, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray6);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray6);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray6);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray6);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        byte[] byteArray29 = new byte[] {};
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray29);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray29);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray29);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray29);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray29);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray29);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray29);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray29);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray29);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray29);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray29);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray29);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray29);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray29);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray29, (int) (short) 0, (int) (byte) 0);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray29);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray29);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray29);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray29);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray29);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray29);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray29);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray29);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray29);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray29);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray29);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray29);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray29);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray29);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        byte[] byteArray20 = new byte[] {};
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray20);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray20);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray20);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray20);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray20);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray20);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray20);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray20);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray20);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray20, 0, 0);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray20);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray20);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray20);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray20);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray20);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray20, (int) (short) 0, 0);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray20);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray20);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray20, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        byte[] byteArray23 = new byte[] {};
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray23);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray23);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray23);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray23);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray23);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray23);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray23);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray23);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray23);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray23);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray23);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray23);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray23);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray23);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray23, (int) (short) 0, (int) (byte) 0);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray23);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray23);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray23, 0, 0);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray23);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray23);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray23);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray23);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray23, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass53 = byteArray23.getClass();
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15, (int) (byte) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15, (int) (short) 0, (int) (byte) 0);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15);
        java.lang.Class<?> wildcardClass35 = byteArray15.getClass();
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        byte[] byteArray20 = new byte[] {};
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray20);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray20);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray20);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray20);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray20);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray20);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray20, 0, (int) (byte) 0);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray20);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray20);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray20);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray20);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray20);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray20);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray20, (int) (short) 0, 0);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray20);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray20);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray20);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray20);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray20, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray20, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        java.io.InputStream inputStream29 = null;
        java.io.InputStream inputStream30 = null;
        java.io.InputStream inputStream31 = null;
        java.io.InputStream inputStream32 = null;
        byte[] byteArray33 = new byte[] {};
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream32, byteArray33);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream31, byteArray33);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream30, byteArray33);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream29, byteArray33);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray33);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray33);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray33);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray33);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray33);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray33);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray33);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray33);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray33);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray33);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray33);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray33);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray33);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray33);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray33);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray33);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray33);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray33);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray33);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray33);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray33);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray33);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray33);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray33);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray33);
        int int63 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray33);
        int int64 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray33);
        int int65 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray33, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        byte[] byteArray22 = new byte[] {};
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray22);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray22);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray22);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray22);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray22);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray22);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray22);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray22);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray22, (int) (byte) 0, (int) (short) 0);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray22, (int) (short) 0, 0);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray22);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray22);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray22);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray22);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray22, 0, 0);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray22);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray22);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray22);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray22);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray22);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray22, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11, (int) (byte) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        java.io.InputStream inputStream29 = null;
        java.io.InputStream inputStream30 = null;
        byte[] byteArray31 = new byte[] {};
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream30, byteArray31);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream29, byteArray31);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray31);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray31);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray31);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray31);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray31);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray31);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray31);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray31);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray31);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray31);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray31);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray31);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray31);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray31);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray31);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray31);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray31);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray31);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray31);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray31);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray31);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray31);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray31);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray31);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray31);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray31);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray31);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray31, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        byte[] byteArray21 = new byte[] {};
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray21);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray21);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray21);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray21);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray21);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray21);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray21);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray21);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray21, (int) (byte) 0, (int) (short) 0);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray21);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray21, 0, (int) (short) 0);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray21);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray21);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray21);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray21);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray21);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray21);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray21);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray21, (int) (short) 0, 0);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray21, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        byte[] byteArray22 = new byte[] {};
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray22);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray22);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray22);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray22);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray22);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray22);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray22, 0, (int) (byte) 0);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray22);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray22);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray22, 0, 0);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray22);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray22);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray22);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray22, (int) (byte) 0, 0);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray22, (int) (byte) 0, 0);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray22);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray22);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray22);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray22);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray22);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray22, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        byte[] byteArray19 = new byte[] {};
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray19);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray19);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray19);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray19);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray19);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray19);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray19);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray19);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray19, (int) (byte) 0, (int) (short) 0);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray19);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray19);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray19);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray19);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray19);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray19);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray19);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray19);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray19, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, 0, 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, 0, (int) (byte) 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray18);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray18);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray18);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray18);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray18);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray18);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray18);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray18);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray18, (int) (byte) 0, (int) (short) 0);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray18);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray18);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray18);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray18);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray18);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray18);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray18);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray18, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        byte[] byteArray20 = new byte[] {};
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray20);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray20);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray20);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray20);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray20);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray20);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray20, 0, 0);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray20);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray20);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray20);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray20, 0, 0);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray20);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray20);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray20, (int) (byte) 0, (int) (byte) 0);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray20);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray20);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray20);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray20);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray20);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray20);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        java.io.InputStream inputStream29 = null;
        java.io.InputStream inputStream30 = null;
        java.io.InputStream inputStream31 = null;
        byte[] byteArray32 = new byte[] {};
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream31, byteArray32);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream30, byteArray32);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream29, byteArray32);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray32);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray32);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray32);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray32);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray32);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray32);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray32, 0, 0);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray32);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray32);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray32);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray32);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray32);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray32);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray32);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray32);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray32, 0, (int) (short) 0);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray32);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray32);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray32);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray32);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray32);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray32);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray32);
        int int63 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray32);
        int int64 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray32);
        int int67 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray32, (int) (byte) 0, (int) (short) 0);
        int int68 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray32);
        int int69 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray32, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray18);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray18);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray18);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray18);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray18, (int) (byte) 0, 0);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray18);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray18);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray18);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray18);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray18);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray18);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray18);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray18);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray18);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray18, (int) (byte) 0, (int) (short) 0);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray18);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray18, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray18);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray18);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray18);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray18);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray18);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray18);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray18);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray18);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray18, (int) (byte) 0, (int) (short) 0);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray18);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray18, 0, (int) (short) 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray18);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray18);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray18, 0, (int) (short) 0);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray18, (int) (byte) 0, (int) (byte) 0);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray18);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray18, 0, (int) (short) 0);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray18, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass49 = byteArray18.getClass();
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        java.io.InputStream inputStream29 = null;
        byte[] byteArray30 = new byte[] {};
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream29, byteArray30);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray30);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray30);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray30);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray30);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray30);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray30);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray30);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray30);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray30);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray30);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray30);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray30);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray30);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray30);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray30);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray30);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray30, 0, (int) (byte) 0);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray30, (int) (byte) 0, 0);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray30);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray30);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray30);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray30);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray30);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray30);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray30, (int) (byte) 0, (int) (short) 0);
        int int63 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray30);
        int int64 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray30);
        int int65 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray30, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8, 0, 0);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        byte[] byteArray22 = new byte[] {};
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray22);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray22);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray22);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray22);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray22);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray22);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray22);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray22);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray22, (int) (byte) 0, (int) (short) 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray22);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray22, 0, (int) (short) 0);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray22);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray22);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray22, 0, (int) (short) 0);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray22);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray22);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray22);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray22);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray22, 0, (int) (short) 0);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray22);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray22, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, 0, 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray26 = new byte[] {};
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray26);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray26);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray26);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray26);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray26);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray26);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray26);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray26);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray26);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray26, 0, 0);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray26);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray26);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray26);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray26);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray26, 0, (int) (short) 0);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray26);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray26);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray26);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray26);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray26);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray26);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray26);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray26);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray26);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray26);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray26, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass59 = byteArray26.getClass();
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        byte[] byteArray21 = new byte[] {};
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray21);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray21);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray21);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray21);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray21);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray21);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray21, 0, (int) (byte) 0);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray21);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray21);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray21, 0, 0);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray21);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray21);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray21);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray21, (int) (byte) 0, 0);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray21, 0, (int) (short) 0);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray21);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray21);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray21);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray21);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray21, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11, (int) (byte) 0, 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11, 0, 0);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14, (int) (byte) 0, (int) (short) 0);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14, 0, 0);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        byte[] byteArray19 = new byte[] {};
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray19);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray19);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray19);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray19);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray19);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray19);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray19);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray19);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray19);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray19);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray19);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray19);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray19);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray19);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray19, (int) (short) 0, (int) (byte) 0);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray19);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray19);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray19, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray19, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        byte[] byteArray20 = new byte[] {};
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray20);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray20);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray20);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray20);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray20);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray20);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray20);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray20);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray20);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray20, 0, 0);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray20);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray20, 0, 0);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray20);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray20);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray20);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray20, (int) (short) 0, (int) (byte) 0);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray20);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray20);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray20, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        java.io.InputStream inputStream29 = null;
        java.io.InputStream inputStream30 = null;
        java.io.InputStream inputStream31 = null;
        java.io.InputStream inputStream32 = null;
        byte[] byteArray33 = new byte[] {};
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream32, byteArray33);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream31, byteArray33);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream30, byteArray33);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream29, byteArray33);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray33);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray33);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray33);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray33);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray33);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray33, 0, 0);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray33);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray33);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray33);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray33);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray33);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray33);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray33);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray33);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray33);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray33);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray33);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray33);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray33);
        int int59 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray33);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray33);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray33);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray33);
        int int63 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray33);
        int int64 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray33);
        int int65 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray33);
        int int66 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray33);
        int int69 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray33, (int) (short) 0, 0);
        int int70 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray33);
        java.lang.Class<?> wildcardClass71 = byteArray33.getClass();
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12, 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray18);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray18);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray18);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray18);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray18);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray18);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray18);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray18);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray18, (int) (byte) 0, (int) (short) 0);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray18);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray18, 0, (int) (short) 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray18);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray18);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray18, 0, (int) (short) 0);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray18, (int) (byte) 0, (int) (byte) 0);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray18);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray18);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray18);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        byte[] byteArray26 = new byte[] {};
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray26);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray26);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray26);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray26);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray26);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray26);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray26);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray26);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray26);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray26);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray26);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray26);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray26);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray26);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray26);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray26);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray26);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray26, 0, (int) (byte) 0);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray26, (int) (byte) 0, 0);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray26, 0, (int) (short) 0);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray26);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray26);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray26);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray26);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray26);
        int int58 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray26);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        byte[] byteArray27 = new byte[] {};
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray27);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray27);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray27);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray27);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray27);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray27);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray27);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray27);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray27);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray27);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray27);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray27);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray27);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray27);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray27);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray27);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray27);
        int int47 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray27, 0, (int) (byte) 0);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray27, (int) (byte) 0, 0);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray27);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray27);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray27);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray27);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray27);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray27);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray27, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, 0, (int) (byte) 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15, 0, 0);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15, (int) (short) 0, (int) (short) 0);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15, (int) (short) 0, (int) (byte) 0);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray16);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray16);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray16);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray16);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray16);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray16);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray16, 0, 0);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray16);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray16);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray16);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray16, 0, 0);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray16);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray16);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray16, (int) (byte) 0, (int) (byte) 0);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray16, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        byte[] byteArray19 = new byte[] {};
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray19);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray19);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray19);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray19);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray19);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray19);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray19);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray19);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray19, (int) (byte) 0, (int) (short) 0);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray19, (int) (short) 0, 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray19);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray19);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray19);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray19);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray19);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray19, 0, (int) (short) 0);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray19);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray19, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray19, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        byte[] byteArray22 = new byte[] {};
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray22);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray22);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray22);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray22);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray22);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray22);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray22, 0, 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray22, (int) (short) 0, (int) (short) 0);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray22);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray22);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray22);
        int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray22, 0, (int) (byte) 0);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray22);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray22);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray22);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray22);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray22);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray22, (int) (short) 0, 0);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray22, (int) (byte) 0, (int) (byte) 0);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray22);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray22);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray22);
        java.lang.Class<?> wildcardClass55 = byteArray22.getClass();
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        java.io.InputStream inputStream18 = null;
        java.io.InputStream inputStream19 = null;
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream21 = null;
        java.io.InputStream inputStream22 = null;
        java.io.InputStream inputStream23 = null;
        java.io.InputStream inputStream24 = null;
        java.io.InputStream inputStream25 = null;
        java.io.InputStream inputStream26 = null;
        java.io.InputStream inputStream27 = null;
        java.io.InputStream inputStream28 = null;
        byte[] byteArray29 = new byte[] {};
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream28, byteArray29);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream27, byteArray29);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream26, byteArray29);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream25, byteArray29);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream24, byteArray29);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream23, byteArray29);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream22, byteArray29);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream21, byteArray29);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream20, byteArray29);
        int int41 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream19, byteArray29, 0, 0);
        int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream18, byteArray29);
        int int43 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray29);
        int int44 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray29);
        int int45 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray29);
        int int48 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray29, 0, (int) (short) 0);
        int int49 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray29);
        int int50 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray29);
        int int51 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray29);
        int int52 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray29);
        int int53 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray29);
        int int54 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray29);
        int int55 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray29);
        int int56 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray29);
        int int57 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray29);
        int int60 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray29, (int) (byte) 0, 0);
        int int61 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray29);
        int int62 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray29);
        int int63 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray29);
        int int64 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray29);
        java.lang.Class<?> wildcardClass65 = byteArray29.getClass();
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }
}

