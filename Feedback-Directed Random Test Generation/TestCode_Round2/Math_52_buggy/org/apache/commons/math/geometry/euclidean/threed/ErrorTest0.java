package org.apache.commons.math.geometry.euclidean.threed;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D2 = rotation0.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D2, 100.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double6 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D7 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double9 = rotation8.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation10 = rotation5.applyInverseTo(rotation8);
        double double11 = rotation10.getQ3();
        double double12 = rotation10.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double14 = rotation13.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D15 = rotation13.getAxis();
        double[][] doubleArray16 = rotation13.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray16, (double) 0.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double20 = rotation19.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation22.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D24);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) (byte) 10);
        double double28 = rotation27.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double30 = rotation29.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double33 = rotation32.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, (double) (byte) 10);
        double double38 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation27, rotation37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation18.applyInverseTo(rotation37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = rotation10.applyInverseTo(rotation37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(100.0d, (double) (short) 100, 1.0d, (double) 0.0f, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, (double) (-1));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, 0.10201426463179095d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation10.applyInverseTo(vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D2, vector3D47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D47 and vector3D52", vector3D47.equals(vector3D52) ? vector3D47.hashCode() == vector3D52.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D2 = rotation0.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation3 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double4 = rotation3.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = rotation0.applyInverseTo(rotation3);
        double double6 = rotation5.getQ3();
        double double7 = rotation5.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double9 = rotation8.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D10 = rotation8.getAxis();
        double[][] doubleArray11 = rotation8.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray11, (double) 0.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double15 = rotation14.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation14.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double18 = rotation17.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D16, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D16, (double) (byte) 10);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double25 = rotation24.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double28 = rotation27.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, (double) (byte) 10);
        double double33 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation22, rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = rotation13.applyInverseTo(rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation5.applyInverseTo(rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(100.0d, (double) (short) 100, 1.0d, (double) 0.0f, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, (double) (-1));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, 0.10201426463179095d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation5.applyInverseTo(vector3D42);
        java.lang.Class<?> wildcardClass48 = vector3D42.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D42 and vector3D47", vector3D42.equals(vector3D47) ? vector3D42.hashCode() == vector3D47.hashCode() : true);
    }
}

