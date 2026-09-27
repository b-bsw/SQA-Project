package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip((long) (byte) 113);
        byte[] byteArray5 = inputStream0.readAllBytes();
        long long7 = inputStream0.skip((long) (-1));
        boolean boolean8 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 123);
        byte[] byteArray12 = inputStream0.readNBytes(2);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        long long7 = inputStream0.skip((long) (byte) 100);
        boolean boolean8 = inputStream0.markSupported();
        boolean boolean9 = inputStream0.markSupported();
        long long11 = inputStream0.skip(10L);
        inputStream0.mark((int) (short) 5);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        long long13 = inputStream0.skip((long) (byte) 126);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        byte[] byteArray3 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray5 = inputStream0.readNBytes(0);
        boolean boolean6 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = inputStream0.readNBytes((int) (short) -21267);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 114);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 114, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        inputStream0.mark((int) (byte) 118);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(8257536);
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        boolean boolean37 = inputStream36.markSupported();
        inputStream36.mark(8257536);
        byte[] byteArray40 = inputStream36.readAllBytes();
        long long42 = inputStream36.skip((long) (byte) 125);
        java.io.InputStream inputStream43 = java.io.InputStream.nullInputStream();
        boolean boolean44 = inputStream43.markSupported();
        inputStream43.mark(8257536);
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.clone(byteArray48);
        byte[] byteArray50 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray48);
        int int51 = inputStream43.read(byteArray50);
        byte[] byteArray53 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray54 = org.apache.commons.lang3.SerializationUtils.clone(byteArray53);
        int int55 = inputStream43.read(byteArray54);
        java.io.InputStream inputStream56 = java.io.InputStream.nullInputStream();
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int61 = inputStream56.readNBytes(byteArray58, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int63 = inputStream43.read(byteArray62);
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray66 = org.apache.commons.lang3.SerializationUtils.clone(byteArray65);
        java.lang.Object obj67 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray65);
        java.lang.Object obj68 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray65);
        int int69 = inputStream43.read(byteArray65);
        inputStream43.mark((int) (byte) 118);
        byte[] byteArray73 = inputStream43.readNBytes((int) (byte) 122);
        int int74 = inputStream36.read(byteArray73);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = inputStream0.readNBytes(byteArray73, (int) (byte) 123, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [123, 123 + 52) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (short) 0 + "'", obj67, (short) 0);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (short) 0 + "'", obj68, (short) 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        byte[] byteArray20 = inputStream0.readNBytes((int) '#');
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark(8257536);
        long long26 = inputStream21.skip((long) ' ');
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int29 = inputStream21.read(byteArray28);
        inputStream21.mark((int) (byte) 118);
        long long33 = inputStream21.skip((long) (byte) 112);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.clone(byteArray35);
        java.lang.Object obj37 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray35);
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray35);
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray35);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray35);
        java.lang.Object obj41 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray35);
        int int42 = inputStream21.read(byteArray35);
        byte[] byteArray43 = inputStream21.readAllBytes();
        int int44 = inputStream0.read(byteArray43);
        inputStream0.mark((int) (byte) 115);
        java.io.OutputStream outputStream47 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long48 = inputStream0.transferTo(outputStream47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 0 + "'", obj37, (short) 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 0 + "'", obj38, (short) 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 0 + "'", obj39, (short) 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 0 + "'", obj40, (short) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) 0 + "'", obj41, (short) 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        long long10 = inputStream0.skip((long) ' ');
        byte[] byteArray11 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 123);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 117);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        byte[] byteArray12 = inputStream0.readNBytes((int) (byte) 16);
        long long14 = inputStream0.skip((long) (short) -21267);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1.0d) + "'", obj2, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0d) + "'", obj3, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark(8257536);
        boolean boolean17 = inputStream0.markSupported();
        long long19 = inputStream0.skip((long) 10);
        byte[] byteArray20 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream22 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader21);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark(8257536);
        byte[] byteArray18 = inputStream0.readNBytes(100);
        long long20 = inputStream0.skip((long) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        java.lang.Object obj23 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.io.Serializable serializable24 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22);
        int int26 = inputStream0.read(byteArray25);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25, outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100 + "'", obj23, 100);
        org.junit.Assert.assertNotNull(serializable24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        boolean boolean6 = inputStream0.markSupported();
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray8 = inputStream0.readAllBytes();
        byte[] byteArray10 = inputStream0.readNBytes((int) (byte) 118);
        inputStream0.mark((-1));
        inputStream0.mark((int) (byte) 10);
        boolean boolean15 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.security.Permission permission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.Permission permission4 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) basicPermission3);
        java.security.Permission permission5 = org.apache.commons.lang3.SerializationUtils.clone(permission4);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(permission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(permission4);
        org.junit.Assert.assertNotNull(permission5);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        inputStream0.mark((int) (short) 100);
        boolean boolean18 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip((long) (byte) 113);
        byte[] byteArray5 = inputStream0.readAllBytes();
        long long7 = inputStream0.skip((long) (-1));
        boolean boolean8 = inputStream0.markSupported();
        boolean boolean9 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream11 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        inputStream0.mark(2);
        inputStream0.mark((int) (short) 0);
        inputStream0.mark((int) (short) -21267);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int38 = inputStream0.read(byteArray37);
        inputStream0.mark((int) (byte) 4);
        byte[] byteArray41 = inputStream0.readAllBytes();
        long long43 = inputStream0.skip((long) (byte) 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int25 = inputStream0.read(byteArray24);
        java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        java.lang.Object obj27 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0d) + "'", obj26, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0d) + "'", obj27, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        inputStream0.mark((int) (byte) 0);
        byte[] byteArray17 = inputStream0.readNBytes((int) (byte) 2);
        boolean boolean18 = inputStream0.markSupported();
        inputStream0.mark(100);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark(8257536);
        inputStream21.mark((int) (byte) 8);
        inputStream21.mark((int) (byte) 123);
        inputStream21.mark(0);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        long long33 = inputStream31.skip((long) (short) 1);
        long long35 = inputStream31.skip(0L);
        inputStream31.mark((int) (byte) 100);
        inputStream31.mark((int) (byte) 113);
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        boolean boolean41 = inputStream40.markSupported();
        inputStream40.mark(8257536);
        byte[] byteArray44 = inputStream40.readAllBytes();
        long long46 = inputStream40.skip((long) (byte) 125);
        boolean boolean47 = inputStream40.markSupported();
        byte[] byteArray49 = inputStream40.readNBytes((int) '#');
        byte[] byteArray50 = inputStream40.readAllBytes();
        int int51 = inputStream31.read(byteArray50);
        byte[] byteArray53 = inputStream31.readNBytes((int) (byte) 124);
        byte[] byteArray54 = inputStream31.readAllBytes();
        byte[] byteArray55 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray54);
        int int56 = inputStream21.read(byteArray54);
        int int57 = inputStream0.read(byteArray54);
        byte[] byteArray58 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        boolean boolean23 = inputStream0.markSupported();
        long long25 = inputStream0.skip(0L);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        long long28 = inputStream26.skip((long) (short) 1);
        long long30 = inputStream26.skip(0L);
        long long32 = inputStream26.skip((long) (byte) -1);
        boolean boolean33 = inputStream26.markSupported();
        byte[] byteArray35 = inputStream26.readNBytes((int) (byte) 8);
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        long long38 = inputStream36.skip((long) (short) 1);
        long long40 = inputStream36.skip(0L);
        long long42 = inputStream36.skip((long) (byte) -1);
        java.io.InputStream inputStream43 = java.io.InputStream.nullInputStream();
        boolean boolean44 = inputStream43.markSupported();
        inputStream43.mark(8257536);
        byte[] byteArray47 = inputStream43.readAllBytes();
        int int48 = inputStream36.read(byteArray47);
        byte[] byteArray49 = inputStream36.readAllBytes();
        byte[] byteArray51 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray52 = org.apache.commons.lang3.SerializationUtils.clone(byteArray51);
        java.lang.Object obj53 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray51);
        byte[] byteArray54 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray51);
        int int55 = inputStream36.read(byteArray51);
        byte[] byteArray56 = inputStream36.readAllBytes();
        int int57 = inputStream26.read(byteArray56);
        int int58 = inputStream0.read(byteArray56);
        inputStream0.mark((int) (short) 10);
        java.io.InputStream inputStream61 = java.io.InputStream.nullInputStream();
        long long63 = inputStream61.skip((long) (short) 1);
        long long65 = inputStream61.skip(0L);
        byte[] byteArray67 = inputStream61.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream68 = java.io.InputStream.nullInputStream();
        boolean boolean69 = inputStream68.markSupported();
        inputStream68.mark(8257536);
        byte[] byteArray73 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray74 = org.apache.commons.lang3.SerializationUtils.clone(byteArray73);
        byte[] byteArray75 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray73);
        int int76 = inputStream68.read(byteArray75);
        byte[] byteArray78 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray79 = org.apache.commons.lang3.SerializationUtils.clone(byteArray78);
        int int80 = inputStream68.read(byteArray79);
        java.lang.Object obj81 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray79);
        int int82 = inputStream61.read(byteArray79);
        java.lang.Object obj83 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray79);
        java.lang.Object obj84 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray79);
        byte[] byteArray85 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray79);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = inputStream0.readNBytes(byteArray79, (int) (byte) 118, (int) (short) -21267);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [118, 118 + -21267) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) 0 + "'", obj53, (short) 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(inputStream61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + (short) 0 + "'", obj81, (short) 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (short) 0 + "'", obj83, (short) 0);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (short) 0 + "'", obj84, (short) 0);
        org.junit.Assert.assertNotNull(byteArray85);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int15 = inputStream7.read(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream7.read(byteArray18);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        int int21 = inputStream0.read(byteArray18);
        boolean boolean22 = inputStream0.markSupported();
        java.lang.Class<?> wildcardClass23 = inputStream0.getClass();
        java.lang.Class<?> wildcardClass24 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass23);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int8 = inputStream3.readNBytes(byteArray5, (int) (byte) 16, (int) (byte) 2);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        int int11 = inputStream0.read(byteArray5);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 118);
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray16 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 0 + "'", obj9, (short) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 0 + "'", obj10, (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        boolean boolean12 = inputStream8.markSupported();
        long long14 = inputStream8.skip((long) (byte) 112);
        inputStream8.mark(1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray21 = inputStream17.readAllBytes();
        inputStream17.mark(1);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int29 = inputStream24.readNBytes(byteArray26, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int31 = inputStream17.read(byteArray30);
        int int32 = inputStream8.read(byteArray30);
        boolean boolean33 = inputStream8.markSupported();
        byte[] byteArray34 = inputStream8.readAllBytes();
        inputStream8.mark((int) (byte) 119);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        int int41 = inputStream8.read(byteArray38);
        int int42 = inputStream0.read(byteArray38);
        byte[] byteArray44 = inputStream0.readNBytes((int) (byte) 123);
        boolean boolean45 = inputStream0.markSupported();
        byte[] byteArray46 = inputStream0.readAllBytes();
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.clone(byteArray48);
        java.lang.Object obj50 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray48);
        java.lang.Object obj51 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray48);
        byte[] byteArray52 = org.apache.commons.lang3.SerializationUtils.clone(byteArray48);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = inputStream0.readNBytes(byteArray48, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 10) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (short) 0 + "'", obj50, (short) 0);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) 0 + "'", obj51, (short) 0);
        org.junit.Assert.assertNotNull(byteArray52);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        boolean boolean10 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream12 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray9);
        java.lang.Object obj11 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray9);
        int int12 = inputStream0.read(byteArray9);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray9, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        boolean boolean23 = inputStream0.markSupported();
        long long25 = inputStream0.skip((long) (byte) 120);
        inputStream0.mark((int) (byte) 16);
        byte[] byteArray28 = inputStream0.readAllBytes();
        byte[] byteArray29 = inputStream0.readAllBytes();
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray29);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        inputStream0.mark(1);
        long long15 = inputStream0.skip((long) (short) 10);
        boolean boolean16 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 115);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        java.io.Serializable serializable18 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray13);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13, outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 2 + "'", obj15, (byte) 2);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 2 + "'", obj17, (byte) 2);
        org.junit.Assert.assertNotNull(serializable18);
        org.junit.Assert.assertNotNull(byteArray19);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        int int17 = inputStream0.read(byteArray16);
        byte[] byteArray18 = inputStream0.readAllBytes();
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        long long21 = inputStream19.skip((long) (short) 1);
        long long23 = inputStream19.skip(0L);
        inputStream19.mark((int) (byte) 100);
        byte[] byteArray26 = inputStream19.readAllBytes();
        byte[] byteArray27 = inputStream19.readAllBytes();
        int int28 = inputStream0.read(byteArray27);
        boolean boolean29 = inputStream0.markSupported();
        byte[] byteArray31 = inputStream0.readNBytes((int) (byte) 121);
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 121);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray32);
        java.lang.Class<?> wildcardClass34 = byteArray33.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        long long9 = inputStream0.skip((long) 2);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        long long12 = inputStream10.skip((long) (short) 1);
        long long14 = inputStream10.skip(0L);
        byte[] byteArray16 = inputStream10.readNBytes((int) (byte) 125);
        byte[] byteArray17 = inputStream10.readAllBytes();
        inputStream10.mark(100);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        long long22 = inputStream20.skip((long) (short) 1);
        long long24 = inputStream20.skip(0L);
        long long26 = inputStream20.skip((long) (byte) -1);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark(8257536);
        byte[] byteArray31 = inputStream27.readAllBytes();
        int int32 = inputStream20.read(byteArray31);
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        inputStream33.mark(8257536);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray38);
        int int41 = inputStream33.read(byteArray40);
        int int42 = inputStream20.read(byteArray40);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int45 = inputStream20.read(byteArray44);
        int int46 = inputStream10.read(byteArray44);
        int int47 = inputStream0.read(byteArray44);
        byte[] byteArray49 = inputStream0.readNBytes((int) (byte) 116);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        java.io.SerializablePermission serializablePermission7 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission8 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission7);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission8);
        int int12 = inputStream0.readNBytes(byteArray9, (int) (byte) 112, 10);
        boolean boolean13 = inputStream0.markSupported();
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 112);
        byte[] byteArray16 = inputStream0.readAllBytes();
        byte[] byteArray18 = inputStream0.readNBytes((int) (byte) 124);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(serializablePermission7);
        org.junit.Assert.assertNotNull(permission8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        long long10 = inputStream0.skip((long) (short) 5);
        inputStream0.mark((int) (byte) 119);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = inputStream0.readNBytes((int) (short) -21267);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readNBytes((int) (byte) 115);
        inputStream0.mark((int) (byte) 4);
        boolean boolean8 = inputStream0.markSupported();
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark(2);
        boolean boolean12 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.Permission permission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.io.SerializablePermission serializablePermission4 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission5 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(basicPermission1);
        org.junit.Assert.assertNotNull(basicPermission2);
        org.junit.Assert.assertNotNull(permission3);
        org.junit.Assert.assertNotNull(serializablePermission4);
        org.junit.Assert.assertNotNull(serializablePermission5);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray21 = inputStream0.readAllBytes();
        boolean boolean22 = inputStream0.markSupported();
        long long24 = inputStream0.skip((long) (byte) 121);
        byte[] byteArray25 = inputStream0.readAllBytes();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray26);
        java.lang.Class<?> wildcardClass28 = byteArray27.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readNBytes((int) (byte) 115);
        byte[] byteArray7 = inputStream0.readNBytes((int) (byte) 124);
        long long9 = inputStream0.skip((long) (short) 0);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        long long12 = inputStream10.skip((long) (short) 1);
        long long14 = inputStream10.skip(0L);
        byte[] byteArray16 = inputStream10.readNBytes((int) (byte) 125);
        byte[] byteArray17 = inputStream10.readAllBytes();
        byte[] byteArray18 = inputStream10.readAllBytes();
        boolean boolean19 = inputStream10.markSupported();
        byte[] byteArray20 = inputStream10.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = inputStream0.readNBytes(byteArray20, (int) (byte) 122, (int) (byte) 119);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [122, 122 + 119) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes((int) (byte) 121);
        long long4 = inputStream0.skip((long) (byte) 114);
        byte[] byteArray5 = inputStream0.readAllBytes();
        boolean boolean6 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        long long15 = inputStream0.skip(100L);
        long long17 = inputStream0.skip((long) (byte) 124);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (short) -21267);
        long long20 = inputStream0.skip((long) ' ');
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray23);
        int int27 = inputStream0.readNBytes(byteArray23, 0, (int) (short) 10);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 10);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip((long) (byte) 113);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int8 = inputStream3.readNBytes(byteArray5, (int) (byte) 16, (int) (byte) 2);
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        java.lang.Object obj10 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray5);
        int int11 = inputStream0.read(byteArray5);
        byte[] byteArray13 = inputStream0.readNBytes((int) (short) 100);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark(8257536);
        byte[] byteArray18 = inputStream14.readAllBytes();
        long long20 = inputStream14.skip((long) (byte) 125);
        boolean boolean21 = inputStream14.markSupported();
        byte[] byteArray23 = inputStream14.readNBytes((int) '#');
        byte[] byteArray24 = inputStream14.readAllBytes();
        int int25 = inputStream0.read(byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Class<?> wildcardClass28 = byteArray27.getClass();
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray27);
        int int30 = inputStream0.read(byteArray27);
        inputStream0.mark((int) (byte) 115);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.clone(byteArray34);
        java.lang.Object obj36 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        int int37 = inputStream0.read(byteArray34);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 0 + "'", obj9, (short) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 0 + "'", obj10, (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 113 + "'", obj36, (byte) 113);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 112);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.clone(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 122);
        long long32 = inputStream0.skip((long) (byte) 119);
        byte[] byteArray34 = inputStream0.readNBytes((int) (byte) 125);
        boolean boolean35 = inputStream0.markSupported();
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        boolean boolean37 = inputStream36.markSupported();
        inputStream36.mark(8257536);
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.clone(byteArray41);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray41);
        int int44 = inputStream36.read(byteArray43);
        byte[] byteArray46 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray47 = org.apache.commons.lang3.SerializationUtils.clone(byteArray46);
        int int48 = inputStream36.read(byteArray47);
        java.io.InputStream inputStream49 = java.io.InputStream.nullInputStream();
        byte[] byteArray51 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int54 = inputStream49.readNBytes(byteArray51, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray55 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int56 = inputStream36.read(byteArray55);
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray59 = org.apache.commons.lang3.SerializationUtils.clone(byteArray58);
        java.lang.Object obj60 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray58);
        java.lang.Object obj61 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray58);
        int int62 = inputStream36.read(byteArray58);
        inputStream36.mark((int) (byte) 118);
        byte[] byteArray66 = inputStream36.readNBytes((int) (byte) 122);
        inputStream36.mark((int) (byte) 4);
        byte[] byteArray69 = inputStream36.readAllBytes();
        byte[] byteArray71 = inputStream36.readNBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = inputStream0.readNBytes(byteArray71, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [35, 35 + 1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (short) 0 + "'", obj60, (short) 0);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (short) 0 + "'", obj61, (short) 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        int int17 = inputStream0.read(byteArray16);
        byte[] byteArray18 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        boolean boolean21 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        long long16 = inputStream0.skip((long) (byte) 113);
        long long18 = inputStream0.skip((long) 'a');
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = inputStream0.transferTo(outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        int int17 = inputStream0.read(byteArray16);
        byte[] byteArray18 = inputStream0.readAllBytes();
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        long long21 = inputStream19.skip((long) (short) 1);
        long long23 = inputStream19.skip(0L);
        inputStream19.mark((int) (byte) 100);
        byte[] byteArray26 = inputStream19.readAllBytes();
        byte[] byteArray27 = inputStream19.readAllBytes();
        int int28 = inputStream0.read(byteArray27);
        boolean boolean29 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 8);
        byte[] byteArray17 = inputStream0.readNBytes(0);
        long long19 = inputStream0.skip((long) 10);
        inputStream0.mark((int) ' ');
        byte[] byteArray23 = inputStream0.readNBytes((int) ' ');
        long long25 = inputStream0.skip((long) (byte) 120);
        inputStream0.mark((int) (byte) 122);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark(8257536);
        byte[] byteArray32 = inputStream28.readAllBytes();
        long long34 = inputStream28.skip((long) '4');
        boolean boolean35 = inputStream28.markSupported();
        long long37 = inputStream28.skip(100L);
        byte[] byteArray39 = inputStream28.readNBytes((int) (byte) 118);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray39);
        int int41 = inputStream0.read(byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream0.read(byteArray18);
        byte[] byteArray20 = inputStream0.readAllBytes();
        byte[] byteArray21 = inputStream0.readAllBytes();
        long long23 = inputStream0.skip((long) (short) 1);
        byte[] byteArray24 = inputStream0.readAllBytes();
        byte[] byteArray25 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 0 + "'", obj14, (short) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        long long22 = inputStream20.skip((long) (short) 1);
        long long24 = inputStream20.skip(0L);
        long long26 = inputStream20.skip((long) (byte) -1);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark(8257536);
        byte[] byteArray31 = inputStream27.readAllBytes();
        int int32 = inputStream20.read(byteArray31);
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        inputStream33.mark(8257536);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray38);
        int int41 = inputStream33.read(byteArray40);
        int int42 = inputStream20.read(byteArray40);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        java.lang.Object obj44 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        int int48 = inputStream0.readNBytes(byteArray45, (int) (byte) 10, (int) (byte) 0);
        boolean boolean49 = inputStream0.markSupported();
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        boolean boolean51 = inputStream50.markSupported();
        inputStream50.mark(8257536);
        byte[] byteArray54 = inputStream50.readAllBytes();
        long long56 = inputStream50.skip((long) (byte) 125);
        boolean boolean57 = inputStream50.markSupported();
        byte[] byteArray59 = inputStream50.readNBytes((int) '#');
        boolean boolean60 = inputStream50.markSupported();
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        int int63 = inputStream50.read(byteArray62);
        java.io.Serializable serializable64 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray62);
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray62);
        int int66 = inputStream0.read(byteArray65);
        boolean boolean67 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 115);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(serializable64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int13 = inputStream0.read(byteArray12);
        boolean boolean14 = inputStream0.markSupported();
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        long long17 = inputStream15.skip((long) (short) 1);
        long long19 = inputStream15.skip(0L);
        long long21 = inputStream15.skip((long) (byte) -1);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark(8257536);
        byte[] byteArray26 = inputStream22.readAllBytes();
        int int27 = inputStream15.read(byteArray26);
        inputStream15.mark((int) (byte) 121);
        java.io.InputStream inputStream30 = java.io.InputStream.nullInputStream();
        long long32 = inputStream30.skip((long) (short) 1);
        byte[] byteArray34 = inputStream30.readNBytes((int) (byte) 116);
        int int35 = inputStream15.read(byteArray34);
        boolean boolean36 = inputStream15.markSupported();
        byte[] byteArray37 = inputStream15.readAllBytes();
        int int38 = inputStream0.read(byteArray37);
        byte[] byteArray40 = inputStream0.readNBytes((int) (byte) 123);
        long long42 = inputStream0.skip((long) (byte) 124);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        boolean boolean12 = inputStream8.markSupported();
        long long14 = inputStream8.skip((long) (byte) 112);
        inputStream8.mark(1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray21 = inputStream17.readAllBytes();
        inputStream17.mark(1);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int29 = inputStream24.readNBytes(byteArray26, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int31 = inputStream17.read(byteArray30);
        int int32 = inputStream8.read(byteArray30);
        boolean boolean33 = inputStream8.markSupported();
        byte[] byteArray34 = inputStream8.readAllBytes();
        inputStream8.mark((int) (byte) 119);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        int int41 = inputStream8.read(byteArray38);
        int int42 = inputStream0.read(byteArray38);
        boolean boolean43 = inputStream0.markSupported();
        long long45 = inputStream0.skip((long) (short) 5);
        java.io.SerializablePermission serializablePermission46 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission47 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission46);
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission47);
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray48);
        java.lang.Object obj50 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray48);
        int int53 = inputStream0.readNBytes(byteArray48, (int) (byte) 124, (int) (short) 10);
        inputStream0.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(serializablePermission46);
        org.junit.Assert.assertNotNull(permission47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        java.lang.Object obj5 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Object obj6 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray4);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass7);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 118, (byte) 114, (byte) 0, (byte) 2, (byte) 91, (byte) 66, (byte) -84, (byte) -13, (byte) 23, (byte) -8, (byte) 6, (byte) 8, (byte) 84, (byte) -32, (byte) 2, (byte) 0, (byte) 0, (byte) 120, (byte) 112 });
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark((int) (byte) 123);
        byte[] byteArray17 = inputStream0.readAllBytes();
        byte[] byteArray19 = inputStream0.readNBytes((int) (short) 1);
        byte[] byteArray20 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip((long) (byte) 113);
        boolean boolean5 = inputStream0.markSupported();
        byte[] byteArray6 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray14 = inputStream0.readAllBytes();
        long long16 = inputStream0.skip((long) (byte) -1);
        inputStream0.mark((int) (byte) 4);
        inputStream0.mark((int) (byte) 121);
        long long22 = inputStream0.skip((long) (short) -21267);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray27 = inputStream23.readAllBytes();
        long long29 = inputStream23.skip((long) (byte) 125);
        inputStream23.mark(0);
        boolean boolean32 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) 100);
        inputStream23.mark((int) ' ');
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        long long39 = inputStream37.skip((long) (short) 1);
        long long41 = inputStream37.skip(0L);
        byte[] byteArray43 = inputStream37.readNBytes((int) (byte) 125);
        byte[] byteArray44 = inputStream37.readAllBytes();
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray44);
        int int46 = inputStream23.read(byteArray45);
        int int47 = inputStream0.read(byteArray45);
        java.io.InputStream inputStream48 = java.io.InputStream.nullInputStream();
        boolean boolean49 = inputStream48.markSupported();
        inputStream48.mark(8257536);
        byte[] byteArray52 = inputStream48.readAllBytes();
        long long54 = inputStream48.skip((long) (byte) 125);
        inputStream48.mark(0);
        boolean boolean57 = inputStream48.markSupported();
        inputStream48.mark((int) (byte) 100);
        inputStream48.mark((int) (byte) 120);
        inputStream48.mark((int) (byte) 0);
        byte[] byteArray65 = inputStream48.readNBytes((int) (byte) 2);
        boolean boolean66 = inputStream48.markSupported();
        inputStream48.mark(100);
        inputStream48.mark((int) '#');
        byte[] byteArray72 = inputStream48.readNBytes(8257536);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = inputStream0.readNBytes(byteArray72, (int) (byte) 122, (int) (byte) 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [122, 122 + 117) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 122);
        long long32 = inputStream0.skip((long) (byte) 119);
        byte[] byteArray34 = inputStream0.readNBytes((int) (byte) 125);
        boolean boolean35 = inputStream0.markSupported();
        boolean boolean36 = inputStream0.markSupported();
        long long38 = inputStream0.skip((long) (byte) 10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int38 = inputStream0.read(byteArray37);
        long long40 = inputStream0.skip((long) (byte) 112);
        boolean boolean41 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray30 = inputStream0.readNBytes((int) (byte) 122);
        inputStream0.mark((int) (byte) 4);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 121);
        int int35 = inputStream0.read(byteArray34);
        byte[] byteArray36 = inputStream0.readAllBytes();
        long long38 = inputStream0.skip((long) (byte) 1);
        long long40 = inputStream0.skip((long) 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        inputStream0.mark((int) (byte) 124);
        long long14 = inputStream0.skip((long) 10);
        byte[] byteArray16 = inputStream0.readNBytes((int) (byte) 121);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 120);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 8);
        inputStream0.mark((int) (byte) 116);
        byte[] byteArray13 = inputStream0.readNBytes(1);
        byte[] byteArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = inputStream0.readNBytes(byteArray14, (int) (byte) 113, 8257536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        byte[] byteArray10 = inputStream0.readAllBytes();
        byte[] byteArray12 = inputStream0.readNBytes(2);
        boolean boolean13 = inputStream0.markSupported();
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = inputStream14.readAllBytes();
        byte[] byteArray17 = inputStream14.readNBytes((int) (short) 100);
        byte[] byteArray19 = inputStream14.readNBytes(0);
        byte[] byteArray20 = inputStream14.readAllBytes();
        int int21 = inputStream0.read(byteArray20);
        byte[] byteArray23 = inputStream0.readNBytes((int) (byte) 116);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBCLASS_IMPLEMENTATION_PERMISSION;
        java.security.Permission permission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.security.Permission permission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission4 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission3);
        java.security.Permission permission5 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission3);
        java.security.BasicPermission basicPermission6 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission3);
        java.io.SerializablePermission serializablePermission7 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission3);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(permission1);
        org.junit.Assert.assertNotNull(permission2);
        org.junit.Assert.assertNotNull(serializablePermission3);
        org.junit.Assert.assertNotNull(serializablePermission4);
        org.junit.Assert.assertNotNull(permission5);
        org.junit.Assert.assertNotNull(basicPermission6);
        org.junit.Assert.assertNotNull(serializablePermission7);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        byte[] byteArray16 = inputStream15.readAllBytes();
        byte[] byteArray18 = inputStream15.readNBytes((int) (short) 100);
        byte[] byteArray20 = inputStream15.readNBytes(0);
        byte[] byteArray21 = inputStream15.readAllBytes();
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark(8257536);
        boolean boolean26 = inputStream22.markSupported();
        long long28 = inputStream22.skip((long) (byte) 112);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int32 = inputStream22.read(byteArray30);
        inputStream22.mark((int) (byte) 124);
        long long36 = inputStream22.skip((long) 10);
        byte[] byteArray38 = inputStream22.readNBytes((int) (byte) 121);
        int int39 = inputStream15.read(byteArray38);
        int int40 = inputStream0.read(byteArray38);
        inputStream0.mark((int) 'a');
        byte[] byteArray43 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int6 = inputStream0.read(byteArray5);
        long long8 = inputStream0.skip((long) 2);
        long long10 = inputStream0.skip((long) (byte) 119);
        boolean boolean11 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        long long10 = inputStream0.skip((long) '4');
        inputStream0.mark((int) (byte) 114);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 4);
        inputStream0.mark((int) (byte) 116);
        byte[] byteArray18 = inputStream0.readNBytes((int) (short) 5);
        byte[] byteArray20 = inputStream0.readNBytes(1);
        long long22 = inputStream0.skip(0L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        boolean boolean12 = inputStream8.markSupported();
        long long14 = inputStream8.skip((long) (byte) 112);
        inputStream8.mark(1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray21 = inputStream17.readAllBytes();
        inputStream17.mark(1);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int29 = inputStream24.readNBytes(byteArray26, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int31 = inputStream17.read(byteArray30);
        int int32 = inputStream8.read(byteArray30);
        boolean boolean33 = inputStream8.markSupported();
        byte[] byteArray34 = inputStream8.readAllBytes();
        inputStream8.mark((int) (byte) 119);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        int int41 = inputStream8.read(byteArray38);
        int int42 = inputStream0.read(byteArray38);
        long long44 = inputStream0.skip((-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((int) (byte) 118);
        long long12 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray14);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj19 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        int int21 = inputStream0.read(byteArray14);
        boolean boolean22 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 125);
        boolean boolean25 = inputStream0.markSupported();
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = inputStream0.transferTo(outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 0 + "'", obj18, (short) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 0 + "'", obj19, (short) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        long long12 = inputStream0.skip((long) (byte) 124);
        java.lang.Class<?> wildcardClass13 = inputStream0.getClass();
        java.lang.Class<?> wildcardClass14 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass13);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 118);
        long long17 = inputStream0.skip(0L);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        boolean boolean19 = inputStream18.markSupported();
        inputStream18.mark(8257536);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.clone(byteArray23);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray23);
        int int26 = inputStream18.read(byteArray25);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.clone(byteArray28);
        int int30 = inputStream18.read(byteArray29);
        byte[] byteArray32 = inputStream18.readNBytes((int) (byte) 123);
        long long34 = inputStream18.skip((long) 1);
        long long36 = inputStream18.skip((long) 8257536);
        boolean boolean37 = inputStream18.markSupported();
        java.io.InputStream inputStream38 = java.io.InputStream.nullInputStream();
        long long40 = inputStream38.skip((long) (short) 1);
        long long42 = inputStream38.skip(0L);
        long long44 = inputStream38.skip((long) (byte) -1);
        java.io.InputStream inputStream45 = java.io.InputStream.nullInputStream();
        boolean boolean46 = inputStream45.markSupported();
        inputStream45.mark(8257536);
        byte[] byteArray49 = inputStream45.readAllBytes();
        int int50 = inputStream38.read(byteArray49);
        java.io.InputStream inputStream51 = java.io.InputStream.nullInputStream();
        boolean boolean52 = inputStream51.markSupported();
        inputStream51.mark(8257536);
        byte[] byteArray56 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray57 = org.apache.commons.lang3.SerializationUtils.clone(byteArray56);
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray56);
        int int59 = inputStream51.read(byteArray58);
        int int60 = inputStream38.read(byteArray58);
        byte[] byteArray61 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray58);
        java.lang.Object obj62 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray58);
        byte[] byteArray63 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray58);
        int int66 = inputStream18.readNBytes(byteArray63, (int) (byte) 10, (int) (byte) 0);
        boolean boolean67 = inputStream18.markSupported();
        java.io.InputStream inputStream68 = java.io.InputStream.nullInputStream();
        boolean boolean69 = inputStream68.markSupported();
        inputStream68.mark(8257536);
        byte[] byteArray72 = inputStream68.readAllBytes();
        long long74 = inputStream68.skip((long) (byte) 125);
        boolean boolean75 = inputStream68.markSupported();
        byte[] byteArray77 = inputStream68.readNBytes((int) '#');
        boolean boolean78 = inputStream68.markSupported();
        byte[] byteArray80 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        int int81 = inputStream68.read(byteArray80);
        java.io.Serializable serializable82 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray80);
        byte[] byteArray83 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray80);
        int int84 = inputStream18.read(byteArray83);
        int int85 = inputStream0.read(byteArray83);
        java.lang.Object obj86 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray83);
        java.lang.Object obj87 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray83);
        java.lang.Object obj88 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray83);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(inputStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(inputStream51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(inputStream68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(serializable82);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(obj88);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        inputStream0.mark((int) (byte) 118);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray26, outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        inputStream0.mark((int) (short) -21267);
        boolean boolean11 = inputStream0.markSupported();
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray13);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int19 = inputStream0.read(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes((int) 'a');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        boolean boolean23 = inputStream0.markSupported();
        boolean boolean24 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readNBytes((int) (byte) 115);
        inputStream0.mark((int) (short) 0);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long30 = inputStream0.transferTo(outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((int) (byte) 118);
        long long12 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray14);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj19 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        int int21 = inputStream0.read(byteArray14);
        inputStream0.mark((int) (byte) 126);
        inputStream0.mark((int) 'a');
        boolean boolean26 = inputStream0.markSupported();
        byte[] byteArray28 = inputStream0.readNBytes((int) (byte) 116);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 0 + "'", obj18, (short) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 0 + "'", obj19, (short) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        long long7 = inputStream0.skip((long) (byte) 100);
        boolean boolean8 = inputStream0.markSupported();
        boolean boolean9 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream11 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.io.SerializablePermission serializablePermission4 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission4);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission4);
        java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray6);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(basicPermission1);
        org.junit.Assert.assertNotNull(basicPermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(serializablePermission4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = inputStream0.readNBytes((int) (short) 1);
        inputStream0.mark((int) (byte) 4);
        byte[] byteArray12 = inputStream0.readNBytes((int) (byte) 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip((long) (byte) 113);
        boolean boolean5 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 116);
        byte[] byteArray8 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 118);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark(8257536);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21);
        int int24 = inputStream16.read(byteArray23);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray26);
        int int28 = inputStream16.read(byteArray27);
        byte[] byteArray30 = inputStream16.readNBytes((int) (byte) 123);
        long long32 = inputStream16.skip((long) (byte) 100);
        long long34 = inputStream16.skip((long) (short) -21267);
        long long36 = inputStream16.skip((long) ' ');
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray39);
        int int43 = inputStream16.readNBytes(byteArray39, 0, (int) (short) 10);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 10);
        int int45 = inputStream0.read(byteArray44);
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long47 = inputStream0.transferTo(outputStream46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 0 + "'", obj40, (short) 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        long long7 = inputStream0.skip((long) (byte) 117);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        byte[] byteArray12 = inputStream8.readAllBytes();
        long long14 = inputStream8.skip((long) (byte) 125);
        boolean boolean15 = inputStream8.markSupported();
        byte[] byteArray17 = inputStream8.readNBytes((int) (byte) 8);
        boolean boolean18 = inputStream8.markSupported();
        byte[] byteArray19 = inputStream8.readAllBytes();
        byte[] byteArray20 = inputStream8.readAllBytes();
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark(8257536);
        byte[] byteArray25 = inputStream21.readAllBytes();
        long long27 = inputStream21.skip((long) (byte) 125);
        inputStream21.mark(0);
        boolean boolean30 = inputStream21.markSupported();
        inputStream21.mark((int) (byte) 100);
        inputStream21.mark((int) ' ');
        inputStream21.mark((int) (byte) 125);
        inputStream21.mark((int) (byte) 119);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        int int43 = inputStream21.readNBytes(byteArray40, (int) (short) 5, (int) (short) 1);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int43);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.clone(byteArray44);
        int int46 = inputStream8.read(byteArray45);
        int int47 = inputStream0.read(byteArray45);
        java.io.OutputStream outputStream48 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long49 = inputStream0.transferTo(outputStream48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        inputStream0.mark((int) (byte) 4);
        inputStream0.mark((int) (short) 10);
        byte[] byteArray8 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass9 = inputStream0.getClass();
        java.lang.Class<?> wildcardClass10 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass9);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) (byte) 123);
        byte[] byteArray6 = inputStream0.readAllBytes();
        boolean boolean7 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        boolean boolean16 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        byte[] byteArray20 = inputStream19.readAllBytes();
        byte[] byteArray22 = inputStream19.readNBytes((int) (byte) 0);
        int int23 = inputStream0.read(byteArray22);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        long long26 = inputStream24.skip((long) (short) 1);
        long long28 = inputStream24.skip(0L);
        byte[] byteArray30 = inputStream24.readNBytes((int) (byte) 125);
        byte[] byteArray31 = inputStream24.readAllBytes();
        byte[] byteArray32 = inputStream24.readAllBytes();
        int int33 = inputStream0.read(byteArray32);
        byte[] byteArray34 = inputStream0.readAllBytes();
        long long36 = inputStream0.skip((long) 1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((int) (byte) 118);
        long long12 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray14);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj19 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        int int21 = inputStream0.read(byteArray14);
        byte[] byteArray22 = inputStream0.readAllBytes();
        byte[] byteArray24 = inputStream0.readNBytes((int) (byte) 115);
        long long26 = inputStream0.skip((long) (-1));
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 0 + "'", obj18, (short) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 0 + "'", obj19, (short) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray11 = inputStream0.readAllBytes();
        boolean boolean12 = inputStream0.markSupported();
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = inputStream0.transferTo(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark((int) (byte) 112);
        boolean boolean17 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 112);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = inputStream0.readAllBytes();
        long long10 = inputStream0.skip((long) 'a');
        boolean boolean11 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip(0L);
        boolean boolean5 = inputStream0.markSupported();
        byte[] byteArray6 = inputStream0.readAllBytes();
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        long long9 = inputStream7.skip((long) (short) 1);
        long long11 = inputStream7.skip(0L);
        long long13 = inputStream7.skip((long) (byte) -1);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark(8257536);
        byte[] byteArray18 = inputStream14.readAllBytes();
        int int19 = inputStream7.read(byteArray18);
        byte[] byteArray20 = inputStream7.readAllBytes();
        long long22 = inputStream7.skip((long) (byte) 120);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.clone(byteArray28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        int int31 = inputStream23.read(byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.clone(byteArray33);
        int int35 = inputStream23.read(byteArray34);
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int41 = inputStream36.readNBytes(byteArray38, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int43 = inputStream23.read(byteArray42);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray46 = org.apache.commons.lang3.SerializationUtils.clone(byteArray45);
        java.lang.Object obj47 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray45);
        java.lang.Object obj48 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray45);
        int int49 = inputStream23.read(byteArray45);
        byte[] byteArray50 = inputStream23.readAllBytes();
        int int51 = inputStream7.read(byteArray50);
        int int52 = inputStream0.read(byteArray50);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (short) 0 + "'", obj47, (short) 0);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 0 + "'", obj48, (short) 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        int int13 = inputStream0.read(byteArray12);
        java.io.Serializable serializable14 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray12);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray15);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(serializable14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark(8257536);
        boolean boolean19 = inputStream15.markSupported();
        long long21 = inputStream15.skip((long) (byte) 112);
        inputStream15.mark(1);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        boolean boolean25 = inputStream24.markSupported();
        inputStream24.mark(8257536);
        byte[] byteArray28 = inputStream24.readAllBytes();
        inputStream24.mark(1);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int36 = inputStream31.readNBytes(byteArray33, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int38 = inputStream24.read(byteArray37);
        int int39 = inputStream15.read(byteArray37);
        boolean boolean40 = inputStream15.markSupported();
        byte[] byteArray41 = inputStream15.readAllBytes();
        inputStream15.mark((int) (byte) 119);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj46 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray45);
        java.lang.Object obj47 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray45);
        int int48 = inputStream15.read(byteArray45);
        int int51 = inputStream0.readNBytes(byteArray45, (int) (byte) 8, (int) (byte) 1);
        java.lang.Object obj52 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray45);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 'a' + "'", obj46, 'a');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 'a' + "'", obj47, 'a');
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 'a' + "'", obj52, 'a');
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int15 = inputStream7.read(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream7.read(byteArray18);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        int int21 = inputStream0.read(byteArray18);
        boolean boolean22 = inputStream0.markSupported();
        byte[] byteArray24 = inputStream0.readNBytes((int) (byte) 120);
        inputStream0.mark((int) (byte) 123);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        inputStream0.mark((int) (byte) 123);
        inputStream0.mark(0);
        byte[] byteArray11 = inputStream0.readNBytes((int) (byte) 8);
        long long13 = inputStream0.skip((long) (byte) 119);
        byte[] byteArray15 = inputStream0.readNBytes(0);
        inputStream0.mark(100);
        boolean boolean18 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        byte[] byteArray14 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 0);
        long long19 = inputStream0.skip((long) (byte) 122);
        inputStream0.mark((int) (short) 1);
        inputStream0.mark((int) (byte) 116);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        java.lang.Object obj25 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int26 = inputStream0.read(byteArray22);
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray29 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 114);
        java.io.OutputStream outputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long33 = inputStream0.transferTo(outputStream32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        inputStream0.mark((int) (byte) 123);
        inputStream0.mark(0);
        long long11 = inputStream0.skip((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        byte[] byteArray20 = inputStream0.readNBytes((int) '#');
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = inputStream0.transferTo(outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        long long7 = inputStream0.skip((long) (byte) 100);
        inputStream0.mark((int) (byte) 1);
        inputStream0.mark((int) (short) -1);
        long long13 = inputStream0.skip((long) (short) -21267);
        boolean boolean14 = inputStream0.markSupported();
        byte[] byteArray15 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass16 = byteArray15.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray10 = inputStream0.readAllBytes();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int19 = inputStream0.read(byteArray12);
        byte[] byteArray20 = inputStream0.readAllBytes();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 126);
        java.io.SerializablePermission serializablePermission23 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        java.lang.Class<?> wildcardClass24 = serializablePermission23.getClass();
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission23);
        int int26 = inputStream0.read(byteArray25);
        byte[] byteArray27 = inputStream0.readAllBytes();
        boolean boolean28 = inputStream0.markSupported();
        long long30 = inputStream0.skip((long) (byte) 100);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 0 + "'", obj14, (short) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        byte[] byteArray5 = inputStream0.readNBytes((int) (byte) 115);
        inputStream0.mark((int) (byte) 4);
        boolean boolean8 = inputStream0.markSupported();
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark(2);
        long long13 = inputStream0.skip((long) 'a');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray21 = inputStream0.readNBytes((int) (short) 0);
        long long23 = inputStream0.skip((long) (short) 100);
        byte[] byteArray25 = inputStream0.readNBytes((int) (byte) 10);
        boolean boolean26 = inputStream0.markSupported();
        java.lang.Class<?> wildcardClass27 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        int int17 = inputStream0.read(byteArray16);
        byte[] byteArray18 = inputStream0.readAllBytes();
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        long long21 = inputStream19.skip((long) (short) 1);
        long long23 = inputStream19.skip(0L);
        inputStream19.mark((int) (byte) 100);
        byte[] byteArray26 = inputStream19.readAllBytes();
        byte[] byteArray27 = inputStream19.readAllBytes();
        int int28 = inputStream0.read(byteArray27);
        boolean boolean29 = inputStream0.markSupported();
        byte[] byteArray31 = inputStream0.readNBytes(1);
        java.lang.Class<?> wildcardClass32 = byteArray31.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (short) -21267);
        long long20 = inputStream0.skip((long) ' ');
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray23);
        int int27 = inputStream0.readNBytes(byteArray23, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = byteArray23.getClass();
        java.io.Serializable serializable29 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass28);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass28, outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(serializable29);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        long long15 = inputStream0.skip(100L);
        boolean boolean16 = inputStream0.markSupported();
        boolean boolean17 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark(8257536);
        long long19 = inputStream14.skip((long) ' ');
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int22 = inputStream14.read(byteArray21);
        int int23 = inputStream0.read(byteArray21);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray21);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        long long22 = inputStream20.skip((long) (short) 1);
        long long24 = inputStream20.skip(0L);
        long long26 = inputStream20.skip((long) (byte) -1);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark(8257536);
        byte[] byteArray31 = inputStream27.readAllBytes();
        int int32 = inputStream20.read(byteArray31);
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        inputStream33.mark(8257536);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray38);
        int int41 = inputStream33.read(byteArray40);
        int int42 = inputStream20.read(byteArray40);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        java.lang.Object obj44 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray40);
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        int int48 = inputStream0.readNBytes(byteArray45, (int) (byte) 10, (int) (byte) 0);
        boolean boolean49 = inputStream0.markSupported();
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        boolean boolean51 = inputStream50.markSupported();
        inputStream50.mark(8257536);
        byte[] byteArray54 = inputStream50.readAllBytes();
        long long56 = inputStream50.skip((long) (byte) 125);
        boolean boolean57 = inputStream50.markSupported();
        byte[] byteArray59 = inputStream50.readNBytes((int) '#');
        boolean boolean60 = inputStream50.markSupported();
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        int int63 = inputStream50.read(byteArray62);
        java.io.Serializable serializable64 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray62);
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray62);
        int int66 = inputStream0.read(byteArray65);
        boolean boolean67 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(serializable64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        byte[] byteArray12 = inputStream0.readNBytes(1);
        inputStream0.mark((int) (short) 1);
        inputStream0.mark((int) (short) 1);
        inputStream0.mark((int) (byte) 119);
        boolean boolean19 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 8);
        byte[] byteArray17 = inputStream0.readNBytes(0);
        long long19 = inputStream0.skip((long) 10);
        inputStream0.mark((int) ' ');
        byte[] byteArray23 = inputStream0.readNBytes((int) ' ');
        long long25 = inputStream0.skip((long) (byte) 120);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        java.lang.Class<?> wildcardClass15 = inputStream0.getClass();
        java.io.Serializable serializable16 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass15);
        java.io.Serializable serializable17 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass15);
        java.lang.Class<?> wildcardClass19 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass18);
        java.io.Serializable serializable21 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass18);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(serializable16);
        org.junit.Assert.assertNotNull(serializable17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(serializable21);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 8);
        long long11 = inputStream0.skip((long) ' ');
        byte[] byteArray12 = inputStream0.readAllBytes();
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.clone(byteArray23);
        int int25 = inputStream13.read(byteArray24);
        java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray24);
        int int27 = inputStream0.read(byteArray24);
        inputStream0.mark((int) (byte) 2);
        byte[] byteArray30 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 0 + "'", obj26, (short) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip((long) (byte) 113);
        boolean boolean5 = inputStream0.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark(8257536);
        boolean boolean10 = inputStream6.markSupported();
        long long12 = inputStream6.skip((long) (byte) 112);
        inputStream6.mark(1);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark(8257536);
        byte[] byteArray19 = inputStream15.readAllBytes();
        inputStream15.mark(1);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int27 = inputStream22.readNBytes(byteArray24, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int29 = inputStream15.read(byteArray28);
        int int30 = inputStream6.read(byteArray28);
        boolean boolean31 = inputStream6.markSupported();
        byte[] byteArray32 = inputStream6.readAllBytes();
        inputStream6.mark((int) (byte) 119);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj37 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        int int39 = inputStream6.read(byteArray36);
        java.lang.Class<?> wildcardClass40 = byteArray36.getClass();
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray36);
        int int42 = inputStream0.read(byteArray41);
        boolean boolean43 = inputStream0.markSupported();
        byte[] byteArray45 = inputStream0.readNBytes((int) (short) 0);
        inputStream0.mark((int) ' ');
        boolean boolean48 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 'a' + "'", obj37, 'a');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray36 = inputStream0.readAllBytes();
        byte[] byteArray37 = inputStream0.readAllBytes();
        java.io.InputStream inputStream38 = java.io.InputStream.nullInputStream();
        boolean boolean39 = inputStream38.markSupported();
        inputStream38.mark(8257536);
        boolean boolean42 = inputStream38.markSupported();
        long long44 = inputStream38.skip((long) (byte) 112);
        inputStream38.mark(1);
        java.io.InputStream inputStream47 = java.io.InputStream.nullInputStream();
        boolean boolean48 = inputStream47.markSupported();
        inputStream47.mark(8257536);
        byte[] byteArray51 = inputStream47.readAllBytes();
        inputStream47.mark(1);
        java.io.InputStream inputStream54 = java.io.InputStream.nullInputStream();
        byte[] byteArray56 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int59 = inputStream54.readNBytes(byteArray56, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray60 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int61 = inputStream47.read(byteArray60);
        int int62 = inputStream38.read(byteArray60);
        boolean boolean63 = inputStream38.markSupported();
        byte[] byteArray64 = inputStream38.readAllBytes();
        inputStream38.mark((int) (byte) 119);
        byte[] byteArray68 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj69 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray68);
        java.lang.Object obj70 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray68);
        int int71 = inputStream38.read(byteArray68);
        byte[] byteArray73 = inputStream38.readNBytes(100);
        byte[] byteArray74 = inputStream38.readAllBytes();
        int int75 = inputStream0.read(byteArray74);
        java.io.InputStream inputStream76 = java.io.InputStream.nullInputStream();
        boolean boolean77 = inputStream76.markSupported();
        inputStream76.mark(8257536);
        byte[] byteArray80 = inputStream76.readAllBytes();
        long long82 = inputStream76.skip((long) '4');
        java.io.SerializablePermission serializablePermission83 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission84 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission83);
        byte[] byteArray85 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission84);
        int int88 = inputStream76.readNBytes(byteArray85, (int) (byte) 112, 10);
        int int91 = inputStream0.readNBytes(byteArray85, (int) (short) 10, 0);
        byte[] byteArray92 = inputStream0.readAllBytes();
        byte[] byteArray94 = inputStream0.readNBytes(10);
        java.io.OutputStream outputStream95 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long96 = inputStream0.transferTo(outputStream95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(inputStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 'a' + "'", obj69, 'a');
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 'a' + "'", obj70, 'a');
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(inputStream76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(serializablePermission83);
        org.junit.Assert.assertNotNull(permission84);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] {});
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        long long10 = inputStream0.skip((long) '4');
        inputStream0.mark((int) (byte) 114);
        byte[] byteArray13 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 115);
        inputStream0.mark((int) (byte) 0);
        byte[] byteArray12 = inputStream0.readNBytes((int) (short) 10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray36 = inputStream0.readAllBytes();
        byte[] byteArray37 = inputStream0.readAllBytes();
        byte[] byteArray39 = inputStream0.readNBytes((int) (byte) 124);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        byte[] byteArray3 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        int int19 = inputStream0.read(byteArray15);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        inputStream20.mark(8257536);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.clone(byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        int int28 = inputStream20.read(byteArray27);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray31 = org.apache.commons.lang3.SerializationUtils.clone(byteArray30);
        int int32 = inputStream20.read(byteArray31);
        byte[] byteArray33 = inputStream20.readAllBytes();
        byte[] byteArray35 = inputStream20.readNBytes((int) (byte) 118);
        long long37 = inputStream20.skip(0L);
        byte[] byteArray39 = inputStream20.readNBytes((int) (byte) 2);
        int int40 = inputStream0.read(byteArray39);
        java.io.InputStream inputStream41 = java.io.InputStream.nullInputStream();
        boolean boolean42 = inputStream41.markSupported();
        inputStream41.mark(8257536);
        byte[] byteArray46 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray47 = org.apache.commons.lang3.SerializationUtils.clone(byteArray46);
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray46);
        int int49 = inputStream41.read(byteArray48);
        byte[] byteArray51 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int52 = inputStream41.read(byteArray51);
        byte[] byteArray54 = inputStream41.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream55 = java.io.InputStream.nullInputStream();
        boolean boolean56 = inputStream55.markSupported();
        inputStream55.mark(8257536);
        long long60 = inputStream55.skip((long) ' ');
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int63 = inputStream55.read(byteArray62);
        int int64 = inputStream41.read(byteArray62);
        java.lang.Object obj65 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray62);
        byte[] byteArray66 = org.apache.commons.lang3.SerializationUtils.clone(byteArray62);
        byte[] byteArray67 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray66);
        int int68 = inputStream0.read(byteArray67);
        java.io.InputStream inputStream69 = java.io.InputStream.nullInputStream();
        long long71 = inputStream69.skip((long) (short) 1);
        long long73 = inputStream69.skip(0L);
        inputStream69.mark((int) (byte) 100);
        inputStream69.mark((int) (byte) 113);
        java.io.InputStream inputStream78 = java.io.InputStream.nullInputStream();
        boolean boolean79 = inputStream78.markSupported();
        inputStream78.mark(8257536);
        byte[] byteArray82 = inputStream78.readAllBytes();
        long long84 = inputStream78.skip((long) (byte) 125);
        boolean boolean85 = inputStream78.markSupported();
        byte[] byteArray87 = inputStream78.readNBytes((int) '#');
        byte[] byteArray88 = inputStream78.readAllBytes();
        int int89 = inputStream69.read(byteArray88);
        byte[] byteArray90 = inputStream69.readAllBytes();
        byte[] byteArray91 = inputStream69.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int94 = inputStream0.readNBytes(byteArray91, (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 2) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1.0d) + "'", obj65, (-1.0d));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(inputStream69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(inputStream78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] {});
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] {});
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] {});
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 100);
        int int13 = inputStream0.read(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray10 = inputStream0.readAllBytes();
        boolean boolean11 = inputStream0.markSupported();
        long long13 = inputStream0.skip((long) (byte) 4);
        inputStream0.mark((int) (short) 100);
        byte[] byteArray16 = inputStream0.readAllBytes();
        byte[] byteArray18 = inputStream0.readNBytes((int) (byte) 113);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = inputStream0.transferTo(outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 8);
        byte[] byteArray17 = inputStream0.readNBytes(0);
        long long19 = inputStream0.skip((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7);
        java.io.Serializable serializable9 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray8);
        java.io.Serializable serializable10 = org.apache.commons.lang3.SerializationUtils.clone(serializable9);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize(serializable10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(serializable9);
        org.junit.Assert.assertNotNull(serializable10);
        org.junit.Assert.assertNotNull(byteArray11);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        long long12 = inputStream10.skip((long) (short) 1);
        long long14 = inputStream10.skip(0L);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int17 = inputStream10.read(byteArray16);
        inputStream10.mark(8257536);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21);
        int int24 = inputStream10.read(byteArray21);
        int int25 = inputStream0.read(byteArray21);
        byte[] byteArray27 = inputStream0.readNBytes(10);
        inputStream0.mark((int) (byte) 114);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes(8257536);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip((long) (byte) 113);
        boolean boolean5 = inputStream0.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream6.read(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.clone(byteArray16);
        int int18 = inputStream6.read(byteArray17);
        byte[] byteArray20 = inputStream6.readNBytes((int) (byte) 123);
        byte[] byteArray22 = inputStream6.readNBytes((int) ' ');
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.clone(byteArray28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        int int31 = inputStream23.read(byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.clone(byteArray33);
        int int35 = inputStream23.read(byteArray34);
        int int36 = inputStream6.read(byteArray34);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray39);
        int int41 = inputStream6.read(byteArray40);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        int int43 = inputStream0.read(byteArray40);
        byte[] byteArray44 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream45 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long46 = inputStream0.transferTo(outputStream45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip((long) (byte) 113);
        byte[] byteArray5 = inputStream0.readAllBytes();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        long long8 = inputStream6.skip((long) (short) 1);
        long long10 = inputStream6.skip(0L);
        long long12 = inputStream6.skip((long) (byte) -1);
        byte[] byteArray13 = inputStream6.readAllBytes();
        byte[] byteArray15 = inputStream6.readNBytes((int) (byte) 119);
        byte[] byteArray16 = inputStream6.readAllBytes();
        byte[] byteArray18 = inputStream6.readNBytes(2);
        long long20 = inputStream6.skip(10L);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        long long23 = inputStream21.skip((long) (short) 1);
        long long25 = inputStream21.skip(0L);
        byte[] byteArray27 = inputStream21.readNBytes((int) (byte) 125);
        int int30 = inputStream6.readNBytes(byteArray27, (int) (byte) 0, (int) (short) 0);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark(0);
        inputStream31.mark((int) (byte) 4);
        inputStream31.mark((int) (short) 10);
        byte[] byteArray39 = inputStream31.readAllBytes();
        int int40 = inputStream6.read(byteArray39);
        int int41 = inputStream0.read(byteArray39);
        boolean boolean42 = inputStream0.markSupported();
        java.io.InputStream inputStream43 = java.io.InputStream.nullInputStream();
        boolean boolean44 = inputStream43.markSupported();
        inputStream43.mark(8257536);
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.clone(byteArray48);
        byte[] byteArray50 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray48);
        int int51 = inputStream43.read(byteArray50);
        byte[] byteArray53 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray54 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray55 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray54);
        int int56 = inputStream43.read(byteArray55);
        int int57 = inputStream0.read(byteArray55);
        byte[] byteArray59 = inputStream0.readNBytes((int) (short) 100);
        boolean boolean60 = inputStream0.markSupported();
        java.io.InputStream inputStream61 = java.io.InputStream.nullInputStream();
        long long63 = inputStream61.skip((long) (short) 1);
        long long65 = inputStream61.skip(0L);
        long long67 = inputStream61.skip((long) (byte) -1);
        java.io.InputStream inputStream68 = java.io.InputStream.nullInputStream();
        boolean boolean69 = inputStream68.markSupported();
        inputStream68.mark(8257536);
        byte[] byteArray72 = inputStream68.readAllBytes();
        int int73 = inputStream61.read(byteArray72);
        inputStream61.mark((int) (byte) 121);
        byte[] byteArray77 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        int int78 = inputStream61.read(byteArray77);
        byte[] byteArray79 = inputStream61.readAllBytes();
        java.io.InputStream inputStream80 = java.io.InputStream.nullInputStream();
        long long82 = inputStream80.skip((long) (short) 1);
        long long84 = inputStream80.skip(0L);
        inputStream80.mark((int) (byte) 100);
        byte[] byteArray87 = inputStream80.readAllBytes();
        byte[] byteArray88 = inputStream80.readAllBytes();
        int int89 = inputStream61.read(byteArray88);
        boolean boolean90 = inputStream61.markSupported();
        long long92 = inputStream61.skip((long) (short) 1);
        byte[] byteArray93 = inputStream61.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int96 = inputStream0.readNBytes(byteArray93, (int) (byte) 120, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [120, 120 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(inputStream61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(inputStream68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] {});
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream80);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] {});
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] {});
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        java.lang.Class<?> wildcardClass4 = inputStream0.getClass();
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass4);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass6);
        java.lang.Object obj8 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray7);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray7, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.io.InputStream$1");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        long long10 = inputStream8.skip((long) (short) 1);
        long long12 = inputStream8.skip(0L);
        long long14 = inputStream8.skip((long) (byte) -1);
        byte[] byteArray15 = inputStream8.readAllBytes();
        byte[] byteArray17 = inputStream8.readNBytes((int) (byte) 119);
        byte[] byteArray18 = inputStream8.readAllBytes();
        int int19 = inputStream0.read(byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21);
        int int24 = inputStream0.read(byteArray23);
        byte[] byteArray26 = inputStream0.readNBytes((int) (short) 5);
        java.lang.ClassLoader classLoader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream28 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader27);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray16 = inputStream0.readNBytes((int) ' ');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.clone(byteArray22);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22);
        int int25 = inputStream17.read(byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.clone(byteArray27);
        int int29 = inputStream17.read(byteArray28);
        int int30 = inputStream0.read(byteArray28);
        byte[] byteArray32 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray33 = inputStream0.readAllBytes();
        long long35 = inputStream0.skip((long) (byte) 4);
        boolean boolean36 = inputStream0.markSupported();
        java.lang.Class<?> wildcardClass37 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        long long10 = inputStream8.skip((long) (short) 1);
        long long12 = inputStream8.skip(0L);
        long long14 = inputStream8.skip((long) (byte) -1);
        byte[] byteArray15 = inputStream8.readAllBytes();
        byte[] byteArray17 = inputStream8.readNBytes((int) (byte) 119);
        byte[] byteArray18 = inputStream8.readAllBytes();
        int int19 = inputStream0.read(byteArray18);
        byte[] byteArray21 = inputStream0.readNBytes(10);
        java.lang.Class<?> wildcardClass22 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        long long12 = inputStream10.skip((long) (short) 1);
        long long14 = inputStream10.skip(0L);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int17 = inputStream10.read(byteArray16);
        inputStream10.mark(8257536);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21);
        int int24 = inputStream10.read(byteArray21);
        int int25 = inputStream0.read(byteArray21);
        inputStream0.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        long long18 = inputStream0.skip((long) 8257536);
        boolean boolean19 = inputStream0.markSupported();
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark(8257536);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        inputStream9.mark((int) (byte) 8);
        inputStream9.mark((int) (byte) 123);
        long long18 = inputStream9.skip((long) 2);
        byte[] byteArray19 = inputStream9.readAllBytes();
        int int20 = inputStream0.read(byteArray19);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.lang.Class<?> wildcardClass4 = basicPermission3.getClass();
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(basicPermission1);
        org.junit.Assert.assertNotNull(basicPermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray16 = inputStream0.readAllBytes();
        byte[] byteArray17 = inputStream0.readAllBytes();
        long long19 = inputStream0.skip((long) (byte) 115);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark(8257536);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        int int18 = inputStream10.read(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int21 = inputStream10.read(byteArray20);
        byte[] byteArray23 = inputStream10.readNBytes((int) (byte) 125);
        int int24 = inputStream0.read(byteArray23);
        byte[] byteArray25 = inputStream0.readAllBytes();
        byte[] byteArray26 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass27 = byteArray26.getClass();
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray26, outputStream28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark(8257536);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        int int18 = inputStream10.read(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int21 = inputStream10.read(byteArray20);
        byte[] byteArray23 = inputStream10.readNBytes((int) (byte) 125);
        int int24 = inputStream0.read(byteArray23);
        long long26 = inputStream0.skip((long) (short) -1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        inputStream0.mark((int) (byte) 4);
        byte[] byteArray7 = inputStream0.readNBytes((int) (byte) 114);
        long long9 = inputStream0.skip((long) (byte) 115);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        int int17 = inputStream0.read(byteArray16);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int17);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((int) (byte) 118);
        inputStream0.mark((int) '4');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray14 = inputStream0.readNBytes(0);
        inputStream0.mark((int) (byte) 124);
        inputStream0.mark((int) (byte) 4);
        long long20 = inputStream0.skip((long) (byte) 10);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        inputStream0.mark((int) (byte) 112);
        boolean boolean14 = inputStream0.markSupported();
        boolean boolean15 = inputStream0.markSupported();
        long long17 = inputStream0.skip((long) (byte) 121);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
        int int18 = inputStream0.read(byteArray16);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.clone(byteArray20);
        java.lang.Object obj22 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        java.lang.Object obj23 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        int int27 = inputStream0.read(byteArray25);
        boolean boolean28 = inputStream0.markSupported();
        boolean boolean29 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 0 + "'", obj22, (short) 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 0 + "'", obj23, (short) 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 1);
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream8 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray16 = inputStream0.readNBytes((int) ' ');
        byte[] byteArray17 = inputStream0.readAllBytes();
        byte[] byteArray18 = inputStream0.readAllBytes();
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        byte[] byteArray20 = inputStream19.readAllBytes();
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 1);
        java.lang.Class<?> wildcardClass23 = byteArray22.getClass();
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        int int28 = inputStream19.readNBytes(byteArray25, (int) (short) 100, (int) (byte) 2);
        int int31 = inputStream0.readNBytes(byteArray25, (int) (short) 1, (int) (byte) 126);
        boolean boolean32 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = inputStream0.transferTo(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray3 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray7 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 100);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.io.SerializablePermission serializablePermission2 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission2);
        java.io.SerializablePermission serializablePermission4 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission2);
        java.security.BasicPermission basicPermission5 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission4);
        java.security.BasicPermission basicPermission6 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission4);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(serializablePermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(serializablePermission4);
        org.junit.Assert.assertNotNull(basicPermission5);
        org.junit.Assert.assertNotNull(basicPermission6);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = inputStream0.readNBytes(0);
        boolean boolean31 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        long long15 = inputStream0.skip((long) (byte) 120);
        byte[] byteArray16 = inputStream0.readAllBytes();
        byte[] byteArray18 = inputStream0.readNBytes((int) (byte) 116);
        byte[] byteArray20 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray21 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int38 = inputStream0.read(byteArray37);
        inputStream0.mark((int) (byte) 4);
        byte[] byteArray41 = inputStream0.readAllBytes();
        long long43 = inputStream0.skip((long) (byte) 113);
        long long45 = inputStream0.skip((long) (byte) 112);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark(8257536);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        int int18 = inputStream10.read(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int21 = inputStream10.read(byteArray20);
        byte[] byteArray23 = inputStream10.readNBytes((int) (byte) 125);
        int int24 = inputStream0.read(byteArray23);
        byte[] byteArray25 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass26 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        inputStream0.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream0.read(byteArray11);
        inputStream0.mark(2);
        byte[] byteArray17 = inputStream0.readAllBytes();
        byte[] byteArray19 = inputStream0.readNBytes((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int7 = inputStream0.read(byteArray6);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        long long10 = inputStream8.skip((long) (short) 1);
        long long12 = inputStream8.skip(0L);
        long long14 = inputStream8.skip((long) (byte) -1);
        byte[] byteArray15 = inputStream8.readAllBytes();
        byte[] byteArray17 = inputStream8.readNBytes((int) (byte) 119);
        byte[] byteArray18 = inputStream8.readAllBytes();
        int int19 = inputStream0.read(byteArray18);
        boolean boolean20 = inputStream0.markSupported();
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = inputStream0.transferTo(outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) 1);
        inputStream0.mark(2);
        byte[] byteArray19 = inputStream0.readAllBytes();
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        inputStream20.mark(8257536);
        byte[] byteArray24 = inputStream20.readAllBytes();
        long long26 = inputStream20.skip((long) (byte) 125);
        boolean boolean27 = inputStream20.markSupported();
        byte[] byteArray29 = inputStream20.readNBytes((int) '#');
        byte[] byteArray31 = inputStream20.readNBytes(8257536);
        boolean boolean32 = inputStream20.markSupported();
        boolean boolean33 = inputStream20.markSupported();
        byte[] byteArray35 = inputStream20.readNBytes((int) (byte) 123);
        int int36 = inputStream0.read(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 8);
        byte[] byteArray17 = inputStream0.readNBytes(0);
        long long19 = inputStream0.skip((long) 10);
        boolean boolean20 = inputStream0.markSupported();
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = inputStream0.transferTo(outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray7 = inputStream0.readAllBytes();
        inputStream0.mark(100);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        long long12 = inputStream10.skip((long) (short) 1);
        long long14 = inputStream10.skip(0L);
        long long16 = inputStream10.skip((long) (byte) -1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray21 = inputStream17.readAllBytes();
        int int22 = inputStream10.read(byteArray21);
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.clone(byteArray28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        int int31 = inputStream23.read(byteArray30);
        int int32 = inputStream10.read(byteArray30);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int35 = inputStream10.read(byteArray34);
        int int36 = inputStream0.read(byteArray34);
        long long38 = inputStream0.skip((long) (byte) 1);
        boolean boolean39 = inputStream0.markSupported();
        inputStream0.mark(2);
        java.lang.ClassLoader classLoader42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream43 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader42);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        int int15 = inputStream7.read(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream7.read(byteArray18);
        java.lang.Object obj20 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
        int int21 = inputStream0.read(byteArray18);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 113);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.clone(byteArray23);
        int int25 = inputStream0.read(byteArray24);
        inputStream0.mark(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 0 + "'", obj20, (short) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        byte[] byteArray14 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readAllBytes();
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        java.io.Serializable serializable18 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray17);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(serializable18);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray14 = inputStream0.readNBytes(0);
        inputStream0.mark((int) (byte) 124);
        inputStream0.mark((int) (byte) 4);
        long long20 = inputStream0.skip((long) (short) 100);
        java.lang.Class<?> wildcardClass21 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        inputStream0.mark((int) (short) 5);
        boolean boolean13 = inputStream0.markSupported();
        boolean boolean14 = inputStream0.markSupported();
        inputStream0.mark((int) (short) 1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        long long19 = inputStream17.skip((long) (short) 1);
        long long21 = inputStream17.skip(0L);
        byte[] byteArray23 = inputStream17.readNBytes((int) (byte) 125);
        int int24 = inputStream0.read(byteArray23);
        inputStream0.mark((int) (byte) 10);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.clone(byteArray28);
        java.lang.Object obj30 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray28);
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray28);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray28);
        java.lang.Object obj33 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray28);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray34);
        int int36 = inputStream0.read(byteArray34);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 0 + "'", obj30, (short) 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 0 + "'", obj31, (short) 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 0 + "'", obj32, (short) 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 0 + "'", obj33, (short) 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
        int int18 = inputStream0.read(byteArray16);
        inputStream0.mark((int) (short) 1);
        inputStream0.mark((int) (byte) 113);
        byte[] byteArray23 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        boolean boolean17 = inputStream15.markSupported();
        byte[] byteArray18 = inputStream15.readAllBytes();
        inputStream15.mark((int) (byte) 112);
        byte[] byteArray22 = inputStream15.readNBytes((int) (short) 0);
        int int23 = inputStream0.read(byteArray22);
        long long25 = inputStream0.skip((long) 1);
        boolean boolean26 = inputStream0.markSupported();
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = inputStream0.transferTo(outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        int int19 = inputStream0.read(byteArray15);
        byte[] byteArray20 = inputStream0.readAllBytes();
        byte[] byteArray21 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21, outputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        byte[] byteArray14 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readAllBytes();
        boolean boolean16 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) -1);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark(8257536);
        long long24 = inputStream19.skip((long) ' ');
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int27 = inputStream19.read(byteArray26);
        inputStream19.mark((int) (byte) 118);
        long long31 = inputStream19.skip((long) (byte) 112);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.clone(byteArray33);
        java.lang.Object obj35 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray33);
        java.lang.Object obj36 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray33);
        java.lang.Object obj37 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray33);
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray33);
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray33);
        int int40 = inputStream19.read(byteArray33);
        boolean boolean41 = inputStream19.markSupported();
        java.io.InputStream inputStream42 = java.io.InputStream.nullInputStream();
        long long44 = inputStream42.skip((long) (short) 1);
        long long46 = inputStream42.skip(0L);
        long long48 = inputStream42.skip((long) (byte) -1);
        byte[] byteArray49 = inputStream42.readAllBytes();
        int int50 = inputStream19.read(byteArray49);
        int int51 = inputStream0.read(byteArray49);
        inputStream0.mark((int) (byte) 115);
        boolean boolean54 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 0 + "'", obj35, (short) 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 0 + "'", obj36, (short) 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 0 + "'", obj37, (short) 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 0 + "'", obj38, (short) 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 0 + "'", obj39, (short) 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(inputStream42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark(8257536);
        byte[] byteArray19 = inputStream15.readAllBytes();
        inputStream15.mark(1);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int27 = inputStream22.readNBytes(byteArray24, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int29 = inputStream15.read(byteArray28);
        inputStream15.mark(8257536);
        byte[] byteArray33 = inputStream15.readNBytes(100);
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        boolean boolean35 = inputStream34.markSupported();
        inputStream34.mark(8257536);
        byte[] byteArray38 = inputStream34.readAllBytes();
        long long40 = inputStream34.skip((long) (byte) 125);
        boolean boolean41 = inputStream34.markSupported();
        inputStream34.mark((int) (byte) 124);
        byte[] byteArray44 = inputStream34.readAllBytes();
        int int45 = inputStream15.read(byteArray44);
        int int46 = inputStream0.read(byteArray44);
        java.lang.ClassLoader classLoader47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream48 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader47);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (short) -21267);
        long long20 = inputStream0.skip((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        inputStream0.mark(10);
        inputStream0.mark((int) (byte) 16);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        long long17 = inputStream15.skip((long) (short) 1);
        long long19 = inputStream15.skip(0L);
        long long21 = inputStream15.skip((long) (byte) -1);
        byte[] byteArray23 = inputStream15.readNBytes((int) (byte) 4);
        byte[] byteArray25 = inputStream15.readNBytes((int) (short) 100);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        boolean boolean28 = inputStream26.markSupported();
        java.lang.Class<?> wildcardClass29 = inputStream26.getClass();
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int34 = inputStream15.readNBytes(byteArray30, (int) (short) 5, (int) (short) 0);
        int int37 = inputStream0.readNBytes(byteArray30, (int) (short) 10, (int) (byte) 16);
        long long39 = inputStream0.skip((long) (byte) 116);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.io.InputStream$1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.io.InputStream$1");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        long long9 = inputStream0.skip((long) 2);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        long long12 = inputStream10.skip((long) (short) 1);
        long long14 = inputStream10.skip(0L);
        byte[] byteArray16 = inputStream10.readNBytes((int) (byte) 125);
        byte[] byteArray17 = inputStream10.readAllBytes();
        inputStream10.mark(100);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        long long22 = inputStream20.skip((long) (short) 1);
        long long24 = inputStream20.skip(0L);
        long long26 = inputStream20.skip((long) (byte) -1);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark(8257536);
        byte[] byteArray31 = inputStream27.readAllBytes();
        int int32 = inputStream20.read(byteArray31);
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        inputStream33.mark(8257536);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray38);
        int int41 = inputStream33.read(byteArray40);
        int int42 = inputStream20.read(byteArray40);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int45 = inputStream20.read(byteArray44);
        int int46 = inputStream10.read(byteArray44);
        int int47 = inputStream0.read(byteArray44);
        byte[] byteArray49 = inputStream0.readNBytes((int) (byte) 116);
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        boolean boolean51 = inputStream50.markSupported();
        inputStream50.mark(8257536);
        byte[] byteArray54 = inputStream50.readAllBytes();
        long long56 = inputStream50.skip((long) '4');
        byte[] byteArray57 = inputStream50.readAllBytes();
        long long59 = inputStream50.skip((long) 2);
        byte[] byteArray61 = inputStream50.readNBytes(0);
        java.io.InputStream inputStream62 = java.io.InputStream.nullInputStream();
        boolean boolean63 = inputStream62.markSupported();
        inputStream62.mark(8257536);
        byte[] byteArray66 = inputStream62.readAllBytes();
        long long68 = inputStream62.skip((long) (byte) 125);
        inputStream62.mark(0);
        boolean boolean71 = inputStream62.markSupported();
        java.io.InputStream inputStream72 = java.io.InputStream.nullInputStream();
        boolean boolean73 = inputStream72.markSupported();
        inputStream72.mark(8257536);
        byte[] byteArray76 = inputStream72.readAllBytes();
        long long78 = inputStream72.skip((long) (byte) 125);
        boolean boolean79 = inputStream72.markSupported();
        byte[] byteArray81 = inputStream72.readNBytes((int) (byte) 8);
        int int84 = inputStream62.readNBytes(byteArray81, (int) (byte) 0, 0);
        int int85 = inputStream50.read(byteArray81);
        byte[] byteArray86 = inputStream50.readAllBytes();
        byte[] byteArray87 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray86);
        byte[] byteArray88 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray87);
        int int89 = inputStream0.read(byteArray88);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(inputStream72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        inputStream0.mark((int) (byte) 0);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark(8257536);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21);
        int int24 = inputStream16.read(byteArray23);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int27 = inputStream16.read(byteArray26);
        byte[] byteArray29 = inputStream16.readNBytes((int) (byte) 125);
        byte[] byteArray31 = inputStream16.readNBytes((int) (byte) 8);
        int int32 = inputStream0.read(byteArray31);
        java.io.InputStream inputStream33 = java.io.InputStream.nullInputStream();
        boolean boolean34 = inputStream33.markSupported();
        inputStream33.mark(8257536);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray38);
        int int41 = inputStream33.read(byteArray40);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.clone(byteArray43);
        int int45 = inputStream33.read(byteArray44);
        byte[] byteArray46 = inputStream33.readAllBytes();
        byte[] byteArray48 = inputStream33.readNBytes((int) (byte) 118);
        int int51 = inputStream0.readNBytes(byteArray48, (int) (short) 0, 0);
        long long53 = inputStream0.skip((long) '4');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        boolean boolean9 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark((int) (byte) 112);
        byte[] byteArray18 = inputStream0.readNBytes((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int11 = inputStream0.read(byteArray10);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 125);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        long long16 = inputStream14.skip((long) (short) 1);
        long long18 = inputStream14.skip(0L);
        inputStream14.mark((int) (byte) 100);
        inputStream14.mark(8257536);
        byte[] byteArray24 = inputStream14.readNBytes((int) (byte) 125);
        int int25 = inputStream0.read(byteArray24);
        byte[] byteArray26 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        inputStream0.mark(8257536);
        long long7 = inputStream0.skip((long) ' ');
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 123);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        long long12 = inputStream10.skip((long) (short) 1);
        long long14 = inputStream10.skip(0L);
        long long16 = inputStream10.skip((long) (byte) -1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray21 = inputStream17.readAllBytes();
        int int22 = inputStream10.read(byteArray21);
        byte[] byteArray23 = inputStream10.readAllBytes();
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.clone(byteArray25);
        java.lang.Object obj27 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray25);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        int int29 = inputStream10.read(byteArray25);
        int int32 = inputStream0.readNBytes(byteArray25, (int) (byte) 0, 2);
        long long34 = inputStream0.skip((long) '#');
        boolean boolean35 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 0 + "'", obj27, (short) 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 124);
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray11 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 122);
        inputStream0.mark((int) (byte) 0);
        inputStream0.mark((int) (byte) 119);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        long long20 = inputStream18.skip((long) (short) 1);
        long long22 = inputStream18.skip(0L);
        byte[] byteArray24 = inputStream18.readNBytes((int) (byte) 125);
        byte[] byteArray25 = inputStream18.readAllBytes();
        inputStream18.mark(100);
        boolean boolean28 = inputStream18.markSupported();
        byte[] byteArray29 = inputStream18.readAllBytes();
        int int30 = inputStream0.read(byteArray29);
        java.io.Serializable serializable31 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) int30);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + serializable31 + "' != '" + 0 + "'", serializable31, 0);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray16 = inputStream0.readNBytes((int) ' ');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        boolean boolean21 = inputStream17.markSupported();
        long long23 = inputStream17.skip((long) (byte) 112);
        long long25 = inputStream17.skip((long) (byte) 124);
        long long27 = inputStream17.skip((long) 10);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        long long30 = inputStream28.skip((long) (short) 1);
        long long32 = inputStream28.skip(0L);
        long long34 = inputStream28.skip((long) (byte) -1);
        byte[] byteArray35 = inputStream28.readAllBytes();
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray35);
        int int40 = inputStream17.readNBytes(byteArray37, 2, (int) (byte) 10);
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = inputStream0.readNBytes(byteArray41, (int) (byte) 124, (int) (byte) 121);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [124, 124 + 121) out of bounds for length 75");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        byte[] byteArray10 = inputStream0.readAllBytes();
        byte[] byteArray12 = inputStream0.readNBytes(2);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray17 = inputStream13.readAllBytes();
        long long19 = inputStream13.skip((long) (byte) 125);
        inputStream13.mark(0);
        boolean boolean22 = inputStream13.markSupported();
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray27 = inputStream23.readAllBytes();
        long long29 = inputStream23.skip((long) (byte) 125);
        boolean boolean30 = inputStream23.markSupported();
        byte[] byteArray32 = inputStream23.readNBytes((int) (byte) 8);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.clone(byteArray34);
        java.lang.Object obj36 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        java.lang.Object obj37 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray34);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray34);
        int int40 = inputStream23.read(byteArray39);
        byte[] byteArray42 = inputStream23.readNBytes((int) (byte) 122);
        int int43 = inputStream13.read(byteArray42);
        java.io.Serializable serializable44 = null;
        byte[] byteArray45 = org.apache.commons.lang3.SerializationUtils.serialize(serializable44);
        java.lang.Object obj46 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray45);
        java.lang.Class<?> wildcardClass47 = byteArray45.getClass();
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass47);
        java.lang.Object obj49 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray48);
        int int50 = inputStream13.read(byteArray48);
        byte[] byteArray51 = org.apache.commons.lang3.SerializationUtils.clone(byteArray48);
        int int52 = inputStream0.read(byteArray48);
        java.io.InputStream inputStream53 = java.io.InputStream.nullInputStream();
        boolean boolean54 = inputStream53.markSupported();
        boolean boolean55 = inputStream53.markSupported();
        byte[] byteArray56 = inputStream53.readAllBytes();
        inputStream53.mark((int) (byte) 112);
        byte[] byteArray60 = inputStream53.readNBytes((int) (byte) 4);
        byte[] byteArray61 = inputStream53.readAllBytes();
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray61);
        byte[] byteArray63 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray62);
        int int64 = inputStream0.read(byteArray62);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 0 + "'", obj36, (short) 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 0 + "'", obj37, (short) 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 0 + "'", obj38, (short) 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 118, (byte) 114, (byte) 0, (byte) 2, (byte) 91, (byte) 66, (byte) -84, (byte) -13, (byte) 23, (byte) -8, (byte) 6, (byte) 8, (byte) 84, (byte) -32, (byte) 2, (byte) 0, (byte) 0, (byte) 120, (byte) 112 });
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class [B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class [B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class [B");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 118, (byte) 114, (byte) 0, (byte) 2, (byte) 91, (byte) 66, (byte) -84, (byte) -13, (byte) 23, (byte) -8, (byte) 6, (byte) 8, (byte) 84, (byte) -32, (byte) 2, (byte) 0, (byte) 0, (byte) 120, (byte) 112 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        byte[] byteArray12 = inputStream0.readNBytes(1);
        long long14 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = inputStream0.transferTo(outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray8);
        java.lang.Class<?> wildcardClass10 = byteArray8.getClass();
        java.io.Serializable serializable11 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) wildcardClass10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize(serializable11);
        java.lang.Class<?> wildcardClass13 = serializable11.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(serializable11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 118, (byte) 114, (byte) 0, (byte) 2, (byte) 91, (byte) 66, (byte) -84, (byte) -13, (byte) 23, (byte) -8, (byte) 6, (byte) 8, (byte) 84, (byte) -32, (byte) 2, (byte) 0, (byte) 0, (byte) 120, (byte) 112 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.io.Serializable serializable0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize(serializable0);
        java.lang.Object obj2 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Object obj3 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -84, (byte) -19, (byte) 0, (byte) 5, (byte) 112 });
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        boolean boolean6 = inputStream0.markSupported();
        boolean boolean7 = inputStream0.markSupported();
        long long9 = inputStream0.skip((long) ' ');
        byte[] byteArray10 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        byte[] byteArray19 = inputStream0.readAllBytes();
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        boolean boolean21 = inputStream20.markSupported();
        inputStream20.mark(8257536);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.clone(byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray25);
        int int28 = inputStream20.read(byteArray27);
        long long30 = inputStream20.skip((long) (short) 5);
        inputStream20.mark((int) (byte) 119);
        byte[] byteArray33 = inputStream20.readAllBytes();
        int int34 = inputStream0.read(byteArray33);
        byte[] byteArray36 = inputStream0.readNBytes((int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = inputStream0.getClass();
        java.lang.Class<?> wildcardClass38 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass37);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass38);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(byteArray39);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        boolean boolean22 = inputStream21.markSupported();
        inputStream21.mark(8257536);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray26);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray26);
        int int29 = inputStream21.read(byteArray28);
        byte[] byteArray31 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.clone(byteArray31);
        int int33 = inputStream21.read(byteArray32);
        byte[] byteArray34 = inputStream21.readAllBytes();
        byte[] byteArray36 = inputStream21.readNBytes((int) (byte) 118);
        byte[] byteArray37 = inputStream21.readAllBytes();
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray37);
        int int39 = inputStream0.read(byteArray38);
        boolean boolean40 = inputStream0.markSupported();
        java.io.OutputStream outputStream41 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long42 = inputStream0.transferTo(outputStream41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes(2);
        java.io.SerializablePermission serializablePermission15 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.BasicPermission basicPermission16 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission15);
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray17);
        int int19 = inputStream0.read(byteArray17);
        inputStream0.mark(0);
        byte[] byteArray22 = inputStream0.readAllBytes();
        boolean boolean23 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission15);
        org.junit.Assert.assertNotNull(basicPermission16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = inputStream0.readNBytes(0);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark(8257536);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.clone(byteArray36);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray36);
        int int39 = inputStream31.read(byteArray38);
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.clone(byteArray41);
        int int43 = inputStream31.read(byteArray42);
        byte[] byteArray44 = inputStream31.readAllBytes();
        inputStream31.mark((int) (byte) 16);
        inputStream31.mark((int) (byte) 123);
        java.io.InputStream inputStream49 = java.io.InputStream.nullInputStream();
        boolean boolean50 = inputStream49.markSupported();
        inputStream49.mark(8257536);
        byte[] byteArray53 = inputStream49.readAllBytes();
        inputStream49.mark(1);
        java.io.InputStream inputStream56 = java.io.InputStream.nullInputStream();
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int61 = inputStream56.readNBytes(byteArray58, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray62 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int63 = inputStream49.read(byteArray62);
        java.lang.Object obj64 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray62);
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.clone(byteArray62);
        int int66 = inputStream31.read(byteArray62);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = inputStream0.readNBytes(byteArray62, 8257536, (int) (byte) 112);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [8257536, 8257536 + 112) out of bounds for length 75");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) 2 + "'", obj64, (byte) 2);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        boolean boolean26 = inputStream25.markSupported();
        inputStream25.mark(8257536);
        byte[] byteArray29 = inputStream25.readAllBytes();
        long long31 = inputStream25.skip((long) (byte) 125);
        java.lang.Class<?> wildcardClass32 = inputStream25.getClass();
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass32);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass32);
        int int35 = inputStream0.read(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int38 = inputStream0.read(byteArray37);
        java.io.InputStream inputStream39 = java.io.InputStream.nullInputStream();
        long long41 = inputStream39.skip((long) (short) 1);
        long long43 = inputStream39.skip(0L);
        long long45 = inputStream39.skip((long) (byte) -1);
        java.io.InputStream inputStream46 = java.io.InputStream.nullInputStream();
        boolean boolean47 = inputStream46.markSupported();
        inputStream46.mark(8257536);
        byte[] byteArray50 = inputStream46.readAllBytes();
        int int51 = inputStream39.read(byteArray50);
        java.io.InputStream inputStream52 = java.io.InputStream.nullInputStream();
        boolean boolean53 = inputStream52.markSupported();
        inputStream52.mark(8257536);
        byte[] byteArray57 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray58 = org.apache.commons.lang3.SerializationUtils.clone(byteArray57);
        byte[] byteArray59 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray57);
        int int60 = inputStream52.read(byteArray59);
        int int61 = inputStream39.read(byteArray59);
        int int64 = inputStream0.readNBytes(byteArray59, (int) 'a', (int) (byte) 4);
        long long66 = inputStream0.skip((long) (byte) 4);
        java.io.InputStream inputStream67 = java.io.InputStream.nullInputStream();
        long long69 = inputStream67.skip((long) (short) 1);
        long long71 = inputStream67.skip(0L);
        byte[] byteArray73 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int74 = inputStream67.read(byteArray73);
        inputStream67.mark(8257536);
        byte[] byteArray78 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray79 = org.apache.commons.lang3.SerializationUtils.clone(byteArray78);
        byte[] byteArray80 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray78);
        int int81 = inputStream67.read(byteArray78);
        byte[] byteArray83 = inputStream67.readNBytes((int) (byte) 100);
        int int84 = inputStream0.read(byteArray83);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(inputStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(inputStream67);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        boolean boolean12 = inputStream0.markSupported();
        boolean boolean13 = inputStream0.markSupported();
        inputStream0.mark((int) '4');
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        boolean boolean18 = inputStream16.markSupported();
        long long20 = inputStream16.skip((long) (byte) 113);
        boolean boolean21 = inputStream16.markSupported();
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        boolean boolean23 = inputStream22.markSupported();
        inputStream22.mark(8257536);
        boolean boolean26 = inputStream22.markSupported();
        long long28 = inputStream22.skip((long) (byte) 112);
        inputStream22.mark(1);
        java.io.InputStream inputStream31 = java.io.InputStream.nullInputStream();
        boolean boolean32 = inputStream31.markSupported();
        inputStream31.mark(8257536);
        byte[] byteArray35 = inputStream31.readAllBytes();
        inputStream31.mark(1);
        java.io.InputStream inputStream38 = java.io.InputStream.nullInputStream();
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int43 = inputStream38.readNBytes(byteArray40, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int45 = inputStream31.read(byteArray44);
        int int46 = inputStream22.read(byteArray44);
        boolean boolean47 = inputStream22.markSupported();
        byte[] byteArray48 = inputStream22.readAllBytes();
        inputStream22.mark((int) (byte) 119);
        byte[] byteArray52 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj53 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray52);
        java.lang.Object obj54 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray52);
        int int55 = inputStream22.read(byteArray52);
        java.lang.Class<?> wildcardClass56 = byteArray52.getClass();
        byte[] byteArray57 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray52);
        int int58 = inputStream16.read(byteArray57);
        boolean boolean59 = inputStream16.markSupported();
        java.io.InputStream inputStream60 = java.io.InputStream.nullInputStream();
        long long62 = inputStream60.skip((long) (short) 1);
        long long64 = inputStream60.skip(0L);
        byte[] byteArray66 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int67 = inputStream60.read(byteArray66);
        inputStream60.mark(8257536);
        byte[] byteArray71 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray72 = org.apache.commons.lang3.SerializationUtils.clone(byteArray71);
        byte[] byteArray73 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray71);
        int int74 = inputStream60.read(byteArray71);
        byte[] byteArray76 = inputStream60.readNBytes((int) (byte) 119);
        byte[] byteArray78 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray79 = org.apache.commons.lang3.SerializationUtils.clone(byteArray78);
        java.lang.Object obj80 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray78);
        byte[] byteArray81 = org.apache.commons.lang3.SerializationUtils.clone(byteArray78);
        int int82 = inputStream60.read(byteArray78);
        int int83 = inputStream16.read(byteArray78);
        byte[] byteArray85 = inputStream16.readNBytes(2);
        int int86 = inputStream0.read(byteArray85);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 'a' + "'", obj53, 'a');
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 'a' + "'", obj54, 'a');
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(inputStream60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (short) 0 + "'", obj80, (short) 0);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] {});
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        inputStream0.mark(8257536);
        boolean boolean6 = inputStream0.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        inputStream0.mark(8257536);
        boolean boolean17 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 117);
        byte[] byteArray21 = inputStream0.readNBytes((int) '4');
        java.lang.ClassLoader classLoader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream23 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader22);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        boolean boolean12 = inputStream8.markSupported();
        long long14 = inputStream8.skip((long) (byte) 112);
        inputStream8.mark(1);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        boolean boolean18 = inputStream17.markSupported();
        inputStream17.mark(8257536);
        byte[] byteArray21 = inputStream17.readAllBytes();
        inputStream17.mark(1);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int29 = inputStream24.readNBytes(byteArray26, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int31 = inputStream17.read(byteArray30);
        int int32 = inputStream8.read(byteArray30);
        boolean boolean33 = inputStream8.markSupported();
        byte[] byteArray34 = inputStream8.readAllBytes();
        inputStream8.mark((int) (byte) 119);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj39 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        java.lang.Object obj40 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray38);
        int int41 = inputStream8.read(byteArray38);
        int int42 = inputStream0.read(byteArray38);
        boolean boolean43 = inputStream0.markSupported();
        long long45 = inputStream0.skip((long) (short) 5);
        java.io.SerializablePermission serializablePermission46 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission47 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission46);
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission47);
        byte[] byteArray49 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray48);
        java.lang.Object obj50 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray48);
        int int53 = inputStream0.readNBytes(byteArray48, (int) (byte) 124, (int) (short) 10);
        byte[] byteArray54 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(serializablePermission46);
        org.junit.Assert.assertNotNull(permission47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray13 = inputStream0.readAllBytes();
        long long15 = inputStream0.skip((long) (byte) 120);
        inputStream0.mark((int) (byte) 124);
        byte[] byteArray19 = inputStream0.readNBytes((int) (byte) 112);
        inputStream0.mark((int) (byte) 113);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        byte[] byteArray1 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 114);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 114, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray15 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 118);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        long long20 = inputStream18.skip((long) (short) 1);
        long long22 = inputStream18.skip(0L);
        inputStream18.mark((int) (byte) 100);
        inputStream18.mark((int) (byte) 113);
        java.io.InputStream inputStream27 = java.io.InputStream.nullInputStream();
        boolean boolean28 = inputStream27.markSupported();
        inputStream27.mark(8257536);
        byte[] byteArray31 = inputStream27.readAllBytes();
        long long33 = inputStream27.skip((long) (byte) 125);
        boolean boolean34 = inputStream27.markSupported();
        byte[] byteArray36 = inputStream27.readNBytes((int) '#');
        byte[] byteArray37 = inputStream27.readAllBytes();
        int int38 = inputStream18.read(byteArray37);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray37);
        int int40 = inputStream0.read(byteArray37);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        byte[] byteArray8 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj9 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray8);
        int int10 = inputStream0.read(byteArray8);
        byte[] byteArray11 = inputStream0.readAllBytes();
        byte[] byteArray12 = inputStream0.readAllBytes();
        inputStream0.mark((int) '4');
        boolean boolean15 = inputStream0.markSupported();
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        boolean boolean17 = inputStream16.markSupported();
        inputStream16.mark(8257536);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.clone(byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray21);
        int int24 = inputStream16.read(byteArray23);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.clone(byteArray26);
        int int28 = inputStream16.read(byteArray27);
        byte[] byteArray29 = inputStream16.readAllBytes();
        byte[] byteArray31 = inputStream16.readNBytes((int) (byte) 118);
        java.io.InputStream inputStream32 = java.io.InputStream.nullInputStream();
        boolean boolean33 = inputStream32.markSupported();
        inputStream32.mark(8257536);
        byte[] byteArray37 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.clone(byteArray37);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray37);
        int int40 = inputStream32.read(byteArray39);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.clone(byteArray42);
        int int44 = inputStream32.read(byteArray43);
        byte[] byteArray46 = inputStream32.readNBytes((int) (byte) 123);
        long long48 = inputStream32.skip((long) (byte) 100);
        long long50 = inputStream32.skip((long) (short) -21267);
        long long52 = inputStream32.skip((long) ' ');
        byte[] byteArray54 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray55 = org.apache.commons.lang3.SerializationUtils.clone(byteArray54);
        java.lang.Object obj56 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray55);
        int int59 = inputStream32.readNBytes(byteArray55, 0, (int) (short) 10);
        byte[] byteArray60 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 10);
        int int61 = inputStream16.read(byteArray60);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = inputStream0.readNBytes(byteArray60, (int) (byte) 117, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [117, 117 + 4) out of bounds for length 77");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (short) 0 + "'", obj56, (short) 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark(8257536);
        byte[] byteArray19 = inputStream15.readAllBytes();
        long long21 = inputStream15.skip((long) '4');
        byte[] byteArray22 = inputStream15.readAllBytes();
        long long24 = inputStream15.skip((long) 2);
        byte[] byteArray26 = inputStream15.readNBytes(0);
        int int27 = inputStream0.read(byteArray26);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark(8257536);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.clone(byteArray33);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray33);
        int int36 = inputStream28.read(byteArray35);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        int int40 = inputStream28.read(byteArray39);
        java.io.InputStream inputStream41 = java.io.InputStream.nullInputStream();
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int46 = inputStream41.readNBytes(byteArray43, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray47 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int48 = inputStream28.read(byteArray47);
        long long50 = inputStream28.skip((long) 10);
        boolean boolean51 = inputStream28.markSupported();
        boolean boolean52 = inputStream28.markSupported();
        byte[] byteArray54 = inputStream28.readNBytes((int) (byte) 115);
        int int55 = inputStream0.read(byteArray54);
        boolean boolean56 = inputStream0.markSupported();
        byte[] byteArray57 = inputStream0.readAllBytes();
        byte[] byteArray58 = inputStream0.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission4 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.Permission permission5 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission0);
        java.security.Permission permission7 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission0);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(basicPermission1);
        org.junit.Assert.assertNotNull(basicPermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(basicPermission4);
        org.junit.Assert.assertNotNull(permission5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(permission7);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark(8257536);
        byte[] byteArray19 = inputStream15.readAllBytes();
        long long21 = inputStream15.skip((long) '4');
        byte[] byteArray22 = inputStream15.readAllBytes();
        long long24 = inputStream15.skip((long) 2);
        byte[] byteArray26 = inputStream15.readNBytes(0);
        int int27 = inputStream0.read(byteArray26);
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        boolean boolean29 = inputStream28.markSupported();
        inputStream28.mark(8257536);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.clone(byteArray33);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray33);
        int int36 = inputStream28.read(byteArray35);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.clone(byteArray38);
        int int40 = inputStream28.read(byteArray39);
        java.io.InputStream inputStream41 = java.io.InputStream.nullInputStream();
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int46 = inputStream41.readNBytes(byteArray43, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray47 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int48 = inputStream28.read(byteArray47);
        long long50 = inputStream28.skip((long) 10);
        boolean boolean51 = inputStream28.markSupported();
        boolean boolean52 = inputStream28.markSupported();
        byte[] byteArray54 = inputStream28.readNBytes((int) (byte) 115);
        int int55 = inputStream0.read(byteArray54);
        boolean boolean56 = inputStream0.markSupported();
        byte[] byteArray57 = inputStream0.readAllBytes();
        boolean boolean58 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        boolean boolean4 = inputStream0.markSupported();
        long long6 = inputStream0.skip((long) (byte) 112);
        inputStream0.mark(1);
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        boolean boolean10 = inputStream9.markSupported();
        inputStream9.mark(8257536);
        byte[] byteArray13 = inputStream9.readAllBytes();
        inputStream9.mark(1);
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int21 = inputStream16.readNBytes(byteArray18, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int23 = inputStream9.read(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        boolean boolean25 = inputStream0.markSupported();
        byte[] byteArray26 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 119);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj31 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        java.lang.Object obj32 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray30);
        int int33 = inputStream0.read(byteArray30);
        byte[] byteArray35 = inputStream0.readNBytes(100);
        byte[] byteArray36 = inputStream0.readAllBytes();
        byte[] byteArray37 = inputStream0.readAllBytes();
        java.io.InputStream inputStream38 = java.io.InputStream.nullInputStream();
        boolean boolean39 = inputStream38.markSupported();
        inputStream38.mark(8257536);
        boolean boolean42 = inputStream38.markSupported();
        long long44 = inputStream38.skip((long) (byte) 112);
        inputStream38.mark(1);
        java.io.InputStream inputStream47 = java.io.InputStream.nullInputStream();
        boolean boolean48 = inputStream47.markSupported();
        inputStream47.mark(8257536);
        byte[] byteArray51 = inputStream47.readAllBytes();
        inputStream47.mark(1);
        java.io.InputStream inputStream54 = java.io.InputStream.nullInputStream();
        byte[] byteArray56 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int59 = inputStream54.readNBytes(byteArray56, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray60 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int61 = inputStream47.read(byteArray60);
        int int62 = inputStream38.read(byteArray60);
        boolean boolean63 = inputStream38.markSupported();
        byte[] byteArray64 = inputStream38.readAllBytes();
        inputStream38.mark((int) (byte) 119);
        byte[] byteArray68 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj69 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray68);
        java.lang.Object obj70 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray68);
        int int71 = inputStream38.read(byteArray68);
        byte[] byteArray73 = inputStream38.readNBytes(100);
        byte[] byteArray74 = inputStream38.readAllBytes();
        int int75 = inputStream0.read(byteArray74);
        byte[] byteArray76 = inputStream0.readAllBytes();
        byte[] byteArray77 = inputStream0.readAllBytes();
        byte[] byteArray78 = inputStream0.readAllBytes();
        byte[] byteArray79 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray78);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(inputStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 'a' + "'", obj69, 'a');
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 'a' + "'", obj70, 'a');
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray79);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int12 = inputStream7.readNBytes(byteArray9, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int14 = inputStream0.read(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
        int int18 = inputStream0.read(byteArray16);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) int18);
        java.lang.Class<?> wildcardClass20 = byteArray19.getClass();
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray19);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        boolean boolean7 = inputStream0.markSupported();
        long long9 = inputStream0.skip(100L);
        byte[] byteArray11 = inputStream0.readNBytes((int) (byte) 118);
        long long13 = inputStream0.skip((long) 1);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark(8257536);
        byte[] byteArray18 = inputStream14.readAllBytes();
        long long20 = inputStream14.skip((long) (byte) 125);
        byte[] byteArray22 = inputStream14.readNBytes((int) (byte) 4);
        int int23 = inputStream0.read(byteArray22);
        byte[] byteArray25 = inputStream0.readNBytes((int) (byte) 113);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (short) 10);
        long long16 = inputStream0.skip((long) (byte) 123);
        byte[] byteArray17 = inputStream0.readAllBytes();
        byte[] byteArray19 = inputStream0.readNBytes((int) (byte) 0);
        java.io.SerializablePermission serializablePermission20 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission21 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission20);
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission21);
        java.lang.Object obj23 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int24 = inputStream0.read(byteArray22);
        byte[] byteArray26 = inputStream0.readNBytes((int) (byte) 4);
        inputStream0.mark((int) (byte) 113);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(serializablePermission20);
        org.junit.Assert.assertNotNull(permission21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "(\"java.io.SerializablePermission\" \"enableSubstitution\")");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        boolean boolean14 = inputStream13.markSupported();
        inputStream13.mark(8257536);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray18);
        int int21 = inputStream13.read(byteArray20);
        int int22 = inputStream0.read(byteArray20);
        inputStream0.mark((int) (byte) 16);
        long long26 = inputStream0.skip((long) (byte) 120);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = inputStream0.transferTo(outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip((long) (byte) 113);
        boolean boolean5 = inputStream0.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark(8257536);
        boolean boolean10 = inputStream6.markSupported();
        long long12 = inputStream6.skip((long) (byte) 112);
        inputStream6.mark(1);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark(8257536);
        byte[] byteArray19 = inputStream15.readAllBytes();
        inputStream15.mark(1);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int27 = inputStream22.readNBytes(byteArray24, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int29 = inputStream15.read(byteArray28);
        int int30 = inputStream6.read(byteArray28);
        boolean boolean31 = inputStream6.markSupported();
        byte[] byteArray32 = inputStream6.readAllBytes();
        inputStream6.mark((int) (byte) 119);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj37 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        int int39 = inputStream6.read(byteArray36);
        java.lang.Class<?> wildcardClass40 = byteArray36.getClass();
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray36);
        int int42 = inputStream0.read(byteArray41);
        byte[] byteArray43 = inputStream0.readAllBytes();
        long long45 = inputStream0.skip((long) (byte) 8);
        byte[] byteArray47 = inputStream0.readNBytes((int) (byte) 124);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 'a' + "'", obj37, 'a');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        boolean boolean7 = inputStream0.markSupported();
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.clone(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray13);
        int int16 = inputStream8.read(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.clone(byteArray18);
        int int20 = inputStream8.read(byteArray19);
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int26 = inputStream21.readNBytes(byteArray23, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray27 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int28 = inputStream8.read(byteArray27);
        java.lang.Object obj29 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray27);
        int int30 = inputStream0.read(byteArray27);
        boolean boolean31 = inputStream0.markSupported();
        long long33 = inputStream0.skip((long) (short) 100);
        boolean boolean34 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream36 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader35);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 2 + "'", obj29, (byte) 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        long long10 = inputStream0.skip((long) ' ');
        byte[] byteArray11 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 123);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 117);
        inputStream0.mark((int) (short) 5);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.io.SerializablePermission serializablePermission3 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.security.BasicPermission basicPermission4 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.io.SerializablePermission serializablePermission5 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission0);
        java.io.SerializablePermission serializablePermission6 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission5);
        java.security.Permission permission7 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission6);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(basicPermission1);
        org.junit.Assert.assertNotNull(basicPermission2);
        org.junit.Assert.assertNotNull(serializablePermission3);
        org.junit.Assert.assertNotNull(basicPermission4);
        org.junit.Assert.assertNotNull(serializablePermission5);
        org.junit.Assert.assertNotNull(serializablePermission6);
        org.junit.Assert.assertNotNull(permission7);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) '4');
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 114);
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark(8257536);
        byte[] byteArray14 = inputStream10.readAllBytes();
        long long16 = inputStream10.skip((long) (byte) 125);
        boolean boolean17 = inputStream10.markSupported();
        byte[] byteArray19 = inputStream10.readNBytes((int) '#');
        boolean boolean20 = inputStream10.markSupported();
        byte[] byteArray21 = inputStream10.readAllBytes();
        long long23 = inputStream10.skip((long) (byte) 123);
        byte[] byteArray25 = inputStream10.readNBytes((int) (byte) 0);
        byte[] byteArray26 = inputStream10.readAllBytes();
        byte[] byteArray27 = inputStream10.readAllBytes();
        int int28 = inputStream0.read(byteArray27);
        java.io.SerializablePermission serializablePermission29 = java.io.ObjectStreamConstants.SERIAL_FILTER_PERMISSION;
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) serializablePermission29);
        java.io.SerializablePermission serializablePermission31 = org.apache.commons.lang3.SerializationUtils.clone(serializablePermission29);
        java.lang.Class<?> wildcardClass32 = serializablePermission29.getClass();
        java.lang.Class<?> wildcardClass33 = org.apache.commons.lang3.SerializationUtils.clone(wildcardClass32);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) wildcardClass33);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = inputStream0.readNBytes(byteArray34, (int) (short) 100, (int) (byte) 121);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 121) out of bounds for length 177");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(serializablePermission29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(serializablePermission31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(byteArray34);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes(2);
        inputStream0.mark((int) (byte) 118);
        inputStream0.mark((int) (short) 1);
        byte[] byteArray14 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray19);
        java.io.Serializable serializable22 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray19);
        byte[] byteArray23 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray19);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(serializable22);
        org.junit.Assert.assertNotNull(byteArray23);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 121);
        inputStream0.mark((int) (short) 100);
        long long18 = inputStream0.skip((long) (short) 100);
        inputStream0.mark((int) (short) -1);
        byte[] byteArray21 = inputStream0.readAllBytes();
        byte[] byteArray22 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip((long) (byte) 113);
        boolean boolean5 = inputStream0.markSupported();
        inputStream0.mark(1);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = inputStream8.readAllBytes();
        byte[] byteArray11 = inputStream8.readNBytes((int) (short) 100);
        byte[] byteArray13 = inputStream8.readNBytes(0);
        byte[] byteArray15 = inputStream8.readNBytes(100);
        int int16 = inputStream0.read(byteArray15);
        byte[] byteArray18 = inputStream0.readNBytes(8257536);
        byte[] byteArray19 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream21 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader20);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        int int14 = inputStream0.read(byteArray13);
        boolean boolean15 = inputStream0.markSupported();
        byte[] byteArray16 = inputStream0.readAllBytes();
        boolean boolean17 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 112);
        boolean boolean20 = inputStream0.markSupported();
        byte[] byteArray22 = inputStream0.readNBytes((int) '4');
        boolean boolean23 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        boolean boolean12 = inputStream0.markSupported();
        byte[] byteArray13 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readNBytes((int) (short) 0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        boolean boolean8 = inputStream0.markSupported();
        inputStream0.mark(0);
        byte[] byteArray11 = inputStream0.readAllBytes();
        byte[] byteArray13 = inputStream0.readNBytes(0);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        inputStream14.mark(8257536);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.clone(byteArray19);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray19);
        int int22 = inputStream14.read(byteArray21);
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.clone(byteArray24);
        int int26 = inputStream14.read(byteArray25);
        byte[] byteArray28 = inputStream14.readNBytes((int) (byte) 123);
        long long30 = inputStream14.skip((long) 1);
        long long32 = inputStream14.skip((long) 8257536);
        boolean boolean33 = inputStream14.markSupported();
        boolean boolean34 = inputStream14.markSupported();
        inputStream14.mark((int) (byte) -1);
        java.io.InputStream inputStream37 = java.io.InputStream.nullInputStream();
        boolean boolean38 = inputStream37.markSupported();
        inputStream37.mark(8257536);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray43 = org.apache.commons.lang3.SerializationUtils.clone(byteArray42);
        byte[] byteArray44 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray42);
        int int45 = inputStream37.read(byteArray44);
        byte[] byteArray47 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray48 = org.apache.commons.lang3.SerializationUtils.clone(byteArray47);
        int int49 = inputStream37.read(byteArray48);
        byte[] byteArray51 = inputStream37.readNBytes((int) (byte) 123);
        byte[] byteArray53 = inputStream37.readNBytes((int) ' ');
        java.io.InputStream inputStream54 = java.io.InputStream.nullInputStream();
        boolean boolean55 = inputStream54.markSupported();
        inputStream54.mark(8257536);
        byte[] byteArray59 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray60 = org.apache.commons.lang3.SerializationUtils.clone(byteArray59);
        byte[] byteArray61 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray59);
        int int62 = inputStream54.read(byteArray61);
        byte[] byteArray64 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray65 = org.apache.commons.lang3.SerializationUtils.clone(byteArray64);
        int int66 = inputStream54.read(byteArray65);
        int int67 = inputStream37.read(byteArray65);
        long long69 = inputStream37.skip((long) (byte) 118);
        byte[] byteArray71 = inputStream37.readNBytes(100);
        byte[] byteArray73 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int74 = inputStream37.read(byteArray73);
        int int75 = inputStream14.read(byteArray73);
        byte[] byteArray77 = inputStream14.readNBytes((int) (byte) 123);
        int int78 = inputStream0.read(byteArray77);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray11 = inputStream0.readNBytes(8257536);
        boolean boolean12 = inputStream0.markSupported();
        boolean boolean13 = inputStream0.markSupported();
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 123);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.io.SerializablePermission serializablePermission0 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.BasicPermission basicPermission1 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission2 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission3 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.BasicPermission basicPermission4 = org.apache.commons.lang3.SerializationUtils.clone((java.security.BasicPermission) serializablePermission0);
        java.security.Permission permission5 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) basicPermission4);
        java.security.BasicPermission basicPermission6 = org.apache.commons.lang3.SerializationUtils.clone(basicPermission4);
        java.security.Permission permission7 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) basicPermission6);
        org.junit.Assert.assertNotNull(serializablePermission0);
        org.junit.Assert.assertNotNull(basicPermission1);
        org.junit.Assert.assertNotNull(basicPermission2);
        org.junit.Assert.assertNotNull(basicPermission3);
        org.junit.Assert.assertNotNull(basicPermission4);
        org.junit.Assert.assertNotNull(permission5);
        org.junit.Assert.assertNotNull(basicPermission6);
        org.junit.Assert.assertNotNull(permission7);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        inputStream0.mark((int) (short) 1);
        boolean boolean9 = inputStream0.markSupported();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        boolean boolean11 = inputStream10.markSupported();
        inputStream10.mark(8257536);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.clone(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray15);
        int int18 = inputStream10.read(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.clone(byteArray20);
        int int22 = inputStream10.read(byteArray21);
        byte[] byteArray24 = inputStream10.readNBytes((int) (short) 10);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        byte[] byteArray26 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        int int27 = inputStream0.read(byteArray24);
        byte[] byteArray29 = inputStream0.readNBytes((int) (byte) 126);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        inputStream0.mark((int) (byte) 8);
        boolean boolean6 = inputStream0.markSupported();
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray8 = inputStream0.readAllBytes();
        byte[] byteArray10 = inputStream0.readNBytes((int) (byte) 118);
        long long12 = inputStream0.skip(0L);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        boolean boolean2 = inputStream0.markSupported();
        long long4 = inputStream0.skip((long) (byte) 113);
        boolean boolean5 = inputStream0.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark(8257536);
        boolean boolean10 = inputStream6.markSupported();
        long long12 = inputStream6.skip((long) (byte) 112);
        inputStream6.mark(1);
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        boolean boolean16 = inputStream15.markSupported();
        inputStream15.mark(8257536);
        byte[] byteArray19 = inputStream15.readAllBytes();
        inputStream15.mark(1);
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int27 = inputStream22.readNBytes(byteArray24, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int29 = inputStream15.read(byteArray28);
        int int30 = inputStream6.read(byteArray28);
        boolean boolean31 = inputStream6.markSupported();
        byte[] byteArray32 = inputStream6.readAllBytes();
        inputStream6.mark((int) (byte) 119);
        byte[] byteArray36 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) 'a');
        java.lang.Object obj37 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        java.lang.Object obj38 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray36);
        int int39 = inputStream6.read(byteArray36);
        java.lang.Class<?> wildcardClass40 = byteArray36.getClass();
        byte[] byteArray41 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray36);
        int int42 = inputStream0.read(byteArray41);
        byte[] byteArray44 = inputStream0.readNBytes((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 'a' + "'", obj37, 'a');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        inputStream0.mark(0);
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark((int) (byte) 120);
        byte[] byteArray14 = inputStream0.readAllBytes();
        byte[] byteArray15 = inputStream0.readAllBytes();
        inputStream0.mark((int) (byte) 0);
        long long19 = inputStream0.skip((long) (byte) 122);
        inputStream0.mark((int) (byte) 120);
        boolean boolean22 = inputStream0.markSupported();
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.clone(byteArray28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        int int31 = inputStream23.read(byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.clone(byteArray33);
        int int35 = inputStream23.read(byteArray34);
        byte[] byteArray37 = inputStream23.readNBytes((int) (byte) 123);
        long long39 = inputStream23.skip((long) 1);
        long long41 = inputStream23.skip((long) 8257536);
        boolean boolean42 = inputStream23.markSupported();
        boolean boolean43 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) -1);
        boolean boolean46 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        java.io.SerializablePermission serializablePermission49 = java.io.ObjectStreamConstants.SUBSTITUTION_PERMISSION;
        java.security.Permission permission50 = org.apache.commons.lang3.SerializationUtils.clone((java.security.Permission) serializablePermission49);
        byte[] byteArray51 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) permission50);
        byte[] byteArray52 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray51);
        byte[] byteArray53 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray52);
        int int54 = inputStream23.read(byteArray53);
        int int57 = inputStream0.readNBytes(byteArray53, (int) (byte) 8, (int) (byte) 2);
        boolean boolean58 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(serializablePermission49);
        org.junit.Assert.assertNotNull(permission50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark(0);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray17 = inputStream0.readNBytes((int) (byte) 117);
        inputStream0.mark((int) (short) -1);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(0);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125);
        int int6 = inputStream0.read(byteArray5);
        boolean boolean7 = inputStream0.markSupported();
        long long9 = inputStream0.skip((long) (short) 5);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        byte[] byteArray15 = inputStream0.readAllBytes();
        boolean boolean16 = inputStream0.markSupported();
        byte[] byteArray17 = inputStream0.readAllBytes();
        inputStream0.mark(0);
        java.io.InputStream inputStream20 = java.io.InputStream.nullInputStream();
        byte[] byteArray22 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int25 = inputStream20.readNBytes(byteArray22, (int) (byte) 16, (int) (byte) 2);
        java.lang.Object obj26 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        int int27 = inputStream0.read(byteArray22);
        java.lang.Object obj28 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray22);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray22);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 0 + "'", obj26, (short) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) 0 + "'", obj28, (short) 0);
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray8 = inputStream0.readNBytes((int) (byte) 4);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 100);
        boolean boolean11 = inputStream0.markSupported();
        inputStream0.mark(0);
        byte[] byteArray15 = inputStream0.readNBytes((int) (short) 5);
        byte[] byteArray16 = inputStream0.readAllBytes();
        byte[] byteArray17 = inputStream0.readAllBytes();
        java.lang.ClassLoader classLoader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream19 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader18);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        long long7 = inputStream0.skip((long) (byte) 125);
        boolean boolean8 = inputStream0.markSupported();
        boolean boolean9 = inputStream0.markSupported();
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream classLoaderAwareObjectInputStream11 = new org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream(inputStream0, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        inputStream0.mark((int) (byte) 100);
        inputStream0.mark(8257536);
        byte[] byteArray10 = inputStream0.readNBytes(0);
        boolean boolean11 = inputStream0.markSupported();
        byte[] byteArray12 = inputStream0.readAllBytes();
        byte[] byteArray14 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.clone(byteArray14);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        java.lang.Object obj18 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray14);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray14);
        byte[] byteArray20 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray14);
        byte[] byteArray21 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray20);
        int int24 = inputStream0.readNBytes(byteArray21, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = inputStream0.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 0 + "'", obj18, (short) 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 119);
        long long11 = inputStream0.skip(0L);
        byte[] byteArray13 = inputStream0.readNBytes((int) (byte) 126);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        boolean boolean15 = inputStream14.markSupported();
        boolean boolean16 = inputStream14.markSupported();
        boolean boolean17 = inputStream14.markSupported();
        boolean boolean18 = inputStream14.markSupported();
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        inputStream19.mark(8257536);
        byte[] byteArray23 = inputStream19.readAllBytes();
        inputStream19.mark(1);
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int31 = inputStream26.readNBytes(byteArray28, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray32 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int33 = inputStream19.read(byteArray32);
        java.lang.Object obj34 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray32);
        byte[] byteArray35 = org.apache.commons.lang3.SerializationUtils.clone(byteArray32);
        java.lang.Object obj36 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray32);
        java.io.Serializable serializable37 = org.apache.commons.lang3.SerializationUtils.clone((java.io.Serializable) byteArray32);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray32);
        int int39 = inputStream14.read(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = inputStream0.readNBytes(byteArray32, (int) (byte) 123, (int) (byte) 125);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [123, 123 + 125) out of bounds for length 75");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 2 + "'", obj34, (byte) 2);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 2 + "'", obj36, (byte) 2);
        org.junit.Assert.assertNotNull(serializable37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        java.io.InputStream inputStream13 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int18 = inputStream13.readNBytes(byteArray15, (int) (byte) 16, (int) (byte) 2);
        byte[] byteArray19 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 2);
        int int20 = inputStream0.read(byteArray19);
        long long22 = inputStream0.skip((long) 10);
        boolean boolean23 = inputStream0.markSupported();
        byte[] byteArray25 = inputStream0.readNBytes((int) '#');
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        boolean boolean27 = inputStream26.markSupported();
        inputStream26.mark(8257536);
        byte[] byteArray30 = inputStream26.readAllBytes();
        long long32 = inputStream26.skip((long) '4');
        byte[] byteArray33 = inputStream26.readAllBytes();
        long long35 = inputStream26.skip((long) 2);
        byte[] byteArray37 = inputStream26.readNBytes(0);
        java.io.InputStream inputStream38 = java.io.InputStream.nullInputStream();
        boolean boolean39 = inputStream38.markSupported();
        inputStream38.mark(8257536);
        byte[] byteArray42 = inputStream38.readAllBytes();
        long long44 = inputStream38.skip((long) (byte) 125);
        inputStream38.mark(0);
        boolean boolean47 = inputStream38.markSupported();
        java.io.InputStream inputStream48 = java.io.InputStream.nullInputStream();
        boolean boolean49 = inputStream48.markSupported();
        inputStream48.mark(8257536);
        byte[] byteArray52 = inputStream48.readAllBytes();
        long long54 = inputStream48.skip((long) (byte) 125);
        boolean boolean55 = inputStream48.markSupported();
        byte[] byteArray57 = inputStream48.readNBytes((int) (byte) 8);
        int int60 = inputStream38.readNBytes(byteArray57, (int) (byte) 0, 0);
        int int61 = inputStream26.read(byteArray57);
        byte[] byteArray62 = inputStream26.readAllBytes();
        byte[] byteArray63 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray62);
        int int64 = inputStream0.read(byteArray62);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        long long18 = inputStream0.skip((long) (short) -21267);
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        boolean boolean20 = inputStream19.markSupported();
        boolean boolean21 = inputStream19.markSupported();
        byte[] byteArray22 = inputStream19.readAllBytes();
        byte[] byteArray24 = inputStream19.readNBytes((int) (byte) 115);
        int int25 = inputStream0.read(byteArray24);
        byte[] byteArray26 = inputStream0.readAllBytes();
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray26, outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        int int5 = inputStream0.readNBytes(byteArray2, (int) (byte) 16, (int) (byte) 2);
        long long7 = inputStream0.skip((long) (byte) 10);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        boolean boolean9 = inputStream8.markSupported();
        inputStream8.mark(8257536);
        byte[] byteArray12 = inputStream8.readAllBytes();
        long long14 = inputStream8.skip((long) (byte) 125);
        inputStream8.mark(0);
        boolean boolean17 = inputStream8.markSupported();
        inputStream8.mark((int) (byte) 100);
        inputStream8.mark((int) (byte) 120);
        byte[] byteArray22 = inputStream8.readAllBytes();
        byte[] byteArray23 = inputStream8.readAllBytes();
        byte[] byteArray24 = org.apache.commons.lang3.SerializationUtils.clone(byteArray23);
        byte[] byteArray25 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray24);
        int int26 = inputStream0.read(byteArray24);
        byte[] byteArray28 = inputStream0.readNBytes((int) (byte) 116);
        byte[] byteArray29 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip((long) (byte) 113);
        boolean boolean5 = inputStream0.markSupported();
        java.io.InputStream inputStream6 = java.io.InputStream.nullInputStream();
        boolean boolean7 = inputStream6.markSupported();
        inputStream6.mark(8257536);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.clone(byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray11);
        int int14 = inputStream6.read(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.clone(byteArray16);
        int int18 = inputStream6.read(byteArray17);
        byte[] byteArray20 = inputStream6.readNBytes((int) (byte) 123);
        byte[] byteArray22 = inputStream6.readNBytes((int) ' ');
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        boolean boolean24 = inputStream23.markSupported();
        inputStream23.mark(8257536);
        byte[] byteArray28 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray29 = org.apache.commons.lang3.SerializationUtils.clone(byteArray28);
        byte[] byteArray30 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray28);
        int int31 = inputStream23.read(byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray34 = org.apache.commons.lang3.SerializationUtils.clone(byteArray33);
        int int35 = inputStream23.read(byteArray34);
        int int36 = inputStream6.read(byteArray34);
        byte[] byteArray38 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray39 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) true);
        byte[] byteArray40 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray39);
        int int41 = inputStream6.read(byteArray40);
        byte[] byteArray42 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray40);
        int int43 = inputStream0.read(byteArray40);
        boolean boolean44 = inputStream0.markSupported();
        inputStream0.mark(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        byte[] byteArray10 = inputStream0.readAllBytes();
        long long12 = inputStream0.skip((long) (byte) 114);
        boolean boolean13 = inputStream0.markSupported();
        long long15 = inputStream0.skip((long) (byte) 1);
        boolean boolean16 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) (byte) 123);
        long long7 = inputStream0.skip((long) (byte) 114);
        long long9 = inputStream0.skip((long) (byte) -1);
        inputStream0.mark((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray4 = inputStream0.readAllBytes();
        long long6 = inputStream0.skip((long) (byte) 125);
        boolean boolean7 = inputStream0.markSupported();
        byte[] byteArray9 = inputStream0.readNBytes((int) '#');
        boolean boolean10 = inputStream0.markSupported();
        byte[] byteArray11 = inputStream0.readAllBytes();
        long long13 = inputStream0.skip((long) (byte) 123);
        byte[] byteArray15 = inputStream0.readNBytes((int) (byte) 0);
        boolean boolean16 = inputStream0.markSupported();
        boolean boolean17 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        long long5 = inputStream0.skip((long) ' ');
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (-1.0d));
        int int8 = inputStream0.read(byteArray7);
        inputStream0.mark((int) (byte) 118);
        byte[] byteArray12 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray13 = org.apache.commons.lang3.SerializationUtils.clone(byteArray12);
        java.lang.Object obj14 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        java.lang.Object obj15 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        java.lang.Object obj16 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray12);
        byte[] byteArray17 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.SerializationUtils.clone(byteArray17);
        int int19 = inputStream0.read(byteArray18);
        byte[] byteArray20 = inputStream0.readAllBytes();
        byte[] byteArray22 = inputStream0.readNBytes((int) (short) 0);
        byte[] byteArray24 = inputStream0.readNBytes((int) (byte) 125);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (byte) 125, outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The OutputStream must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 0 + "'", obj14, (short) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 0 + "'", obj16, (short) 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        byte[] byteArray6 = inputStream0.readNBytes((int) (byte) 125);
        byte[] byteArray7 = inputStream0.readAllBytes();
        byte[] byteArray8 = inputStream0.readAllBytes();
        boolean boolean9 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 113);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = inputStream0.transferTo(outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        inputStream0.mark(8257536);
        byte[] byteArray5 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray6 = org.apache.commons.lang3.SerializationUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) byteArray5);
        int int8 = inputStream0.read(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        byte[] byteArray11 = org.apache.commons.lang3.SerializationUtils.clone(byteArray10);
        int int12 = inputStream0.read(byteArray11);
        byte[] byteArray14 = inputStream0.readNBytes((int) (byte) 123);
        long long16 = inputStream0.skip((long) (byte) 100);
        inputStream0.mark((int) (byte) 113);
        boolean boolean19 = inputStream0.markSupported();
        byte[] byteArray21 = inputStream0.readNBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.lang3.SerializationUtils.deserialize(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        long long2 = inputStream0.skip((long) (short) 1);
        long long4 = inputStream0.skip(0L);
        long long6 = inputStream0.skip((long) (byte) -1);
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        boolean boolean8 = inputStream7.markSupported();
        inputStream7.mark(8257536);
        byte[] byteArray11 = inputStream7.readAllBytes();
        int int12 = inputStream0.read(byteArray11);
        inputStream0.mark((int) (byte) 116);
        byte[] byteArray16 = org.apache.commons.lang3.SerializationUtils.serialize((java.io.Serializable) (short) 0);
        java.lang.Object obj17 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray16);
        int int18 = inputStream0.read(byteArray16);
        byte[] byteArray20 = inputStream0.readNBytes((int) (byte) 125);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.lang3.SerializationUtils.deserialize(byteArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang3.SerializationException; message: java.io.EOFException");
        } catch (org.apache.commons.lang3.SerializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }
}

