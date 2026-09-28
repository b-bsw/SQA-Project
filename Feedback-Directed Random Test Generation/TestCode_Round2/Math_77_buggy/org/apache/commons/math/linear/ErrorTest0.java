package org.apache.commons.math.linear;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.mapCoshToSelf();
        boolean boolean6 = arrayRealVector3.isInfinite();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector3.mapAtan();
        double double8 = openMapRealVector1.dotProduct((org.apache.commons.math.linear.RealVector) arrayRealVector3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector3.", openMapRealVector1.equals(arrayRealVector3) == arrayRealVector3.equals(openMapRealVector1));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(realVector2);
        double[] doubleArray4 = arrayRealVector3.getData();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapLog();
        double[] doubleArray10 = arrayRealVector6.getDataRef();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        double[] doubleArray14 = arrayRealVector12.getDataRef();
        double double15 = arrayRealVector6.dotProduct(doubleArray14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray14, 1.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector3, doubleArray14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector17.", arrayRealVector1.equals(openMapRealVector17) == openMapRealVector17.equals(arrayRealVector1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        double[] doubleArray5 = arrayRealVector1.getDataRef();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        double[] doubleArray9 = arrayRealVector7.getDataRef();
        double double10 = arrayRealVector1.dotProduct(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9, 1.0d);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector12.mapExpm1ToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and realVector13.", arrayRealVector1.equals(realVector13) == realVector13.equals(arrayRealVector1));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(1);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.mapInv();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector3.mapLog();
        double[] doubleArray7 = arrayRealVector3.getDataRef();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapExpToSelf();
        double[] doubleArray11 = arrayRealVector9.getDataRef();
        double double12 = arrayRealVector3.dotProduct(doubleArray11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray11, 1.0d);
        boolean boolean15 = openMapRealVector1.equals((java.lang.Object) 1.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector3 and openMapRealVector14.", arrayRealVector3.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector3));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        boolean boolean5 = openMapRealVector4.isInfinite();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapLog();
        int int10 = arrayRealVector7.getDimension();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsin();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapLog();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapUlpToSelf();
        double[] doubleArray17 = arrayRealVector13.toArray();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector7.append(doubleArray17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector4, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector7.mapTanToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector19.", openMapRealVector4.equals(arrayRealVector19) == arrayRealVector19.equals(openMapRealVector4));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30, 1.0E-12d);
        double double34 = openMapRealVector33.getL1Norm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector33.", arrayRealVector1.equals(openMapRealVector33) == openMapRealVector33.equals(arrayRealVector1));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        double[] doubleArray4 = arrayRealVector1.getData();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapSinToSelf();
        java.lang.Double[] doubleArray9 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9, (-1.0d));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(realVector5, arrayRealVector13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector10 and arrayRealVector13.", openMapRealVector10.equals(arrayRealVector13) == arrayRealVector13.equals(openMapRealVector10));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        boolean boolean5 = openMapRealVector4.isInfinite();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapLog();
        int int10 = arrayRealVector7.getDimension();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsin();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapLog();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapUlpToSelf();
        double[] doubleArray17 = arrayRealVector13.toArray();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector7.append(doubleArray17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector4, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector7.mapDivideToSelf((double) ' ');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector19.", openMapRealVector4.equals(arrayRealVector19) == arrayRealVector19.equals(openMapRealVector4));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapCeil();
        double double8 = openMapRealVector2.getL1Distance(openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector11.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector15.mapCeil();
        double double17 = openMapRealVector11.getL1Distance(openMapRealVector15);
        double double18 = openMapRealVector2.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector15.mapSubtract(10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector23.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector27.mapCeil();
        double double29 = openMapRealVector23.getL1Distance(openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector32.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector36.mapCeil();
        double double38 = openMapRealVector32.getL1Distance(openMapRealVector36);
        double double39 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector36.mapSubtract(10.0d);
        double double42 = openMapRealVector15.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        int int43 = openMapRealVector36.getDimension();
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector36.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector47.mapCeil();
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector47.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector52.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector47.ebeMultiply(realVector53);
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector47.mapTanToSelf();
        double double56 = openMapRealVector36.getDistance(openMapRealVector47);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector36.mapDivide(0.0d);
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector60.mapInv();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector60.mapLog();
        double[] doubleArray64 = arrayRealVector60.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector60, true);
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector68 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray67);
        org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector68.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector68.mapLog();
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector68.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector68.mapCeil();
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector68.mapTanToSelf();
        double[] doubleArray74 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray74);
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector75.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector77 = arrayRealVector75.mapLog();
        org.apache.commons.math.linear.RealVector realVector78 = arrayRealVector75.mapUlpToSelf();
        double[] doubleArray79 = arrayRealVector75.toArray();
        arrayRealVector68.data = doubleArray79;
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector82 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray81);
        org.apache.commons.math.linear.RealVector realVector83 = arrayRealVector82.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector84 = arrayRealVector82.mapInv();
        org.apache.commons.math.linear.RealVector realVector85 = arrayRealVector82.mapLog();
        double[] doubleArray86 = arrayRealVector82.getDataRef();
        double[] doubleArray87 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector88 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray87);
        org.apache.commons.math.linear.RealVector realVector89 = arrayRealVector88.mapExpToSelf();
        double[] doubleArray90 = arrayRealVector88.getDataRef();
        double double91 = arrayRealVector82.dotProduct(doubleArray90);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector92 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray79, arrayRealVector82);
        double double93 = arrayRealVector60.getLInfDistance(doubleArray79);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector60);
        double double95 = openMapRealVector36.getDistance(openMapRealVector94);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector60 and openMapRealVector94.", arrayRealVector60.equals(openMapRealVector94) == openMapRealVector94.equals(arrayRealVector60));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        double double15 = arrayRealVector8.dotProduct(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector8.mapFloor();
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapRint();
        double double21 = arrayRealVector8.dotProduct(arrayRealVector18);
        double double22 = arrayRealVector8.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6, arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector6.mapDivide((double) (short) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector6 and arrayRealVector23.", openMapRealVector6.equals(arrayRealVector23) == arrayRealVector23.equals(openMapRealVector6));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapSinh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(realVector5);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector8.mapUlp();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector8.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector8.mapAbsToSelf();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapLog();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector16.mapUlpToSelf();
        double[] doubleArray20 = arrayRealVector16.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8, doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector6.ebeMultiply(doubleArray20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector6.", arrayRealVector1.equals(openMapRealVector6) == openMapRealVector6.equals(arrayRealVector1));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30, 1.0E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector33.", arrayRealVector1.equals(openMapRealVector33) == openMapRealVector33.equals(arrayRealVector1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        boolean boolean5 = openMapRealVector4.isInfinite();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapLog();
        int int10 = arrayRealVector7.getDimension();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsin();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapLog();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapUlpToSelf();
        double[] doubleArray17 = arrayRealVector13.toArray();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector7.append(doubleArray17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector4, arrayRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector4.mapAdd((double) 0L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector19.", openMapRealVector4.equals(arrayRealVector19) == arrayRealVector19.equals(openMapRealVector4));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        boolean boolean5 = openMapRealVector4.isInfinite();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapLog();
        int int10 = arrayRealVector7.getDimension();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsin();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapLog();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapUlpToSelf();
        double[] doubleArray17 = arrayRealVector13.toArray();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector7.append(doubleArray17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector4, arrayRealVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector4.mapAddToSelf((double) (byte) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector21 and arrayRealVector19.", openMapRealVector21.equals(arrayRealVector19) == arrayRealVector19.equals(openMapRealVector21));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (-1.0d));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector7.", openMapRealVector4.equals(arrayRealVector7) == arrayRealVector7.equals(openMapRealVector4));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapInv();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector33.mapLog();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector33.mapRint();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector31.projection((org.apache.commons.math.linear.RealVector) arrayRealVector33);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapLog();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector41.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector41.mapCeil();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector41.mapTanToSelf();
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector48.mapLog();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector48.mapUlpToSelf();
        double[] doubleArray52 = arrayRealVector48.toArray();
        arrayRealVector41.data = doubleArray52;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray52);
        arrayRealVector31.setSubVector((int) (byte) 0, doubleArray52);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector54.", arrayRealVector1.equals(openMapRealVector54) == openMapRealVector54.equals(arrayRealVector1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) (short) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector5.", openMapRealVector4.equals(arrayRealVector5) == arrayRealVector5.equals(openMapRealVector4));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(realVector2);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapAtanToSelf();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapLog();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector6.mapCeil();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector6.mapTanToSelf();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapLog();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapUlpToSelf();
        double[] doubleArray17 = arrayRealVector13.toArray();
        arrayRealVector6.data = doubleArray17;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector3, doubleArray17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector19.", arrayRealVector1.equals(openMapRealVector19) == openMapRealVector19.equals(arrayRealVector1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) (-1L));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector5.", openMapRealVector4.equals(arrayRealVector5) == arrayRealVector5.equals(openMapRealVector4));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapInv();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector33.mapLog();
        double[] doubleArray37 = arrayRealVector33.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33, true);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapLog();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector41.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector41.mapCeil();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector41.mapTanToSelf();
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector48.mapLog();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector48.mapUlpToSelf();
        double[] doubleArray52 = arrayRealVector48.toArray();
        arrayRealVector41.data = doubleArray52;
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray54);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector55.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapInv();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector55.mapLog();
        double[] doubleArray59 = arrayRealVector55.getDataRef();
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapExpToSelf();
        double[] doubleArray63 = arrayRealVector61.getDataRef();
        double double64 = arrayRealVector55.dotProduct(doubleArray63);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, arrayRealVector55);
        double double66 = arrayRealVector33.getLInfDistance(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray69);
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector70.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector70.mapCoshToSelf();
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector74 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector74.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector74.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector78 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector74, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector79 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector70, arrayRealVector74);
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector79.mapAddToSelf((double) 0);
        double[] doubleArray82 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector83 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray82);
        org.apache.commons.math.linear.RealVector realVector84 = arrayRealVector83.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector85 = arrayRealVector83.mapLog();
        org.apache.commons.math.linear.RealVector realVector87 = arrayRealVector83.mapDivideToSelf((-1.0d));
        org.apache.commons.math.linear.RealVector realVector88 = arrayRealVector83.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector90 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector83, false);
        double double91 = arrayRealVector79.getLInfDistance(arrayRealVector90);
        org.apache.commons.math.linear.RealVector realVector93 = arrayRealVector79.mapAddToSelf(1.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector94 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector79);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector68.", arrayRealVector1.equals(openMapRealVector68) == openMapRealVector68.equals(arrayRealVector1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector5.", openMapRealVector4.equals(arrayRealVector5) == arrayRealVector5.equals(openMapRealVector4));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3, 0, (int) (byte) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector10.", openMapRealVector4.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector4));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        double double15 = arrayRealVector8.dotProduct(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector8.mapFloor();
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapRint();
        double double21 = arrayRealVector8.dotProduct(arrayRealVector18);
        double double22 = arrayRealVector8.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6, arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector6 and arrayRealVector23.", openMapRealVector6.equals(arrayRealVector23) == arrayRealVector23.equals(openMapRealVector6));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', 100, (double) (short) 1);
        double double4 = openMapRealVector3.getL1Norm();
        double[] doubleArray5 = openMapRealVector3.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector6.mapSinh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and arrayRealVector7.", openMapRealVector3.equals(arrayRealVector7) == arrayRealVector7.equals(openMapRealVector3));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAsinToSelf();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog();
        double double13 = arrayRealVector6.dotProduct(arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector10.mapPowToSelf((double) (-1.0f));
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector17.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapCeil();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector17.mapTanToSelf();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapLog();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapUlpToSelf();
        double[] doubleArray28 = arrayRealVector24.toArray();
        arrayRealVector17.data = doubleArray28;
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector10.append(doubleArray28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector33.mapLog();
        boolean boolean35 = arrayRealVector31.equals((java.lang.Object) realVector34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector33.", arrayRealVector1.equals(openMapRealVector33) == openMapRealVector33.equals(arrayRealVector1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapExpToSelf();
        double[] doubleArray5 = arrayRealVector3.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector1.ebeDivide(doubleArray5);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector3.", openMapRealVector1.equals(arrayRealVector3) == arrayRealVector3.equals(openMapRealVector1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        boolean boolean5 = openMapRealVector4.isInfinite();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapLog();
        int int10 = arrayRealVector7.getDimension();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsin();
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapLog();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapUlpToSelf();
        double[] doubleArray17 = arrayRealVector13.toArray();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector7.append(doubleArray17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector4, arrayRealVector7);
        int int20 = arrayRealVector7.getDimension();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector19.", openMapRealVector4.equals(arrayRealVector19) == arrayRealVector19.equals(openMapRealVector4));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog();
        double double8 = arrayRealVector1.dotProduct(arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector5.mapPowToSelf((double) (-1.0f));
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector12.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector12.mapCeil();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector12.mapTanToSelf();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector19.mapLog();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector19.mapUlpToSelf();
        double[] doubleArray23 = arrayRealVector19.toArray();
        arrayRealVector12.data = doubleArray23;
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector5.append(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector5.mapExpm1ToSelf();
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray27);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector28.mapLog();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector28.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector28.mapCeil();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector28.mapTanToSelf();
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray34);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector35.mapLog();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector35.mapUlpToSelf();
        double[] doubleArray39 = arrayRealVector35.toArray();
        arrayRealVector28.data = doubleArray39;
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray41);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapInv();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector42.mapLog();
        double[] doubleArray46 = arrayRealVector42.getDataRef();
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapExpToSelf();
        double[] doubleArray50 = arrayRealVector48.getDataRef();
        double double51 = arrayRealVector42.dotProduct(doubleArray50);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray39, arrayRealVector42);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray53);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector54.mapLog();
        double[] doubleArray57 = arrayRealVector54.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray39, doubleArray57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray57, 1.0E-12d);
        double double61 = arrayRealVector5.dotProduct(doubleArray57);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector60.", arrayRealVector1.equals(openMapRealVector60) == openMapRealVector60.equals(arrayRealVector1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3, 0, (int) (byte) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector10.", openMapRealVector4.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector4));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double double4 = arrayRealVector1.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapExpm1ToSelf();
        double[] doubleArray6 = arrayRealVector1.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray6, (double) (short) 1);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector8.mapLog1p();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector8.", arrayRealVector1.equals(openMapRealVector8) == openMapRealVector8.equals(arrayRealVector1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        org.apache.commons.math.linear.RealVector realVector2 = openMapRealVector1.mapLog();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector1.mapAdd(0.0d);
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog();
        double double13 = arrayRealVector6.dotProduct(arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector6.mapFloor();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector20);
        double double22 = arrayRealVector6.dotProduct(arrayRealVector21);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector6.mapCoshToSelf();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapLog();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector25.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector25.mapCeil();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector25.mapTanToSelf();
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapLog();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector32.mapUlpToSelf();
        double[] doubleArray36 = arrayRealVector32.toArray();
        arrayRealVector25.data = doubleArray36;
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapInv();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector39.mapLog();
        double[] doubleArray43 = arrayRealVector39.getDataRef();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray44);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector45.mapExpToSelf();
        double[] doubleArray47 = arrayRealVector45.getDataRef();
        double double48 = arrayRealVector39.dotProduct(doubleArray47);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray36, arrayRealVector39);
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray50);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector51.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapLog();
        double[] doubleArray54 = arrayRealVector51.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray36, doubleArray54);
        double double56 = arrayRealVector6.getLInfDistance(doubleArray54);
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray57);
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector58.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector58.mapLog();
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector58.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector58.mapDivideToSelf((double) (-1L));
        double double64 = arrayRealVector58.getLInfNorm();
        double[] doubleArray65 = arrayRealVector58.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray54, doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector1.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector6.", openMapRealVector1.equals(arrayRealVector6) == arrayRealVector6.equals(openMapRealVector1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector1.mapPow((double) (short) 0);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapInv();
        double double13 = arrayRealVector10.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector10.mapExpm1ToSelf();
        double[] doubleArray15 = arrayRealVector10.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray15, (double) (short) 1);
        double double18 = arrayRealVector1.dotProduct(doubleArray15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector17.", arrayRealVector1.equals(openMapRealVector17) == openMapRealVector17.equals(arrayRealVector1));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        double[] doubleArray5 = arrayRealVector1.getDataRef();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        double[] doubleArray9 = arrayRealVector7.getDataRef();
        double double10 = arrayRealVector1.dotProduct(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9, 1.0d);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapLog();
        double[] doubleArray17 = arrayRealVector14.getData();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector14.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector14.mapSubtract((double) 10L);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9, arrayRealVector14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector12.", arrayRealVector1.equals(openMapRealVector12) == openMapRealVector12.equals(arrayRealVector1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100, 10);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector2.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(realVector4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapSignumToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector6.", openMapRealVector2.equals(realVector6) == realVector6.equals(openMapRealVector2));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog();
        double double8 = arrayRealVector1.dotProduct(arrayRealVector5);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapInv();
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapLog();
        double double17 = arrayRealVector10.dotProduct(arrayRealVector14);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector14.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5, arrayRealVector14);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector14.mapTanhToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector14.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector14.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector14.mapCoshToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector25.mapExp();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector14.projection((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector25.", arrayRealVector1.equals(openMapRealVector25) == openMapRealVector25.equals(arrayRealVector1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(realVector4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector8.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor12 = openMapRealVector8.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double16 = openMapRealVector8.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector19.mapCeil();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector19.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector24.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector19.ebeMultiply(realVector25);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector26.mapCosToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector26.mapTanhToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector8.append(openMapRealVector26);
        double double30 = arrayRealVector5.getDistance((org.apache.commons.math.linear.RealVector) openMapRealVector29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector29.", arrayRealVector1.equals(openMapRealVector29) == openMapRealVector29.equals(arrayRealVector1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', 100, (double) (short) 1);
        double double4 = openMapRealVector3.getL1Norm();
        double[] doubleArray5 = openMapRealVector3.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapCbrt();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and arrayRealVector7.", openMapRealVector3.equals(arrayRealVector7) == arrayRealVector7.equals(openMapRealVector3));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAsinToSelf();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapCoshToSelf();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6, arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector6);
        double[] doubleArray17 = arrayRealVector16.getDataRef();
        double double18 = arrayRealVector1.dotProduct(doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapLog();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector20.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector20.mapCeil();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector20.mapTanToSelf();
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector27.mapUlpToSelf();
        double[] doubleArray31 = arrayRealVector27.toArray();
        arrayRealVector20.data = doubleArray31;
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector34.mapInv();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector34.mapLog();
        double[] doubleArray38 = arrayRealVector34.getDataRef();
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray39);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector40.mapExpToSelf();
        double[] doubleArray42 = arrayRealVector40.getDataRef();
        double double43 = arrayRealVector34.dotProduct(doubleArray42);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31, arrayRealVector34);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray45);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector46.mapLog();
        double[] doubleArray49 = arrayRealVector46.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31, doubleArray49);
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray51);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector52.mapInv();
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector52.mapLog();
        double[] doubleArray56 = arrayRealVector52.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector52, true);
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector60.mapLog();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector60.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector60.mapCeil();
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector60.mapTanToSelf();
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray66);
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector67.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector67.mapLog();
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector67.mapUlpToSelf();
        double[] doubleArray71 = arrayRealVector67.toArray();
        arrayRealVector60.data = doubleArray71;
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector74 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector74.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector74.mapInv();
        org.apache.commons.math.linear.RealVector realVector77 = arrayRealVector74.mapLog();
        double[] doubleArray78 = arrayRealVector74.getDataRef();
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector80 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray79);
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector80.mapExpToSelf();
        double[] doubleArray82 = arrayRealVector80.getDataRef();
        double double83 = arrayRealVector74.dotProduct(doubleArray82);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector84 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray71, arrayRealVector74);
        double double85 = arrayRealVector52.getLInfDistance(doubleArray71);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector86 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31, arrayRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray31);
        double double88 = arrayRealVector1.dotProduct(doubleArray31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector87.", arrayRealVector1.equals(openMapRealVector87) == openMapRealVector87.equals(arrayRealVector1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, false);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog10();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog1pToSelf();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.mapLog();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector9.mapUlp();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector9.mapAsinToSelf();
        double double15 = arrayRealVector5.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector9);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector5.mapAdd((double) 0);
        double[] doubleArray18 = arrayRealVector5.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray18, (double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector20.mapLog();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector20.", arrayRealVector1.equals(openMapRealVector20) == openMapRealVector20.equals(arrayRealVector1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapCeil();
        double double8 = openMapRealVector2.getL1Distance(openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector11.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector15.mapCeil();
        double double17 = openMapRealVector11.getL1Distance(openMapRealVector15);
        double double18 = openMapRealVector2.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector2.mapCbrt();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2, (int) (byte) 100);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapLog();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector23.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector23.mapCeil();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector23.mapTanToSelf();
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray29);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector30.mapLog();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector30.mapUlpToSelf();
        double[] doubleArray34 = arrayRealVector30.toArray();
        arrayRealVector23.data = doubleArray34;
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray36);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector37.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapInv();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector37.mapLog();
        double[] doubleArray41 = arrayRealVector37.getDataRef();
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapExpToSelf();
        double[] doubleArray45 = arrayRealVector43.getDataRef();
        double double46 = arrayRealVector37.dotProduct(doubleArray45);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray34, arrayRealVector37);
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray48);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector49.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector49.mapLog();
        double[] doubleArray52 = arrayRealVector49.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray34, doubleArray52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray52, 1.0E-12d);
        boolean boolean56 = openMapRealVector21.equals((java.lang.Object) doubleArray52);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector55.", arrayRealVector23.equals(openMapRealVector55) == openMapRealVector55.equals(arrayRealVector23));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        org.apache.commons.math.linear.RealVector realVector2 = openMapRealVector1.mapExp();
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapExpm1();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.append((double) (byte) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector4.", openMapRealVector1.equals(arrayRealVector4) == arrayRealVector4.equals(openMapRealVector1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapAddToSelf((double) 0);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapLog();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector14.mapDivideToSelf((-1.0d));
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector14.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14, false);
        double double22 = arrayRealVector10.getLInfDistance(arrayRealVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector21);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLogToSelf();
        java.lang.Double[] doubleArray28 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28, (-1), (int) (short) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28);
        boolean boolean34 = arrayRealVector23.equals((java.lang.Object) doubleArray28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector29 and arrayRealVector33.", openMapRealVector29.equals(arrayRealVector33) == arrayRealVector33.equals(openMapRealVector29));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        double[] doubleArray3 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapRintToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector7.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor11 = openMapRealVector7.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double15 = openMapRealVector7.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double[] doubleArray17 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector7.ebeMultiply(doubleArray17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append((double) (-1));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) openMapRealVector20);
        java.lang.Class<?> wildcardClass22 = openMapRealVector20.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector20 and arrayRealVector21.", openMapRealVector20.equals(arrayRealVector21) == arrayRealVector21.equals(openMapRealVector20));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector14.copy();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector14.", arrayRealVector1.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector2.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor6 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double10 = openMapRealVector2.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector13.mapCeil();
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector13.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector18.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector13.ebeMultiply(realVector19);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector20.mapCosToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector20.mapTanhToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector2.append(openMapRealVector20);
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapLog();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector25.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector25.mapDivideToSelf((double) (-1L));
        double double31 = arrayRealVector25.getLInfNorm();
        double[] doubleArray32 = arrayRealVector25.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector23.projection(doubleArray32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector23 and arrayRealVector25.", openMapRealVector23.equals(arrayRealVector25) == arrayRealVector25.equals(openMapRealVector23));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(realVector2);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.mapSqrtToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector3, (org.apache.commons.math.linear.RealVector) openMapRealVector7);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector7.", arrayRealVector1.equals(openMapRealVector7) == openMapRealVector7.equals(arrayRealVector1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', 100, (double) (short) 1);
        double double4 = openMapRealVector3.getL1Norm();
        double[] doubleArray5 = openMapRealVector3.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapSqrtToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and realVector8.", openMapRealVector3.equals(realVector8) == realVector8.equals(openMapRealVector3));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3, (-1), (int) (short) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector8.", openMapRealVector4.equals(arrayRealVector8) == arrayRealVector8.equals(openMapRealVector4));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapFloorToSelf();
        int int6 = arrayRealVector1.getDimension();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        double[] doubleArray10 = arrayRealVector8.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapAtanToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector13.mapTanToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and realVector14.", arrayRealVector1.equals(realVector14) == realVector14.equals(arrayRealVector1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapInv();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector33.mapLog();
        double[] doubleArray37 = arrayRealVector33.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33, true);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapLog();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector41.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector41.mapCeil();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector41.mapTanToSelf();
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector48.mapLog();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector48.mapUlpToSelf();
        double[] doubleArray52 = arrayRealVector48.toArray();
        arrayRealVector41.data = doubleArray52;
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray54);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector55.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapInv();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector55.mapLog();
        double[] doubleArray59 = arrayRealVector55.getDataRef();
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapExpToSelf();
        double[] doubleArray63 = arrayRealVector61.getDataRef();
        double double64 = arrayRealVector55.dotProduct(doubleArray63);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, arrayRealVector55);
        double double66 = arrayRealVector33.getLInfDistance(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray69);
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector70.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector70.mapInv();
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector74 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector74.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector74.mapLog();
        double double77 = arrayRealVector70.dotProduct(arrayRealVector74);
        org.apache.commons.math.linear.RealVector realVector78 = arrayRealVector70.mapFloor();
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector80 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray79);
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector80.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector82 = arrayRealVector80.mapRint();
        double double83 = arrayRealVector70.dotProduct(arrayRealVector80);
        double double84 = arrayRealVector70.getNorm();
        org.apache.commons.math.linear.RealVector realVector85 = arrayRealVector70.mapRintToSelf();
        boolean boolean86 = arrayRealVector70.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = openMapRealVector68.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector70);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector68.", arrayRealVector1.equals(openMapRealVector68) == openMapRealVector68.equals(arrayRealVector1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30, 1.0E-12d);
        double[] doubleArray34 = openMapRealVector33.toArray();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector33.", arrayRealVector1.equals(openMapRealVector33) == openMapRealVector33.equals(arrayRealVector1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        double[] doubleArray5 = arrayRealVector1.getDataRef();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        double[] doubleArray9 = arrayRealVector7.getDataRef();
        double double10 = arrayRealVector1.dotProduct(doubleArray9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9, 1.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector12, (int) (byte) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector12.", arrayRealVector1.equals(openMapRealVector12) == openMapRealVector12.equals(arrayRealVector1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapCeil();
        double double8 = openMapRealVector2.getL1Distance(openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector11.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector15.mapCeil();
        double double17 = openMapRealVector11.getL1Distance(openMapRealVector15);
        double double18 = openMapRealVector2.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector15.append(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector21.mapAbs();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapInv();
        double double27 = arrayRealVector24.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector24.mapExpm1ToSelf();
        double[] doubleArray29 = arrayRealVector24.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray29, (double) (short) 1);
        double double32 = openMapRealVector21.getDistance(openMapRealVector31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector20 and openMapRealVector31.", arrayRealVector20.equals(openMapRealVector31) == openMapRealVector31.equals(arrayRealVector20));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapInv();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector16.mapAsinToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector21.mapInv();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapLog();
        double double28 = arrayRealVector21.dotProduct(arrayRealVector25);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector25.mapPowToSelf((double) (-1.0f));
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapLog();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector32.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector32.mapCeil();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector32.mapTanToSelf();
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapLog();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector39.mapUlpToSelf();
        double[] doubleArray43 = arrayRealVector39.toArray();
        arrayRealVector32.data = doubleArray43;
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector25.append(doubleArray43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16, doubleArray43);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector48.mapInv();
        double double51 = arrayRealVector48.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector48.mapExpm1ToSelf();
        double[] doubleArray53 = arrayRealVector48.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray43, doubleArray53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector14.subtract(doubleArray53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector14.", arrayRealVector1.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double double4 = arrayRealVector1.getL1Norm();
        double[] doubleArray5 = arrayRealVector1.data;
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapSubtractToSelf((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(realVector7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, (int) (short) 10);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog10ToSelf();
        double[] doubleArray15 = arrayRealVector13.getDataRef();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapRintToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector13.mapSqrt();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector13.mapExpm1();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapLog();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector20.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector20.mapFloorToSelf();
        double double25 = arrayRealVector13.dotProduct(arrayRealVector20);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector13.mapAsin();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector13.mapSubtractToSelf((double) 0L);
        double[] doubleArray29 = arrayRealVector13.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector11.append(doubleArray29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector8.append(doubleArray29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector8.", arrayRealVector1.equals(openMapRealVector8) == openMapRealVector8.equals(arrayRealVector1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        double[] doubleArray3 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapRintToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector7.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor11 = openMapRealVector7.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double15 = openMapRealVector7.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double[] doubleArray17 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector7.ebeMultiply(doubleArray17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append((double) (-1));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) openMapRealVector20);
        double[] doubleArray22 = arrayRealVector1.getDataRef();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector20 and arrayRealVector21.", openMapRealVector20.equals(arrayRealVector21) == arrayRealVector21.equals(openMapRealVector20));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapFloorToSelf();
        int int6 = arrayRealVector1.getDimension();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        double[] doubleArray10 = arrayRealVector8.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapAtanToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector16.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector20.mapCeil();
        double double22 = openMapRealVector16.getL1Distance(openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector25.mapCeil();
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector25.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector30.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector25.ebeMultiply(realVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector16.append(openMapRealVector32);
        double double34 = openMapRealVector13.getDistance(openMapRealVector32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector13.", arrayRealVector1.equals(openMapRealVector13) == openMapRealVector13.equals(arrayRealVector1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        org.apache.commons.math.linear.RealVector realVector2 = openMapRealVector1.mapTanhToSelf();
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray6, (double) 10.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6, 0, (int) (byte) 0);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapCbrt();
        double double14 = openMapRealVector1.getLInfDistance(realVector13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector12.", openMapRealVector1.equals(arrayRealVector12) == arrayRealVector12.equals(openMapRealVector1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector5.", openMapRealVector4.equals(arrayRealVector5) == arrayRealVector5.equals(openMapRealVector4));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        double double15 = openMapRealVector14.getLInfNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector14.", arrayRealVector1.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        double[] doubleArray4 = arrayRealVector1.getData();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapSignum();
        double double7 = arrayRealVector1.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector1.mapSubtract(1.0d);
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapLog();
        double[] doubleArray14 = arrayRealVector11.getData();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector11.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector1.append(arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector11.mapInvToSelf();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapInv();
        double double23 = arrayRealVector20.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector20.mapExpm1ToSelf();
        double[] doubleArray25 = arrayRealVector20.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray25, (double) (short) 1);
        arrayRealVector11.data = doubleArray25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector27.", arrayRealVector1.equals(openMapRealVector27) == openMapRealVector27.equals(arrayRealVector1));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        double double15 = arrayRealVector8.dotProduct(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector8.mapFloor();
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapRint();
        double double21 = arrayRealVector8.dotProduct(arrayRealVector18);
        double double22 = arrayRealVector8.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6, arrayRealVector8);
        double[] doubleArray24 = arrayRealVector23.getDataRef();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector6 and arrayRealVector23.", openMapRealVector6.equals(arrayRealVector23) == arrayRealVector23.equals(openMapRealVector6));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        double double15 = arrayRealVector8.dotProduct(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector8.mapFloor();
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapRint();
        double double21 = arrayRealVector8.dotProduct(arrayRealVector18);
        double double22 = arrayRealVector8.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6, arrayRealVector8);
        boolean boolean24 = openMapRealVector6.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector6 and arrayRealVector23.", openMapRealVector6.equals(arrayRealVector23) == arrayRealVector23.equals(openMapRealVector6));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (-1.0d));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector7.", openMapRealVector4.equals(arrayRealVector7) == arrayRealVector7.equals(openMapRealVector4));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapCeil();
        double double8 = openMapRealVector2.getL1Distance(openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector11.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector15.mapCeil();
        double double17 = openMapRealVector11.getL1Distance(openMapRealVector15);
        double double18 = openMapRealVector2.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector15.mapSubtract(10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector23.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector27.mapCeil();
        double double29 = openMapRealVector23.getL1Distance(openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector32.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector36.mapCeil();
        double double38 = openMapRealVector32.getL1Distance(openMapRealVector36);
        double double39 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector36.mapSubtract(10.0d);
        double double42 = openMapRealVector15.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        int int43 = openMapRealVector36.getDimension();
        double double44 = openMapRealVector36.getLInfNorm();
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray45);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector46.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector46.mapCeilToSelf();
        double[] doubleArray50 = arrayRealVector46.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray50, (double) 10L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector36.append(doubleArray50);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector46 and openMapRealVector52.", arrayRealVector46.equals(openMapRealVector52) == openMapRealVector52.equals(arrayRealVector46));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        double[] doubleArray4 = arrayRealVector1.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(0, 0.0d);
        boolean boolean8 = arrayRealVector1.equals((java.lang.Object) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector7.", arrayRealVector1.equals(openMapRealVector7) == openMapRealVector7.equals(arrayRealVector1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', 100, (double) (short) 1);
        double double4 = openMapRealVector3.getL1Norm();
        double[] doubleArray5 = openMapRealVector3.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapAsinToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and realVector8.", openMapRealVector3.equals(realVector8) == realVector8.equals(openMapRealVector3));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30, 1.0E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray30, 0, 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector33.", arrayRealVector1.equals(openMapRealVector33) == openMapRealVector33.equals(arrayRealVector1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAsinToSelf();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog();
        double double13 = arrayRealVector6.dotProduct(arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector10.mapPowToSelf((double) (-1.0f));
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector17.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapCeil();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector17.mapTanToSelf();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapLog();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapUlpToSelf();
        double[] doubleArray28 = arrayRealVector24.toArray();
        arrayRealVector17.data = doubleArray28;
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector10.append(doubleArray28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray28);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapInv();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector33.mapLog();
        double[] doubleArray37 = arrayRealVector33.getDataRef();
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapExpToSelf();
        double[] doubleArray41 = arrayRealVector39.getDataRef();
        double double42 = arrayRealVector33.dotProduct(doubleArray41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray41, 1.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28, doubleArray41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector44.", arrayRealVector1.equals(openMapRealVector44) == openMapRealVector44.equals(arrayRealVector1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapCeilToSelf();
        double[] doubleArray5 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5, (double) 10L);
        boolean boolean8 = openMapRealVector7.isInfinite();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector7.", arrayRealVector1.equals(openMapRealVector7) == openMapRealVector7.equals(arrayRealVector1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', 100, (double) (short) 1);
        double double4 = openMapRealVector3.getL1Norm();
        double[] doubleArray5 = openMapRealVector3.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapAtanToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and realVector8.", openMapRealVector3.equals(realVector8) == realVector8.equals(openMapRealVector3));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        boolean boolean4 = arrayRealVector1.isInfinite();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAtan();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector7.mapCeilToSelf();
        double double11 = arrayRealVector1.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector7);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapLog();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector14.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector12, arrayRealVector14);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector12.mapTanh();
        double[] doubleArray20 = arrayRealVector12.toArray();
        double double21 = arrayRealVector1.dotProduct(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        double double23 = openMapRealVector22.getSparcity();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector22.", arrayRealVector1.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapInv();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector33.mapLog();
        double[] doubleArray37 = arrayRealVector33.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33, true);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapLog();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector41.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector41.mapCeil();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector41.mapTanToSelf();
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector48.mapLog();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector48.mapUlpToSelf();
        double[] doubleArray52 = arrayRealVector48.toArray();
        arrayRealVector41.data = doubleArray52;
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray54);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector55.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapInv();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector55.mapLog();
        double[] doubleArray59 = arrayRealVector55.getDataRef();
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapExpToSelf();
        double[] doubleArray63 = arrayRealVector61.getDataRef();
        double double64 = arrayRealVector55.dotProduct(doubleArray63);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, arrayRealVector55);
        double double66 = arrayRealVector33.getLInfDistance(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray69);
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector70.mapSqrtToSelf();
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector73 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray72);
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector73.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector73.mapInv();
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector77 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray76);
        org.apache.commons.math.linear.RealVector realVector78 = arrayRealVector77.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector79 = arrayRealVector77.mapLog();
        org.apache.commons.math.linear.RealVector realVector80 = arrayRealVector77.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector77.mapCeil();
        org.apache.commons.math.linear.RealVector realVector82 = arrayRealVector77.mapTanToSelf();
        double[] doubleArray83 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector84 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray83);
        org.apache.commons.math.linear.RealVector realVector85 = arrayRealVector84.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector86 = arrayRealVector84.mapLog();
        org.apache.commons.math.linear.RealVector realVector87 = arrayRealVector84.mapUlpToSelf();
        double[] doubleArray88 = arrayRealVector84.toArray();
        arrayRealVector77.data = doubleArray88;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector90 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector73, doubleArray88);
        org.apache.commons.math.linear.RealVector realVector91 = arrayRealVector70.projection((org.apache.commons.math.linear.RealVector) arrayRealVector90);
        double[] doubleArray92 = arrayRealVector70.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector93 = openMapRealVector68.append(doubleArray92);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector68.", arrayRealVector1.equals(openMapRealVector68) == openMapRealVector68.equals(arrayRealVector1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        boolean boolean15 = openMapRealVector14.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector14.", arrayRealVector1.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        boolean boolean4 = arrayRealVector1.isInfinite();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAtan();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector7.mapCeilToSelf();
        double double11 = arrayRealVector1.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector7);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapLog();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector14.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector12, arrayRealVector14);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector12.mapTanh();
        double[] doubleArray20 = arrayRealVector12.toArray();
        double double21 = arrayRealVector1.dotProduct(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector1.mapInvToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector23 and openMapRealVector22.", realVector23.equals(openMapRealVector22) == openMapRealVector22.equals(realVector23));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        double[] doubleArray3 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapRintToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector7.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor11 = openMapRealVector7.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double15 = openMapRealVector7.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        double[] doubleArray17 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector7.ebeMultiply(doubleArray17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append((double) (-1));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) openMapRealVector20);
        double[] doubleArray22 = openMapRealVector20.getData();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector20 and arrayRealVector21.", openMapRealVector20.equals(arrayRealVector21) == arrayRealVector21.equals(openMapRealVector20));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector2 = openMapRealVector1.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapTanhToSelf();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog();
        int int8 = arrayRealVector5.getDimension();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector5.mapAsin();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapLog();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector11.mapUlpToSelf();
        double[] doubleArray15 = arrayRealVector11.toArray();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector5.append(doubleArray15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector1.ebeDivide(doubleArray15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector5.", openMapRealVector1.equals(arrayRealVector5) == arrayRealVector5.equals(openMapRealVector1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        int int2 = openMapRealVector1.getDimension();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapLog();
        double[] doubleArray7 = arrayRealVector4.getData();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector4.mapSignum();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(realVector12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapSqrtToSelf();
        boolean boolean16 = arrayRealVector4.equals((java.lang.Object) arrayRealVector13);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector4.mapDivideToSelf((double) (byte) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector1.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector4.", openMapRealVector1.equals(arrayRealVector4) == arrayRealVector4.equals(openMapRealVector1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector2.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor6 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector2.mapPow((double) 10);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapInv();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector10.mapLog();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector10.mapSubtract((double) 1.0f);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector10.mapUlp();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector19.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector23.mapCeil();
        double double25 = openMapRealVector19.getL1Distance(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector28.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector32.mapCeil();
        double double34 = openMapRealVector28.getL1Distance(openMapRealVector32);
        double double35 = openMapRealVector19.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector32.append(doubleArray36);
        double double39 = arrayRealVector10.dotProduct(doubleArray36);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector10.mapPowToSelf(0.0d);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(realVector44);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector45.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = arrayRealVector10.projection(arrayRealVector45);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector10);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray49);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector50.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector50.mapLog();
        double[] doubleArray53 = arrayRealVector50.getData();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector50.mapSqrtToSelf();
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray55);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector56.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector56, false);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapLog10();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector60.mapCeil();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector50, arrayRealVector60);
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector60.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector60.mapMultiplyToSelf(0.0d);
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector60.mapPowToSelf((double) 'a');
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray69);
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector70.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector70.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector74 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector70, false);
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector70.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector77 = arrayRealVector70.mapMultiply(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector78 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector60, arrayRealVector70);
        org.apache.commons.math.linear.RealVector realVector79 = arrayRealVector70.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector80 = arrayRealVector10.projection(arrayRealVector70);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector48.", openMapRealVector2.equals(arrayRealVector48) == arrayRealVector48.equals(openMapRealVector2));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapCeilToSelf();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog();
        double double13 = arrayRealVector6.dotProduct(arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector10.mapPowToSelf((double) (-1.0f));
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector17.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapCeil();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector17.mapTanToSelf();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapLog();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapUlpToSelf();
        double[] doubleArray28 = arrayRealVector24.toArray();
        arrayRealVector17.data = doubleArray28;
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector10.append(doubleArray28);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapInv();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector32.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28, arrayRealVector32);
        double double37 = arrayRealVector1.dotProduct(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector1.mapLog10ToSelf();
        double[] doubleArray39 = arrayRealVector1.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector42.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector42.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double50 = openMapRealVector42.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        double[] doubleArray52 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector42.ebeMultiply(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray39, doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray52, (double) 100.0f);
        double double59 = openMapRealVector58.getL1Norm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector54 and openMapRealVector58.", arrayRealVector54.equals(openMapRealVector58) == openMapRealVector58.equals(arrayRealVector54));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector3.mapCeilToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        double double15 = arrayRealVector8.dotProduct(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector12.mapPowToSelf((double) (-1.0f));
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector19.mapLog();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector19.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector19.mapCeil();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector19.mapTanToSelf();
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray25);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapLog();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector26.mapUlpToSelf();
        double[] doubleArray30 = arrayRealVector26.toArray();
        arrayRealVector19.data = doubleArray30;
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector12.append(doubleArray30);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector34.mapInv();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector34.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray30, arrayRealVector34);
        double double39 = arrayRealVector3.dotProduct(doubleArray30);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector3.mapLog10ToSelf();
        double[] doubleArray41 = arrayRealVector3.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector44.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor48 = openMapRealVector44.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double52 = openMapRealVector44.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector51);
        double[] doubleArray54 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector44.ebeMultiply(doubleArray54);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray41, doubleArray54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector1.subtract(doubleArray41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector3.", openMapRealVector1.equals(arrayRealVector3) == arrayRealVector3.equals(openMapRealVector1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapCeilToSelf();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog();
        double double13 = arrayRealVector6.dotProduct(arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector10.mapPowToSelf((double) (-1.0f));
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector17.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapCeil();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector17.mapTanToSelf();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapLog();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapUlpToSelf();
        double[] doubleArray28 = arrayRealVector24.toArray();
        arrayRealVector17.data = doubleArray28;
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector10.append(doubleArray28);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapInv();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector32.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28, arrayRealVector32);
        double double37 = arrayRealVector1.dotProduct(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector1.mapLog10ToSelf();
        double[] doubleArray39 = arrayRealVector1.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector42.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector42.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double50 = openMapRealVector42.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        double[] doubleArray52 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector42.ebeMultiply(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray39, doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray52, (double) 100.0f);
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector60.mapInv();
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray63);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector64.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector64.mapLog();
        double double67 = arrayRealVector60.dotProduct(arrayRealVector64);
        org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector64.mapPowToSelf((double) (-1.0f));
        double double70 = arrayRealVector64.getNorm();
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector64.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, arrayRealVector64);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector54 and openMapRealVector58.", arrayRealVector54.equals(openMapRealVector58) == openMapRealVector58.equals(arrayRealVector54));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        double[] doubleArray5 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, true);
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapLog();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector9.mapCeil();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector9.mapTanToSelf();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapLog();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector16.mapUlpToSelf();
        double[] doubleArray20 = arrayRealVector16.toArray();
        arrayRealVector9.data = doubleArray20;
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapInv();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector23.mapLog();
        double[] doubleArray27 = arrayRealVector23.getDataRef();
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapExpToSelf();
        double[] doubleArray31 = arrayRealVector29.getDataRef();
        double double32 = arrayRealVector23.dotProduct(doubleArray31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20, arrayRealVector23);
        double double34 = arrayRealVector1.getLInfDistance(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray36);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector37.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapLog();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector37.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector37.mapFloorToSelf();
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector43.mapLog();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector43.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector43.mapSinh();
        double double48 = arrayRealVector37.dotProduct(arrayRealVector43);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector37.mapRintToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector37.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector1.append((org.apache.commons.math.linear.RealVector) arrayRealVector37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector35.", arrayRealVector1.equals(openMapRealVector35) == openMapRealVector35.equals(arrayRealVector1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, false);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog10();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog1pToSelf();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.mapLog();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector9.mapUlp();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector9.mapAsinToSelf();
        double double15 = arrayRealVector5.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector9);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector5.mapAdd((double) 0);
        double[] doubleArray18 = arrayRealVector5.data;
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapCoshToSelf();
        boolean boolean23 = arrayRealVector20.isInfinite();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector20.mapAtan();
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray25);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector26.mapCeilToSelf();
        double double30 = arrayRealVector20.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector26);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector26.mapSinToSelf();
        double[] doubleArray32 = arrayRealVector26.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18, doubleArray32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector34.", arrayRealVector1.equals(openMapRealVector34) == openMapRealVector34.equals(arrayRealVector1));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (-1.0d));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3, (int) (short) 0, (int) (byte) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3, (-1), 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector10.", openMapRealVector4.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector4));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapSubtract((double) 1.0f);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12);
        arrayRealVector1.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector1.mapCeilToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector16 and openMapRealVector15.", realVector16.equals(openMapRealVector15) == openMapRealVector15.equals(realVector16));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapUlp();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector10.mapExpm1();
        boolean boolean12 = openMapRealVector10.isInfinite();
        boolean boolean13 = arrayRealVector1.equals((java.lang.Object) boolean12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector10.", arrayRealVector1.equals(openMapRealVector10) == openMapRealVector10.equals(arrayRealVector1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapSubtract((double) 1.0f);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12);
        arrayRealVector1.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector17.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapFloorToSelf();
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapLog();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector23.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector23.mapSinh();
        double double28 = arrayRealVector17.dotProduct(arrayRealVector23);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray29);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapExpToSelf();
        double[] doubleArray32 = arrayRealVector30.getDataRef();
        double double33 = arrayRealVector23.dotProduct(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector23.mapAsin();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector23.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector23.mapDivideToSelf(10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector15.append(realVector37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3, 0, (int) (byte) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector10.", openMapRealVector4.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector4));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        int int4 = arrayRealVector1.getDimension();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.append(1.0d);
        double[] doubleArray7 = arrayRealVector1.data;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapLog();
        double[] doubleArray12 = arrayRealVector9.getData();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector9.mapSqrtToSelf();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector15, false);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog10();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector19.mapCeil();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector9, arrayRealVector19);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector9.mapSinToSelf();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapLog();
        double[] doubleArray28 = arrayRealVector25.getData();
        double double29 = arrayRealVector25.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector25.mapAdd(100.0d);
        double double32 = arrayRealVector25.getL1Norm();
        double double33 = arrayRealVector25.getLInfNorm();
        arrayRealVector9.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector25);
        double[] doubleArray35 = arrayRealVector9.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray35, 0.1d);
        double double38 = arrayRealVector1.getDistance(doubleArray35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector37.", arrayRealVector1.equals(openMapRealVector37) == openMapRealVector37.equals(arrayRealVector1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapInv();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapLog();
        double double23 = arrayRealVector16.dotProduct(arrayRealVector20);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector16.mapFloor();
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray25);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector26, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector30);
        double double32 = arrayRealVector16.dotProduct(arrayRealVector31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector16.mapCoshToSelf();
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray34);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector35.mapLog();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector35.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector35.mapCeil();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector35.mapTanToSelf();
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray41);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapLog();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector42.mapUlpToSelf();
        double[] doubleArray46 = arrayRealVector42.toArray();
        arrayRealVector35.data = doubleArray46;
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray48);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector49.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector49.mapInv();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector49.mapLog();
        double[] doubleArray53 = arrayRealVector49.getDataRef();
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray54);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector55.mapExpToSelf();
        double[] doubleArray57 = arrayRealVector55.getDataRef();
        double double58 = arrayRealVector49.dotProduct(doubleArray57);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46, arrayRealVector49);
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector61.mapLog();
        double[] doubleArray64 = arrayRealVector61.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46, doubleArray64);
        double double66 = arrayRealVector16.getLInfDistance(doubleArray64);
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector68 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray67);
        org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector68.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector68.mapLog();
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector68.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector68.mapDivideToSelf((double) (-1L));
        double double74 = arrayRealVector68.getLInfNorm();
        double[] doubleArray75 = arrayRealVector68.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector76 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray64, doubleArray75);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector77 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray64);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector14.", arrayRealVector1.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog();
        double double8 = arrayRealVector1.dotProduct(arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector5.mapPowToSelf((double) (-1.0f));
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector12.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector12.mapCeil();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector12.mapTanToSelf();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector19.mapLog();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector19.mapUlpToSelf();
        double[] doubleArray23 = arrayRealVector19.toArray();
        arrayRealVector12.data = doubleArray23;
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector5.append(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector5.mapUlp();
        double[] doubleArray27 = arrayRealVector5.data;
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapLog10ToSelf();
        double[] doubleArray31 = arrayRealVector29.getDataRef();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector29.mapRintToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector29.mapSinToSelf();
        arrayRealVector29.set((double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector29.mapSignumToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector29.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = arrayRealVector5.projection(arrayRealVector29);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray39);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector40.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector40.mapLog();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector40.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector40.mapDivideToSelf((double) (-1L));
        double double46 = arrayRealVector40.getLInfNorm();
        double[] doubleArray47 = arrayRealVector40.getDataRef();
        double double48 = arrayRealVector29.getDistance(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector29.mapCeilToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector29.mapSqrtToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(0, (int) (short) 10);
        double double54 = arrayRealVector29.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector53.", arrayRealVector1.equals(openMapRealVector53) == openMapRealVector53.equals(arrayRealVector1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapFloorToSelf();
        int int6 = arrayRealVector1.getDimension();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        double[] doubleArray10 = arrayRealVector8.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapInv();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapMultiplyToSelf((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector11);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapCoshToSelf();
        boolean boolean21 = arrayRealVector18.isInfinite();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector18.mapAtan();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapCeilToSelf();
        double double28 = arrayRealVector18.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector24);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector24.mapSinToSelf();
        double[] doubleArray30 = arrayRealVector24.getDataRef();
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapLog();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector32.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector32.mapCeil();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector32.mapTanToSelf();
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapLog();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector39.mapUlpToSelf();
        double[] doubleArray43 = arrayRealVector39.toArray();
        arrayRealVector32.data = doubleArray43;
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray45);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector46.mapInv();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector46.mapLog();
        double[] doubleArray50 = arrayRealVector46.getDataRef();
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray51);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapExpToSelf();
        double[] doubleArray54 = arrayRealVector52.getDataRef();
        double double55 = arrayRealVector46.dotProduct(doubleArray54);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray43, arrayRealVector46);
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray57);
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector58.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector58.mapCoshToSelf();
        boolean boolean61 = arrayRealVector58.isInfinite();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector58.mapAtan();
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray63);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector64.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector64.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector64.mapCeilToSelf();
        double double68 = arrayRealVector58.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector64);
        org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector64.mapSinToSelf();
        double[] doubleArray70 = arrayRealVector64.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray43, doubleArray70);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray30, doubleArray70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector16.ebeDivide(doubleArray70);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector16.", arrayRealVector1.equals(openMapRealVector16) == openMapRealVector16.equals(arrayRealVector1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapUlp();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor6 = arrayRealVector1.iterator();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapSqrtToSelf();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapLog();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector9.mapCeil();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector9.mapTanToSelf();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapLog();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector16.mapUlpToSelf();
        double[] doubleArray20 = arrayRealVector16.toArray();
        arrayRealVector9.data = doubleArray20;
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapInv();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector23.mapLog();
        double[] doubleArray27 = arrayRealVector23.getDataRef();
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapExpToSelf();
        double[] doubleArray31 = arrayRealVector29.getDataRef();
        double double32 = arrayRealVector23.dotProduct(doubleArray31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20, arrayRealVector23);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray34);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector35.mapLog();
        double[] doubleArray38 = arrayRealVector35.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20, doubleArray38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector1.append(doubleArray38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector41.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector41.", arrayRealVector1.equals(openMapRealVector41) == openMapRealVector41.equals(arrayRealVector1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapSubtract((double) 1.0f);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector12);
        arrayRealVector1.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        boolean boolean17 = openMapRealVector15.isDefaultValue((double) 'a');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) '#');
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.mapLog();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector3.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector3.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector3.mapRintToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector3.mapCosh();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector1, arrayRealVector3);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector12.mapLog();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector3.append((org.apache.commons.math.linear.RealVector) arrayRealVector12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector10.", openMapRealVector1.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        boolean boolean4 = arrayRealVector1.isInfinite();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCosToSelf();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector7.mapCeilToSelf();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapInv();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapLog();
        double double19 = arrayRealVector12.dotProduct(arrayRealVector16);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector16.mapPowToSelf((double) (-1.0f));
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapLog();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector23.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector23.mapCeil();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector23.mapTanToSelf();
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray29);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector30.mapLog();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector30.mapUlpToSelf();
        double[] doubleArray34 = arrayRealVector30.toArray();
        arrayRealVector23.data = doubleArray34;
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector16.append(doubleArray34);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray37);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector38.mapInv();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector38.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray34, arrayRealVector38);
        double double43 = arrayRealVector7.dotProduct(doubleArray34);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector7.mapLog10ToSelf();
        double[] doubleArray45 = arrayRealVector7.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector48.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor52 = openMapRealVector48.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double56 = openMapRealVector48.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector55);
        double[] doubleArray58 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector48.ebeMultiply(doubleArray58);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray45, doubleArray58);
        double double61 = arrayRealVector1.getDistance(doubleArray45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray45);
        int int63 = openMapRealVector62.getDimension();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector62.", arrayRealVector1.equals(openMapRealVector62) == openMapRealVector62.equals(arrayRealVector1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        boolean boolean3 = openMapRealVector1.isDefaultValue(1.1272402434588757d);
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray7);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray7, (double) 10.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7, 0, (int) (byte) 0);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapSubtractToSelf(1.0E-12d);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector13.mapPow((double) 10.0f);
        double double19 = openMapRealVector1.getDistance(realVector18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector13.", openMapRealVector1.equals(arrayRealVector13) == arrayRealVector13.equals(openMapRealVector1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAsinToSelf();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog();
        double double13 = arrayRealVector6.dotProduct(arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector10.mapPowToSelf((double) (-1.0f));
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector17.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapCeil();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector17.mapTanToSelf();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapLog();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapUlpToSelf();
        double[] doubleArray28 = arrayRealVector24.toArray();
        arrayRealVector17.data = doubleArray28;
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector10.append(doubleArray28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray28);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapInv();
        double double36 = arrayRealVector33.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector33.mapExpm1ToSelf();
        double[] doubleArray38 = arrayRealVector33.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28, doubleArray38);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapInv();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray44);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector45.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector45.mapLog();
        double double48 = arrayRealVector41.dotProduct(arrayRealVector45);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector45.mapCoshToSelf();
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray50);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector51.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapLog();
        int int54 = arrayRealVector51.getDimension();
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector51.mapAsin();
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray56);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector57.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector57.mapLog();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector57.mapUlpToSelf();
        double[] doubleArray61 = arrayRealVector57.toArray();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector51.append(doubleArray61);
        double double63 = arrayRealVector45.getL1Distance(doubleArray61);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38, doubleArray61);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray61);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray61);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector65.", arrayRealVector1.equals(openMapRealVector65) == openMapRealVector65.equals(arrayRealVector1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (-1.0d));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) (byte) -1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector8.", openMapRealVector4.equals(arrayRealVector8) == arrayRealVector8.equals(openMapRealVector4));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        double[] doubleArray4 = arrayRealVector1.getData();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapLog();
        double[] doubleArray10 = arrayRealVector6.getDataRef();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector6.mapUlpToSelf();
        double double12 = arrayRealVector1.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector6);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapLog();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector14.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector14.mapFloorToSelf();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapLog();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector20.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector20.mapSinh();
        double double25 = arrayRealVector14.dotProduct(arrayRealVector20);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(realVector28);
        double[] doubleArray30 = arrayRealVector29.getData();
        double double31 = arrayRealVector20.dotProduct(doubleArray30);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray30);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapAdd((double) (byte) 0);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector32.mapMultiplyToSelf((double) (-1.0f));
        double double37 = arrayRealVector32.getNorm();
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapInv();
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector43.mapLog();
        double double46 = arrayRealVector39.dotProduct(arrayRealVector43);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector43.mapPowToSelf((double) (-1.0f));
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray49);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector50.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector50.mapLog();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector50.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector50.mapCeil();
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector50.mapTanToSelf();
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray56);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector57.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector57.mapLog();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector57.mapUlpToSelf();
        double[] doubleArray61 = arrayRealVector57.toArray();
        arrayRealVector50.data = doubleArray61;
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector43.append(doubleArray61);
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray64);
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector65.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector65.mapInv();
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector65.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector69 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray61, arrayRealVector65);
        org.apache.commons.math.linear.AbstractRealVector abstractRealVector70 = arrayRealVector65.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector32, arrayRealVector65);
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector73 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray72);
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector73.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector73.mapLog();
        double[] doubleArray76 = arrayRealVector73.getData();
        org.apache.commons.math.linear.RealVector realVector78 = arrayRealVector73.mapPow((double) 1.0f);
        org.apache.commons.math.linear.RealVector realVector79 = arrayRealVector73.mapAcosToSelf();
        double double80 = arrayRealVector65.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector73);
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector82 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray81);
        org.apache.commons.math.linear.RealVector realVector83 = arrayRealVector82.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector84 = new org.apache.commons.math.linear.ArrayRealVector(realVector83);
        double[] doubleArray85 = arrayRealVector84.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray85, (double) '4');
        org.apache.commons.math.linear.RealVector realVector88 = arrayRealVector73.append(doubleArray85);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector87.", arrayRealVector1.equals(openMapRealVector87) == openMapRealVector87.equals(arrayRealVector1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30, 1.0E-12d);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector33.mapExpToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and realVector34.", arrayRealVector1.equals(realVector34) == realVector34.equals(arrayRealVector1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpm1();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector5.", openMapRealVector4.equals(arrayRealVector5) == arrayRealVector5.equals(openMapRealVector4));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapCeil();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapTanToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapUlpToSelf();
        double[] doubleArray12 = arrayRealVector8.toArray();
        arrayRealVector1.data = doubleArray12;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapLog();
        double[] doubleArray19 = arrayRealVector15.getDataRef();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        double[] doubleArray23 = arrayRealVector21.getDataRef();
        double double24 = arrayRealVector15.dotProduct(doubleArray23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector15);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapLog();
        double[] doubleArray30 = arrayRealVector27.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapInv();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector33.mapLog();
        double[] doubleArray37 = arrayRealVector33.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33, true);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapLog();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector41.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector41.mapCeil();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector41.mapTanToSelf();
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector48.mapLog();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector48.mapUlpToSelf();
        double[] doubleArray52 = arrayRealVector48.toArray();
        arrayRealVector41.data = doubleArray52;
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray54);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector55.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapInv();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector55.mapLog();
        double[] doubleArray59 = arrayRealVector55.getDataRef();
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapExpToSelf();
        double[] doubleArray63 = arrayRealVector61.getDataRef();
        double double64 = arrayRealVector55.dotProduct(doubleArray63);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, arrayRealVector55);
        double double66 = arrayRealVector33.getLInfDistance(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, arrayRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        org.apache.commons.math.linear.RealVector realVector69 = openMapRealVector68.mapAtanToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and realVector69.", arrayRealVector1.equals(realVector69) == realVector69.equals(arrayRealVector1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(0, (-1.0d));
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapTanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapLog();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector4, arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector4.mapTanh();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector4.mapTanh();
        double[] doubleArray13 = arrayRealVector4.data;
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapExpToSelf();
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapInv();
        double double21 = arrayRealVector18.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector18.mapExpm1ToSelf();
        double[] doubleArray23 = arrayRealVector18.getData();
        double double24 = arrayRealVector15.getDistance(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector4.append(doubleArray23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector2.projection(doubleArray23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector4.", openMapRealVector2.equals(arrayRealVector4) == arrayRealVector4.equals(openMapRealVector2));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (-1.0d));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3, (int) (short) 0, (int) (byte) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.unitVector();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector10.", openMapRealVector4.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector4));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapSubtractToSelf((double) (short) 1);
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapInv();
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapLog();
        double double12 = arrayRealVector5.dotProduct(arrayRealVector9);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector5.mapFloor();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapRint();
        double double18 = arrayRealVector5.dotProduct(arrayRealVector15);
        double double19 = arrayRealVector5.getNorm();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector5.mapRintToSelf();
        boolean boolean21 = arrayRealVector5.isInfinite();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector5.mapSinhToSelf();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(realVector25);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapInv();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector26.mapDivideToSelf((double) (byte) 1);
        arrayRealVector5.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector26);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector5.mapAcosToSelf();
        double double33 = openMapRealVector1.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector5);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector5.", openMapRealVector1.equals(arrayRealVector5) == arrayRealVector5.equals(openMapRealVector1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        boolean boolean4 = arrayRealVector1.isInfinite();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAtan();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector7.mapCeilToSelf();
        double double11 = arrayRealVector1.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector7.mapSinToSelf();
        double[] doubleArray13 = arrayRealVector7.getDataRef();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapLog();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapCeil();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector15.mapTanToSelf();
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector22.mapLog();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector22.mapUlpToSelf();
        double[] doubleArray26 = arrayRealVector22.toArray();
        arrayRealVector15.data = doubleArray26;
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapInv();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector29.mapLog();
        double[] doubleArray33 = arrayRealVector29.getDataRef();
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray34);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapExpToSelf();
        double[] doubleArray37 = arrayRealVector35.getDataRef();
        double double38 = arrayRealVector29.dotProduct(doubleArray37);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26, arrayRealVector29);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapCoshToSelf();
        boolean boolean44 = arrayRealVector41.isInfinite();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector41.mapAtan();
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector47.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector47.mapCeilToSelf();
        double double51 = arrayRealVector41.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector47);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector47.mapSinToSelf();
        double[] doubleArray53 = arrayRealVector47.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26, doubleArray53);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13, doubleArray53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray53);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray53, 3.365883939231586d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector56.", arrayRealVector1.equals(openMapRealVector56) == openMapRealVector56.equals(arrayRealVector1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double double4 = arrayRealVector1.getL1Norm();
        double[] doubleArray5 = arrayRealVector1.data;
        boolean boolean6 = arrayRealVector1.isNaN();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector1.mapExpm1ToSelf();
        boolean boolean9 = arrayRealVector1.isNaN();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', 100, (double) (short) 1);
        double double14 = openMapRealVector13.getL1Norm();
        double[] doubleArray15 = openMapRealVector13.getData();
        arrayRealVector1.data = doubleArray15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector13.", arrayRealVector1.equals(openMapRealVector13) == openMapRealVector13.equals(arrayRealVector1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapFloorToSelf();
        int int6 = arrayRealVector1.getDimension();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        double[] doubleArray10 = arrayRealVector8.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapAtanToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector13.mapUlpToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and realVector14.", arrayRealVector1.equals(realVector14) == realVector14.equals(arrayRealVector1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapFloorToSelf();
        int int6 = arrayRealVector1.getDimension();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        double[] doubleArray10 = arrayRealVector8.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapInv();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapMultiplyToSelf((double) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector11.append((double) (byte) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector16.", arrayRealVector1.equals(openMapRealVector16) == openMapRealVector16.equals(arrayRealVector1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(realVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapSubtract(0.0d);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapSqrtToSelf();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapLog();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector11.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapFloorToSelf();
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector17.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapSinh();
        double double22 = arrayRealVector11.dotProduct(arrayRealVector17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6, arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector6.mapCbrt();
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray25);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector26.mapLog();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector26.mapUlp();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = arrayRealVector26.iterator();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector26.mapSqrtToSelf();
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector34.mapLog();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector34.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector34.mapCeil();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector34.mapTanToSelf();
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapLog();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector41.mapUlpToSelf();
        double[] doubleArray45 = arrayRealVector41.toArray();
        arrayRealVector34.data = doubleArray45;
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector48.mapInv();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector48.mapLog();
        double[] doubleArray52 = arrayRealVector48.getDataRef();
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray53);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapExpToSelf();
        double[] doubleArray56 = arrayRealVector54.getDataRef();
        double double57 = arrayRealVector48.dotProduct(doubleArray56);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray45, arrayRealVector48);
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector60.mapLog();
        double[] doubleArray63 = arrayRealVector60.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray45, doubleArray63);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector26.append(doubleArray63);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector26);
        double double67 = arrayRealVector6.getL1Distance((org.apache.commons.math.linear.RealVector) arrayRealVector26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector66.", arrayRealVector1.equals(openMapRealVector66) == openMapRealVector66.equals(arrayRealVector1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        boolean boolean4 = arrayRealVector1.isInfinite();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAtan();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector7.mapCeilToSelf();
        double double11 = arrayRealVector1.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector7);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector();
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapLog();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector14.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector12, arrayRealVector14);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector12.mapTanh();
        double[] doubleArray20 = arrayRealVector12.toArray();
        double double21 = arrayRealVector1.dotProduct(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector1.mapDivideToSelf(0.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector24 and openMapRealVector22.", realVector24.equals(openMapRealVector22) == openMapRealVector22.equals(realVector24));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        double[] doubleArray11 = arrayRealVector8.getData();
        double double12 = arrayRealVector5.dotProduct(doubleArray11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector5.mapLog1pToSelf();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapLog();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector16.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector16.mapCeil();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector16.mapTanToSelf();
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapLog();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector23.mapUlpToSelf();
        double[] doubleArray27 = arrayRealVector23.toArray();
        arrayRealVector16.data = doubleArray27;
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray29);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector30.mapInv();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector30.mapLog();
        double[] doubleArray34 = arrayRealVector30.getDataRef();
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray35);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapExpToSelf();
        double[] doubleArray38 = arrayRealVector36.getDataRef();
        double double39 = arrayRealVector30.dotProduct(doubleArray38);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray27, arrayRealVector30);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray41);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapLog();
        double[] doubleArray45 = arrayRealVector42.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray27, doubleArray45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray45, 1.0E-12d);
        double double49 = arrayRealVector5.getDistance(doubleArray45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector48.", arrayRealVector1.equals(openMapRealVector48) == openMapRealVector48.equals(arrayRealVector1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapCeilToSelf();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector6.mapInv();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog();
        double double13 = arrayRealVector6.dotProduct(arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector10.mapPowToSelf((double) (-1.0f));
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector17.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapCeil();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector17.mapTanToSelf();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapLog();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapUlpToSelf();
        double[] doubleArray28 = arrayRealVector24.toArray();
        arrayRealVector17.data = doubleArray28;
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector10.append(doubleArray28);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapInv();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector32.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28, arrayRealVector32);
        double double37 = arrayRealVector1.dotProduct(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector1.mapLog10ToSelf();
        double[] doubleArray39 = arrayRealVector1.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector42.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor46 = openMapRealVector42.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double50 = openMapRealVector42.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector49);
        double[] doubleArray52 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector42.ebeMultiply(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray39, doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray52, (double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector58, (-1));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector54 and openMapRealVector58.", arrayRealVector54.equals(openMapRealVector58) == openMapRealVector58.equals(arrayRealVector54));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapRint();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapCosToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAcosToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapPowToSelf(0.0d);
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapLog();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector9.mapFloorToSelf();
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapLog();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapSinh();
        double double20 = arrayRealVector9.dotProduct(arrayRealVector15);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(realVector23);
        double[] doubleArray25 = arrayRealVector24.getData();
        double double26 = arrayRealVector15.dotProduct(doubleArray25);
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray27);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector28.mapInv();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector28.mapLog();
        double[] doubleArray32 = arrayRealVector28.getDataRef();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector28.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector28.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray25, arrayRealVector28);
        double double36 = arrayRealVector1.dotProduct(doubleArray25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray25);
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector37.mapSin();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector37.", arrayRealVector1.equals(openMapRealVector37) == openMapRealVector37.equals(arrayRealVector1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapCeil();
        double double8 = openMapRealVector2.getL1Distance(openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector11.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector15.mapCeil();
        double double17 = openMapRealVector11.getL1Distance(openMapRealVector15);
        double double18 = openMapRealVector2.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector15.mapSubtract(10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector23.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector27.mapCeil();
        double double29 = openMapRealVector23.getL1Distance(openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector32.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector36.mapCeil();
        double double38 = openMapRealVector32.getL1Distance(openMapRealVector36);
        double double39 = openMapRealVector23.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector36.mapSubtract(10.0d);
        double double42 = openMapRealVector15.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        int int43 = openMapRealVector36.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector36, (int) (short) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector48.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector52.mapCeil();
        double double54 = openMapRealVector48.getL1Distance(openMapRealVector52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector57.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector62 = openMapRealVector61.mapCeil();
        double double63 = openMapRealVector57.getL1Distance(openMapRealVector61);
        double double64 = openMapRealVector48.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector61);
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray65);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector61.append(doubleArray65);
        org.apache.commons.math.linear.RealVector realVector68 = openMapRealVector67.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector67.mapAdd((double) 0L);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector70.mapCoshToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector75 = openMapRealVector74.mapCeil();
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector74.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector79.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector74.ebeMultiply(realVector80);
        boolean boolean83 = openMapRealVector74.isDefaultValue((double) (short) 100);
        double double84 = openMapRealVector70.getL1Distance(openMapRealVector74);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector45.append(openMapRealVector70);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector45 and arrayRealVector66.", openMapRealVector45.equals(arrayRealVector66) == arrayRealVector66.equals(openMapRealVector45));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapCeil();
        double double8 = openMapRealVector2.getL1Distance(openMapRealVector6);
        double double9 = openMapRealVector2.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector2.mapSqrtToSelf();
        openMapRealVector2.set((double) '4');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2, (int) (byte) 1);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapLog();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector16.mapAtanToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapExpToSelf();
        int int23 = arrayRealVector21.getDimension();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector21.mapCeilToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16, realVector24);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapInv();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector27.mapLog();
        double[] doubleArray31 = arrayRealVector27.getDataRef();
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapExpToSelf();
        double[] doubleArray35 = arrayRealVector33.getDataRef();
        double double36 = arrayRealVector27.dotProduct(doubleArray35);
        double double37 = arrayRealVector25.dotProduct(doubleArray35);
        java.lang.String str38 = arrayRealVector25.toString();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector25.mapAddToSelf((double) (-1L));
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector25.mapAcosToSelf();
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector43.mapInv();
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector47.mapLog();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector47.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector47.mapCeil();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector47.mapTanToSelf();
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray53);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector54.mapLog();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector54.mapUlpToSelf();
        double[] doubleArray58 = arrayRealVector54.toArray();
        arrayRealVector47.data = doubleArray58;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector43, doubleArray58);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapLogToSelf();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector60.mapExpm1ToSelf();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector60.mapCeilToSelf();
        double[] doubleArray64 = arrayRealVector60.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(realVector41, arrayRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector14.subtract(realVector41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector14 and arrayRealVector16.", openMapRealVector14.equals(arrayRealVector16) == arrayRealVector16.equals(openMapRealVector14));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector2.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor6 = openMapRealVector2.iterator();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector2.mapPow((double) 10);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray9);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapInv();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector10.mapLog();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector10.mapSubtract((double) 1.0f);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector10.mapUlp();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector19.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector23.mapCeil();
        double double25 = openMapRealVector19.getL1Distance(openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector28.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector32.mapCeil();
        double double34 = openMapRealVector28.getL1Distance(openMapRealVector32);
        double double35 = openMapRealVector19.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector32.append(doubleArray36);
        double double39 = arrayRealVector10.dotProduct(doubleArray36);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector10.mapPowToSelf(0.0d);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(realVector44);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector45.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = arrayRealVector10.projection(arrayRealVector45);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector10);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray49);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector50.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector50.mapInv();
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray53);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector54.mapLog();
        double double57 = arrayRealVector50.dotProduct(arrayRealVector54);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector50.mapFloor();
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray59);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector60.mapRint();
        double double63 = arrayRealVector50.dotProduct(arrayRealVector60);
        double double64 = arrayRealVector50.getNorm();
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector50.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector50.mapSqrt();
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector68 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray67);
        org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector68.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector68.mapLog();
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector68.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector68.mapFloorToSelf();
        int int73 = arrayRealVector68.getDimension();
        double[] doubleArray74 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray74);
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector75.mapExpToSelf();
        double[] doubleArray77 = arrayRealVector75.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector78 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector68, doubleArray77);
        org.apache.commons.math.linear.RealVector realVector79 = arrayRealVector78.mapFloorToSelf();
        org.apache.commons.math.linear.RealVector realVector80 = arrayRealVector78.mapTanhToSelf();
        double double81 = arrayRealVector78.getNorm();
        double double82 = arrayRealVector50.getL1Distance((org.apache.commons.math.linear.RealVector) arrayRealVector78);
        double[] doubleArray83 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector84 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray83);
        org.apache.commons.math.linear.RealVector realVector85 = arrayRealVector84.mapExpToSelf();
        double[] doubleArray86 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector87 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray86);
        org.apache.commons.math.linear.RealVector realVector88 = arrayRealVector87.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector89 = arrayRealVector87.mapInv();
        double double90 = arrayRealVector87.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector91 = arrayRealVector87.mapExpm1ToSelf();
        double[] doubleArray92 = arrayRealVector87.getData();
        double double93 = arrayRealVector84.getDistance(doubleArray92);
        double double94 = arrayRealVector78.getL1Distance(doubleArray92);
        double double95 = arrayRealVector10.getL1Distance(doubleArray92);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector48.", openMapRealVector2.equals(arrayRealVector48) == arrayRealVector48.equals(openMapRealVector2));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector4.mapInv();
        double double7 = arrayRealVector4.getL1Norm();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapExpm1ToSelf();
        double[] doubleArray9 = arrayRealVector4.getData();
        double double10 = arrayRealVector1.getDistance(doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector12.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector12.mapCeil();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector12.mapTanToSelf();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector19.mapLog();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector19.mapUlpToSelf();
        double[] doubleArray23 = arrayRealVector19.toArray();
        arrayRealVector12.data = doubleArray23;
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray25);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapInv();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector26.mapLog();
        double[] doubleArray30 = arrayRealVector26.getDataRef();
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapExpToSelf();
        double[] doubleArray34 = arrayRealVector32.getDataRef();
        double double35 = arrayRealVector26.dotProduct(doubleArray34);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23, arrayRealVector26);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray37);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector38.mapLog();
        double[] doubleArray41 = arrayRealVector38.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23, doubleArray41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray41, 1.0E-12d);
        arrayRealVector1.data = doubleArray41;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector44.", arrayRealVector1.equals(openMapRealVector44) == openMapRealVector44.equals(arrayRealVector1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector(0);
        org.apache.commons.math.linear.RealVector realVector2 = openMapRealVector1.mapExp();
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapExpm1();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector1.mapAddToSelf((double) (-1));
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapLog();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector7.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapCeil();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector7.mapTanToSelf();
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray13);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapLog();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector14.mapUlpToSelf();
        double[] doubleArray18 = arrayRealVector14.toArray();
        arrayRealVector7.data = doubleArray18;
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector21.mapInv();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector21.mapLog();
        double[] doubleArray25 = arrayRealVector21.getDataRef();
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapExpToSelf();
        double[] doubleArray29 = arrayRealVector27.getDataRef();
        double double30 = arrayRealVector21.dotProduct(doubleArray29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18, arrayRealVector21);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapLog();
        double[] doubleArray36 = arrayRealVector33.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapInv();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector39.mapLog();
        double[] doubleArray43 = arrayRealVector39.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector39, true);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector47.mapLog();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector47.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector47.mapCeil();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector47.mapTanToSelf();
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray53);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector54.mapLog();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector54.mapUlpToSelf();
        double[] doubleArray58 = arrayRealVector54.toArray();
        arrayRealVector47.data = doubleArray58;
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector61.mapInv();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector61.mapLog();
        double[] doubleArray65 = arrayRealVector61.getDataRef();
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray66);
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector67.mapExpToSelf();
        double[] doubleArray69 = arrayRealVector67.getDataRef();
        double double70 = arrayRealVector61.dotProduct(doubleArray69);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray58, arrayRealVector61);
        double double72 = arrayRealVector39.getLInfDistance(doubleArray58);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector73 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18, arrayRealVector39);
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector39.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector39);
        java.lang.Double[] doubleArray79 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (-1.0d));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) (byte) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79, (double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray79);
        boolean boolean88 = arrayRealVector39.equals((java.lang.Object) openMapRealVector87);
        double[] doubleArray89 = openMapRealVector87.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector5.append(doubleArray89);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector7.", openMapRealVector5.equals(arrayRealVector7) == arrayRealVector7.equals(openMapRealVector5));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog();
        double double8 = arrayRealVector1.dotProduct(arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector1.mapFloor();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector11, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector15);
        double double17 = arrayRealVector1.dotProduct(arrayRealVector16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapSqrtToSelf();
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector22.mapInv();
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray25);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapLog();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector26.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector26.mapCeil();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector26.mapTanToSelf();
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapLog();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector33.mapUlpToSelf();
        double[] doubleArray37 = arrayRealVector33.toArray();
        arrayRealVector26.data = doubleArray37;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector22, doubleArray37);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector19.projection((org.apache.commons.math.linear.RealVector) arrayRealVector39);
        double[] doubleArray41 = arrayRealVector19.getDataRef();
        arrayRealVector1.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 10, (double) (-1.0f));
        double[] doubleArray46 = openMapRealVector45.toArray();
        arrayRealVector1.data = doubleArray46;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector45.", arrayRealVector1.equals(openMapRealVector45) == openMapRealVector45.equals(arrayRealVector1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapCeil();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector2.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector7.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.ebeMultiply(realVector8);
        boolean boolean11 = openMapRealVector2.isDefaultValue((double) (short) 100);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector2.mapTanToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector2);
        boolean boolean15 = openMapRealVector13.isDefaultValue((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector18.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector22.mapCeil();
        double double24 = openMapRealVector18.getL1Distance(openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector27.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector31.mapCeil();
        double double33 = openMapRealVector27.getL1Distance(openMapRealVector31);
        double double34 = openMapRealVector18.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector31.mapSubtract(10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector39.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector43.mapCeil();
        double double45 = openMapRealVector39.getL1Distance(openMapRealVector43);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector48.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector52.mapCeil();
        double double54 = openMapRealVector48.getL1Distance(openMapRealVector52);
        double double55 = openMapRealVector39.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector52.mapSubtract(10.0d);
        double double58 = openMapRealVector31.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector52);
        double double59 = openMapRealVector13.getL1Distance(openMapRealVector31);
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector31.mapAdd(10.0d);
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray63);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector64.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector64.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector64.mapCeilToSelf();
        double[] doubleArray68 = arrayRealVector64.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray68, (double) 10L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector62.append(doubleArray68);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector64 and openMapRealVector70.", arrayRealVector64.equals(openMapRealVector70) == openMapRealVector70.equals(arrayRealVector64));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray2);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector3.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector3.mapCeilToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        double double15 = arrayRealVector8.dotProduct(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector12.mapPowToSelf((double) (-1.0f));
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector19.mapLog();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector19.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector19.mapCeil();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector19.mapTanToSelf();
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray25);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector26.mapLog();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector26.mapUlpToSelf();
        double[] doubleArray30 = arrayRealVector26.toArray();
        arrayRealVector19.data = doubleArray30;
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector12.append(doubleArray30);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector34.mapInv();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector34.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray30, arrayRealVector34);
        double double39 = arrayRealVector3.dotProduct(doubleArray30);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector3.mapLog10ToSelf();
        double[] doubleArray41 = arrayRealVector3.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector1.projection(doubleArray41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector1 and arrayRealVector3.", openMapRealVector1.equals(arrayRealVector3) == arrayRealVector3.equals(openMapRealVector1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector5.mapCeil();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector5.mapAsinToSelf();
        double[] doubleArray13 = arrayRealVector5.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray13, (double) 3);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapCoshToSelf();
        boolean boolean20 = arrayRealVector17.isInfinite();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapAtan();
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector23.mapCeilToSelf();
        double double27 = arrayRealVector17.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector23);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector23.mapSinToSelf();
        double[] doubleArray29 = arrayRealVector23.getDataRef();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector23.mapInvToSelf();
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapLog();
        int int35 = arrayRealVector32.getDimension();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector32.mapAsin();
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray37);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector38.mapLog();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector38.mapUlpToSelf();
        double[] doubleArray42 = arrayRealVector38.toArray();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector32.append(doubleArray42);
        double double44 = arrayRealVector23.getDistance(doubleArray42);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42);
        double double46 = openMapRealVector15.getL1Distance(doubleArray42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector5.mapCeil();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector5.mapAsinToSelf();
        double[] doubleArray13 = arrayRealVector5.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray13, (double) 3);
        boolean boolean17 = openMapRealVector15.isDefaultValue((double) (short) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog();
        double double8 = arrayRealVector1.dotProduct(arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector5.mapCoshToSelf();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapLog();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector11.mapUlpToSelf();
        double[] doubleArray15 = arrayRealVector11.toArray();
        arrayRealVector5.data = doubleArray15;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray15, (double) (-1));
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector18.mapSignumToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and realVector19.", arrayRealVector1.equals(realVector19) == realVector19.equals(arrayRealVector1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapLog();
        double[] doubleArray4 = arrayRealVector1.getData();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapSqrtToSelf();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7, false);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog10();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapCeil();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector11.mapSignumToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector11.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector11.mapExpToSelf();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapLog();
        double[] doubleArray23 = arrayRealVector20.getData();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapInv();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector25.mapLog();
        double[] doubleArray29 = arrayRealVector25.getDataRef();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector25.mapUlpToSelf();
        double double31 = arrayRealVector20.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector25);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(realVector18, arrayRealVector25);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector34.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector34.mapCeilToSelf();
        double[] doubleArray38 = arrayRealVector34.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38, (double) 10L);
        double double41 = arrayRealVector25.getL1Distance(doubleArray38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector40.", arrayRealVector1.equals(openMapRealVector40) == openMapRealVector40.equals(arrayRealVector1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) 'a', 100, (double) (short) 1);
        double double4 = openMapRealVector3.getL1Norm();
        double[] doubleArray5 = openMapRealVector3.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapUlp();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and arrayRealVector7.", openMapRealVector3.equals(arrayRealVector7) == arrayRealVector7.equals(openMapRealVector3));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3, 0, (int) (byte) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 100.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector10.", openMapRealVector4.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector4));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 0, (int) ' ', 1.4142135623730951d);
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapCoshToSelf();
        boolean boolean8 = arrayRealVector5.isInfinite();
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector5.mapAtan();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector11.mapCeilToSelf();
        double double15 = arrayRealVector5.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector();
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapLog();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector18.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector16, arrayRealVector18);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector16.mapTanh();
        double[] doubleArray24 = arrayRealVector16.toArray();
        double double25 = arrayRealVector5.dotProduct(doubleArray24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector3.subtract(doubleArray24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and arrayRealVector5.", openMapRealVector3.equals(arrayRealVector5) == arrayRealVector5.equals(openMapRealVector3));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        double[] doubleArray5 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, true);
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray8);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapLog();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector9.mapCeil();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector9.mapTanToSelf();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray15);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector16.mapLog();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector16.mapUlpToSelf();
        double[] doubleArray20 = arrayRealVector16.toArray();
        arrayRealVector9.data = doubleArray20;
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapInv();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector23.mapLog();
        double[] doubleArray27 = arrayRealVector23.getDataRef();
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapExpToSelf();
        double[] doubleArray31 = arrayRealVector29.getDataRef();
        double double32 = arrayRealVector23.dotProduct(doubleArray31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20, arrayRealVector23);
        double double34 = arrayRealVector1.getLInfDistance(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector1);
        double[] doubleArray36 = openMapRealVector35.getData();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector35.", arrayRealVector1.equals(openMapRealVector35) == openMapRealVector35.equals(arrayRealVector1));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCoshToSelf();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector1.mapCosToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector1.mapAcosToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector1.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector1.mapSignumToSelf();
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapSqrtToSelf();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector20.mapInv();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector24.mapLog();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector24.mapCeil();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector24.mapTanToSelf();
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray30);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector31.mapLog();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector31.mapUlpToSelf();
        double[] doubleArray35 = arrayRealVector31.toArray();
        arrayRealVector24.data = doubleArray35;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector20, doubleArray35);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector17.projection((org.apache.commons.math.linear.RealVector) arrayRealVector37);
        double[] doubleArray39 = arrayRealVector17.getDataRef();
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapCoshToSelf();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray44);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector45.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector45.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector45, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector41, arrayRealVector45);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector41.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector41.mapCosToSelf();
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray53);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector54.mapInv();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector54.mapLog();
        double[] doubleArray58 = arrayRealVector54.getDataRef();
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector54.mapCeilToSelf();
        double double60 = arrayRealVector41.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector54);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray61);
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector62.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector62.mapInv();
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector62.mapLog();
        double[] doubleArray66 = arrayRealVector62.getDataRef();
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector62.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector62.mapAtanToSelf();
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector70 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray69);
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector70.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector70.mapInv();
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector70.mapLog();
        double[] doubleArray74 = arrayRealVector70.getDataRef();
        double double75 = arrayRealVector62.getL1Distance(doubleArray74);
        arrayRealVector41.data = doubleArray74;
        double double77 = arrayRealVector17.getLInfDistance(doubleArray74);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray74);
        double double79 = arrayRealVector1.dotProduct(doubleArray74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector78.", arrayRealVector1.equals(openMapRealVector78) == openMapRealVector78.equals(arrayRealVector1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog();
        double double8 = arrayRealVector1.dotProduct(arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector1.mapFloor();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapRint();
        double double14 = arrayRealVector1.dotProduct(arrayRealVector11);
        double double15 = arrayRealVector1.getNorm();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector1.mapRintToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector1.mapAdd((double) (short) -1);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector1.mapAbsToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector21.mapInv();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapLog();
        double double28 = arrayRealVector21.dotProduct(arrayRealVector25);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector25.mapPowToSelf((double) (-1.0f));
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapLog();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector32.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector32.mapCeil();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector32.mapTanToSelf();
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector39.mapLog();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector39.mapUlpToSelf();
        double[] doubleArray43 = arrayRealVector39.toArray();
        arrayRealVector32.data = doubleArray43;
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector25.append(doubleArray43);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector25.mapUlp();
        int int47 = arrayRealVector25.getDimension();
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector25.mapInv();
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray49);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector50.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector50.mapCoshToSelf();
        boolean boolean53 = arrayRealVector50.isInfinite();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector50.mapAtan();
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray55);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector56.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector56.mapCeilToSelf();
        double double60 = arrayRealVector50.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector56);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector56.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector56.mapTan();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector56.mapDivide((double) '4');
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector25.projection((org.apache.commons.math.linear.RealVector) arrayRealVector56);
        double[] doubleArray66 = arrayRealVector25.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        arrayRealVector1.data = doubleArray66;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector67.", arrayRealVector1.equals(openMapRealVector67) == openMapRealVector67.equals(arrayRealVector1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapInv();
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        double double15 = arrayRealVector8.dotProduct(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector8.mapFloor();
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapRint();
        double double21 = arrayRealVector8.dotProduct(arrayRealVector18);
        double double22 = arrayRealVector8.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6, arrayRealVector8);
        double[] doubleArray24 = arrayRealVector23.data;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector6 and arrayRealVector23.", openMapRealVector6.equals(arrayRealVector23) == arrayRealVector23.equals(openMapRealVector6));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapLog();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapUlp();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector1.mapSqrtToSelf();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector11.mapLog();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector11.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapCeil();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector11.mapTanToSelf();
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector18.mapLog();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector18.mapUlpToSelf();
        double[] doubleArray22 = arrayRealVector18.toArray();
        arrayRealVector11.data = doubleArray22;
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapInv();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector25.mapLog();
        double[] doubleArray29 = arrayRealVector25.getDataRef();
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray30);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapExpToSelf();
        double[] doubleArray33 = arrayRealVector31.getDataRef();
        double double34 = arrayRealVector25.dotProduct(doubleArray33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22, arrayRealVector25);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray36);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector37.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector37.mapLog();
        double[] doubleArray40 = arrayRealVector37.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22, doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray22);
        arrayRealVector1.setSubVector((int) (short) 0, doubleArray22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector42.", arrayRealVector1.equals(openMapRealVector42) == openMapRealVector42.equals(arrayRealVector1));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.Double[] doubleArray3 = new java.lang.Double[] { (-1.0d), (-1.0d), 0.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, (double) 10.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray3);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector7.mapPow((double) 10L);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector4 and arrayRealVector7.", openMapRealVector4.equals(arrayRealVector7) == arrayRealVector7.equals(openMapRealVector4));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        double[] doubleArray3 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapRintToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapSqrt();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapExpm1();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray7);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapLog();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapAtanToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector8.mapFloorToSelf();
        double double13 = arrayRealVector1.dotProduct(arrayRealVector8);
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray14);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapLog();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector15.mapDivideToSelf((double) (-1L));
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector15.mapInv();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector15.mapCosToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector15.mapFloor();
        arrayRealVector8.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector15);
        double double25 = arrayRealVector15.getNorm();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector15.mapAddToSelf((double) 0);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray28);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapCoshToSelf();
        boolean boolean32 = arrayRealVector29.isInfinite();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector29.mapAtan();
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray34);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector35.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector35.mapCeilToSelf();
        double double39 = arrayRealVector29.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector();
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray41);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapLog();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector42.mapAtanToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector40, arrayRealVector42);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector40.mapTanh();
        double[] doubleArray48 = arrayRealVector40.toArray();
        double double49 = arrayRealVector29.dotProduct(doubleArray48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector29);
        double double51 = arrayRealVector15.dotProduct(arrayRealVector29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector50.", arrayRealVector1.equals(openMapRealVector50) == openMapRealVector50.equals(arrayRealVector1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapSqrtToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector(realVector2);
        double[] doubleArray4 = arrayRealVector3.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4, (-0.0d));
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapCosh();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector6.", arrayRealVector1.equals(openMapRealVector6) == openMapRealVector6.equals(arrayRealVector1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, 1.0E-12d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(0, (double) 3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector2.append(openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapTanToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector10.mapCeil();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector10.mapRint();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor13 = openMapRealVector10.sparseIterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector10.mapAddToSelf((double) (byte) -1);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector17.mapLog();
        double[] doubleArray20 = arrayRealVector17.getData();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector17.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector17.mapSubtract((double) 10L);
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapCoshToSelf();
        boolean boolean28 = arrayRealVector25.isInfinite();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector25.mapAtan();
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray30);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector31.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector31.mapCeilToSelf();
        double double35 = arrayRealVector25.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector31);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector31.mapExp();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector17.append(arrayRealVector31);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector31.mapCeilToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector31.mapAsin();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector31.mapDivide((double) 10L);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector31.mapCoshToSelf();
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray43);
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector44.mapLog10ToSelf();
        double[] doubleArray46 = arrayRealVector44.getDataRef();
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector44.mapRintToSelf();
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector44.mapSqrt();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector44.mapExpm1();
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray50);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector51.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapInv();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector51, false);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector55.mapLog10();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapLog1pToSelf();
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray58);
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector59.mapSqrtToSelf();
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector59.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector59.mapLog();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector59.mapUlp();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector59.mapAsinToSelf();
        double double65 = arrayRealVector55.getDistance((org.apache.commons.math.linear.RealVector) arrayRealVector59);
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector55.mapAdd((double) 0);
        double[] doubleArray68 = arrayRealVector55.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector69 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray68);
        double[] doubleArray70 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray70);
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector71.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector71.mapInv();
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector71.mapLog();
        double[] doubleArray75 = arrayRealVector71.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector76 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray68, doubleArray75);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector77 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector44, doubleArray68);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector78 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector31, doubleArray68);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector10.append(doubleArray68);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector6.append(doubleArray68);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector17.", openMapRealVector5.equals(arrayRealVector17) == arrayRealVector17.equals(openMapRealVector5));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapInv();
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector5.mapLog();
        double double8 = arrayRealVector1.dotProduct(arrayRealVector5);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector5.mapPowToSelf((double) (-1.0f));
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector12.mapLog();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector12.mapUlpToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector12.mapCeil();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector12.mapTanToSelf();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray18);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector19.mapLog();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector19.mapUlpToSelf();
        double[] doubleArray23 = arrayRealVector19.toArray();
        arrayRealVector12.data = doubleArray23;
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector5.append(doubleArray23);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapLog10ToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector27.mapInv();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector27.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray23, arrayRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray23);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector32.mapUlp();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector32.", arrayRealVector1.equals(openMapRealVector32) == openMapRealVector32.equals(arrayRealVector1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapCeil();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector2.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) -1, 0);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector7.mapCeil();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector2.ebeMultiply(realVector8);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector9.mapCosToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector9.mapTanhToSelf();
        double double12 = openMapRealVector9.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.mapAsinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        openMapRealVector16.setEntry(0, (double) (byte) 10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor20 = openMapRealVector16.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 1, (double) 10L);
        double double24 = openMapRealVector16.dotProduct((org.apache.commons.math.linear.RealVector) openMapRealVector23);
        double[] doubleArray26 = new double[] { 100 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector16.ebeMultiply(doubleArray26);
        openMapRealVector27.set((double) 1L);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector27.mapCosh();
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector32.mapLog();
        int int35 = arrayRealVector32.getDimension();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector32.mapAsin();
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray37);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapExpToSelf();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector38.mapLog();
        double[] doubleArray41 = arrayRealVector38.getData();
        arrayRealVector32.data = doubleArray41;
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector32.mapMultiplyToSelf((double) 10L);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector27, arrayRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector9.append(openMapRealVector27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector23 and arrayRealVector45.", openMapRealVector23.equals(arrayRealVector45) == arrayRealVector45.equals(openMapRealVector23));
    }
}

