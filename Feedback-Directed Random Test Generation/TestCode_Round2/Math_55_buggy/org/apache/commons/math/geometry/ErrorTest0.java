package org.apache.commons.math.geometry;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double3 = vector3D2.getX();
        boolean boolean4 = vector3D2.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double7 = vector3D6.getX();
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D2, (double) '#', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D2.add(vector3D9);
        double double11 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double14 = vector3D13.getX();
        boolean boolean15 = vector3D13.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double18 = vector3D17.getX();
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D13, (double) '#', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double25 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double28 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D26, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D21.add(vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double40 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D38, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D37.subtract(vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D27, Double.NEGATIVE_INFINITY, vector3D33, (double) (byte) -1, vector3D41, (double) 10L, vector3D43);
        double double45 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D19, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D0.add(vector3D19);
        double double47 = vector3D0.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D0.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D50 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double53 = vector3D52.getX();
        boolean boolean54 = vector3D52.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double57 = vector3D56.getX();
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D52, (double) '#', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D52.add(vector3D59);
        double double61 = org.apache.commons.math.geometry.Vector3D.distance(vector3D50, vector3D52);
        org.apache.commons.math.geometry.Vector3D vector3D62 = vector3D52.orthogonal();
        boolean boolean63 = vector3D52.isNaN();
        org.apache.commons.math.geometry.Vector3D vector3D64 = vector3D48.add(33.52610922848042d, vector3D52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D43 and vector3D48", vector3D43.equals(vector3D48) ? vector3D43.hashCode() == vector3D48.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double3 = vector3D2.getX();
        boolean boolean4 = vector3D2.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double7 = vector3D6.getX();
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D2, (double) '#', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D2.add(vector3D9);
        double double11 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double14 = vector3D13.getX();
        boolean boolean15 = vector3D13.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double18 = vector3D17.getX();
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D13, (double) '#', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double25 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double28 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D26, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D21.add(vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double40 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D38, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D37.subtract(vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D27, Double.NEGATIVE_INFINITY, vector3D33, (double) (byte) -1, vector3D41, (double) 10L, vector3D43);
        double double45 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D19, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D0.add(vector3D19);
        double double47 = vector3D0.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D0.orthogonal();
        double double49 = vector3D48.getNormInf();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D43 and vector3D48", vector3D43.equals(vector3D48) ? vector3D43.hashCode() == vector3D48.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.MINUS_I;
        double double1 = vector3D0.getZ();
        double double2 = vector3D0.getX();
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D5 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double6 = vector3D5.getX();
        boolean boolean7 = vector3D5.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double10 = vector3D9.getX();
        org.apache.commons.math.geometry.Vector3D vector3D11 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D5, (double) '#', vector3D9);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D5.add(vector3D12);
        double double14 = org.apache.commons.math.geometry.Vector3D.distance(vector3D3, vector3D5);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double17 = vector3D16.getX();
        boolean boolean18 = vector3D16.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double21 = vector3D20.getX();
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D16, (double) '#', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double28 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D24, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double31 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D29, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D24.add(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double43 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D41, vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D40.subtract(vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D30, Double.NEGATIVE_INFINITY, vector3D36, (double) (byte) -1, vector3D44, (double) 10L, vector3D46);
        double double48 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D22, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D3.add(vector3D22);
        double double50 = vector3D3.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D51 = vector3D3.orthogonal();
        double double52 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D0, vector3D3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D46 and vector3D51", vector3D46.equals(vector3D51) ? vector3D46.hashCode() == vector3D51.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double3 = vector3D2.getX();
        boolean boolean4 = vector3D2.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double7 = vector3D6.getX();
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D2, (double) '#', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D2.add(vector3D9);
        double double11 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double14 = vector3D13.getX();
        boolean boolean15 = vector3D13.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double18 = vector3D17.getX();
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D13, (double) '#', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double25 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double28 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D26, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D21.add(vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double40 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D38, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D37.subtract(vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D27, Double.NEGATIVE_INFINITY, vector3D33, (double) (byte) -1, vector3D41, (double) 10L, vector3D43);
        double double45 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D19, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D0.add(vector3D19);
        double double47 = vector3D0.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D0.orthogonal();
        double double49 = vector3D0.getNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D43 and vector3D48", vector3D43.equals(vector3D48) ? vector3D43.hashCode() == vector3D48.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double3 = vector3D2.getX();
        boolean boolean4 = vector3D2.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double7 = vector3D6.getX();
        boolean boolean8 = vector3D6.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double11 = vector3D10.getX();
        org.apache.commons.math.geometry.Vector3D vector3D12 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D6, (double) '#', vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D15 = vector3D6.subtract((double) ' ', vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D16 = vector3D2.add(vector3D14);
        org.apache.commons.math.geometry.Vector3D vector3D17 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double21 = vector3D20.getX();
        boolean boolean22 = vector3D20.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double25 = vector3D24.getX();
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D20, (double) '#', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double30 = vector3D29.getX();
        boolean boolean31 = vector3D29.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D33 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double34 = vector3D33.getX();
        org.apache.commons.math.geometry.Vector3D vector3D35 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D29, (double) '#', vector3D33);
        org.apache.commons.math.geometry.Vector3D vector3D36 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D37 = vector3D29.add(vector3D36);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D((-2.356194490192345d), vector3D2, (double) 1, vector3D20, (double) 0, vector3D36);
        boolean boolean39 = vector3D36.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D40 = vector3D36.orthogonal();
        double double41 = vector3D40.getNormSq();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D14 and vector3D40", vector3D14.equals(vector3D40) ? vector3D14.hashCode() == vector3D40.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double3 = vector3D2.getX();
        boolean boolean4 = vector3D2.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double7 = vector3D6.getX();
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D2, (double) '#', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D2.add(vector3D9);
        double double11 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double14 = vector3D13.getX();
        boolean boolean15 = vector3D13.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double18 = vector3D17.getX();
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D13, (double) '#', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double25 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double28 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D26, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D21.add(vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double40 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D38, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D37.subtract(vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D27, Double.NEGATIVE_INFINITY, vector3D33, (double) (byte) -1, vector3D41, (double) 10L, vector3D43);
        double double45 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D19, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D0.add(vector3D19);
        double double47 = vector3D0.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D0.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D48.normalize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D43 and vector3D48", vector3D43.equals(vector3D48) ? vector3D43.hashCode() == vector3D48.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.geometry.Vector3D vector3D3 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) 10);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D3.negate();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double9 = vector3D8.getX();
        boolean boolean10 = vector3D8.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double13 = vector3D12.getX();
        boolean boolean14 = vector3D12.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double17 = vector3D16.getX();
        org.apache.commons.math.geometry.Vector3D vector3D18 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D12, (double) '#', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D21 = vector3D12.subtract((double) ' ', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D22 = vector3D8.add(vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D8);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double27 = vector3D26.getX();
        boolean boolean28 = vector3D26.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double31 = vector3D30.getX();
        org.apache.commons.math.geometry.Vector3D vector3D32 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D26, (double) '#', vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D35 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double36 = vector3D35.getX();
        boolean boolean37 = vector3D35.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double40 = vector3D39.getX();
        org.apache.commons.math.geometry.Vector3D vector3D41 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D35, (double) '#', vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D43 = vector3D35.add(vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D((-2.356194490192345d), vector3D8, (double) 1, vector3D26, (double) 0, vector3D42);
        boolean boolean45 = vector3D42.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D42.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double50 = vector3D49.getX();
        boolean boolean51 = vector3D49.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double54 = vector3D53.getX();
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D49, (double) '#', vector3D53);
        double double56 = vector3D49.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double59 = vector3D58.getX();
        boolean boolean60 = vector3D58.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double63 = vector3D62.getX();
        boolean boolean64 = vector3D62.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D66 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double67 = vector3D66.getX();
        org.apache.commons.math.geometry.Vector3D vector3D68 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D62, (double) '#', vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D70 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D62.subtract((double) ' ', vector3D70);
        org.apache.commons.math.geometry.Vector3D vector3D72 = vector3D58.add(vector3D70);
        double double73 = vector3D58.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D74 = new org.apache.commons.math.geometry.Vector3D((-1.0d), vector3D4, (-0.5309649148733836d), vector3D46, 1.5707963267948966d, vector3D49, 43.756491210010616d, vector3D58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D20 and vector3D46", vector3D20.equals(vector3D46) ? vector3D20.hashCode() == vector3D46.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D3 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double4 = vector3D3.getX();
        boolean boolean5 = vector3D3.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double8 = vector3D7.getX();
        org.apache.commons.math.geometry.Vector3D vector3D9 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D3, (double) '#', vector3D7);
        org.apache.commons.math.geometry.Vector3D vector3D10 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D11 = vector3D3.add(vector3D10);
        double double12 = org.apache.commons.math.geometry.Vector3D.distance(vector3D1, vector3D3);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double15 = vector3D14.getX();
        boolean boolean16 = vector3D14.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double19 = vector3D18.getX();
        org.apache.commons.math.geometry.Vector3D vector3D20 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D14, (double) '#', vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double26 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D22, vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double29 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D27, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D22.add(vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double41 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D39, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D38.subtract(vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D28, Double.NEGATIVE_INFINITY, vector3D34, (double) (byte) -1, vector3D42, (double) 10L, vector3D44);
        double double46 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D20, vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D1.add(vector3D20);
        double double48 = vector3D1.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D1.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D52 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double53 = vector3D52.getX();
        boolean boolean54 = vector3D52.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double57 = vector3D56.getX();
        org.apache.commons.math.geometry.Vector3D vector3D58 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D52, (double) '#', vector3D56);
        org.apache.commons.math.geometry.Vector3D vector3D59 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D60 = vector3D52.add(vector3D59);
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) ' ', 0.0d, (double) 10.0f);
        double double65 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D60, vector3D64);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double68 = vector3D67.getX();
        boolean boolean69 = vector3D67.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double72 = vector3D71.getX();
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D67, (double) '#', vector3D71);
        double double74 = vector3D67.getNormInf();
        org.apache.commons.math.geometry.Vector3D vector3D75 = vector3D60.add(vector3D67);
        double double76 = vector3D67.getDelta();
        org.apache.commons.math.geometry.Vector3D vector3D77 = vector3D67.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D78 = new org.apache.commons.math.geometry.Vector3D((double) ' ', vector3D49, (double) (-1L), vector3D77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D44 and vector3D49", vector3D44.equals(vector3D49) ? vector3D44.hashCode() == vector3D49.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.geometry.Vector3D vector3D1 = org.apache.commons.math.geometry.Vector3D.MINUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D3 = vector3D1.scalarMultiply(100.0d);
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D1.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) ' ', 0.0d, (double) 10.0f);
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double13 = vector3D12.getX();
        boolean boolean14 = vector3D12.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double17 = vector3D16.getX();
        boolean boolean18 = vector3D16.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double21 = vector3D20.getX();
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D16, (double) '#', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D25 = vector3D16.subtract((double) ' ', vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = vector3D12.add(vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) 0.0f, vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double31 = vector3D30.getX();
        boolean boolean32 = vector3D30.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double35 = vector3D34.getX();
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D30, (double) '#', vector3D34);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double40 = vector3D39.getX();
        boolean boolean41 = vector3D39.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double44 = vector3D43.getX();
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D39, (double) '#', vector3D43);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D47 = vector3D39.add(vector3D46);
        org.apache.commons.math.geometry.Vector3D vector3D48 = new org.apache.commons.math.geometry.Vector3D((-2.356194490192345d), vector3D12, (double) 1, vector3D30, (double) 0, vector3D46);
        boolean boolean49 = vector3D46.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D50 = vector3D8.subtract(100.0d, vector3D46);
        double double51 = vector3D50.getNormSq();
        boolean boolean52 = vector3D50.isNaN();
        double double53 = org.apache.commons.math.geometry.Vector3D.angle(vector3D4, vector3D50);
        org.apache.commons.math.geometry.Vector3D vector3D55 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D56 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D57 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double58 = vector3D57.getX();
        double double59 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D56, vector3D57);
        double double60 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D55, vector3D57);
        org.apache.commons.math.geometry.Vector3D vector3D61 = vector3D57.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.MINUS_J;
        org.apache.commons.math.geometry.Vector3D vector3D63 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D66 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double67 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D63, vector3D66);
        org.apache.commons.math.geometry.Vector3D vector3D68 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D69 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double70 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D68, vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D71 = vector3D63.add(vector3D69);
        org.apache.commons.math.geometry.Vector3D vector3D73 = vector3D63.scalarMultiply((double) 1);
        org.apache.commons.math.geometry.Vector3D vector3D74 = vector3D73.normalize();
        double double75 = vector3D73.getNorm1();
        double double76 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D62, vector3D73);
        double double77 = vector3D62.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D78 = vector3D62.normalize();
        org.apache.commons.math.geometry.Vector3D vector3D79 = vector3D61.subtract(vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D80 = vector3D62.orthogonal();
        java.lang.String str81 = vector3D80.toString();
        org.apache.commons.math.geometry.Vector3D vector3D82 = new org.apache.commons.math.geometry.Vector3D((double) (byte) 100, vector3D50, 1.0d, vector3D80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D4 and vector3D62", vector3D4.equals(vector3D62) ? vector3D4.hashCode() == vector3D62.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double1 = vector3D0.getX();
        boolean boolean2 = vector3D0.isInfinite();
        double double3 = vector3D0.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D4 = vector3D0.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D8 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double9 = vector3D8.getX();
        boolean boolean10 = vector3D8.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D12 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double13 = vector3D12.getX();
        org.apache.commons.math.geometry.Vector3D vector3D14 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D8, (double) '#', vector3D12);
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D17 = vector3D8.subtract((double) ' ', vector3D16);
        org.apache.commons.math.geometry.Vector3D vector3D19 = vector3D16.scalarMultiply(0.0d);
        double double20 = vector3D19.getNorm();
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D25 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double26 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D22, vector3D25);
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D28 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double29 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D27, vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D30 = vector3D22.add(vector3D28);
        org.apache.commons.math.geometry.Vector3D vector3D34 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D38 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double41 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D39, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D42 = vector3D38.subtract(vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D44 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D45 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D28, Double.NEGATIVE_INFINITY, vector3D34, (double) (byte) -1, vector3D42, (double) 10L, vector3D44);
        double double46 = vector3D45.getNorm();
        double double47 = vector3D45.getY();
        org.apache.commons.math.geometry.Vector3D vector3D49 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double50 = vector3D49.getX();
        boolean boolean51 = vector3D49.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D53 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double54 = vector3D53.getX();
        org.apache.commons.math.geometry.Vector3D vector3D55 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D49, (double) '#', vector3D53);
        org.apache.commons.math.geometry.Vector3D vector3D58 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double59 = vector3D58.getX();
        boolean boolean60 = vector3D58.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D62 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double63 = vector3D62.getX();
        org.apache.commons.math.geometry.Vector3D vector3D64 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D58, (double) '#', vector3D62);
        org.apache.commons.math.geometry.Vector3D vector3D67 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double68 = vector3D67.getX();
        boolean boolean69 = vector3D67.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D71 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double72 = vector3D71.getX();
        org.apache.commons.math.geometry.Vector3D vector3D73 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D67, (double) '#', vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D74 = new org.apache.commons.math.geometry.Vector3D((double) (-1), vector3D62, (-1.0d), vector3D71);
        org.apache.commons.math.geometry.Vector3D vector3D75 = org.apache.commons.math.geometry.Vector3D.crossProduct(vector3D53, vector3D74);
        org.apache.commons.math.geometry.Vector3D vector3D76 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D77 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double78 = vector3D77.getX();
        double double79 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D76, vector3D77);
        org.apache.commons.math.geometry.Vector3D vector3D81 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double82 = vector3D81.getX();
        boolean boolean83 = vector3D81.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D85 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double86 = vector3D85.getX();
        org.apache.commons.math.geometry.Vector3D vector3D87 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D81, (double) '#', vector3D85);
        org.apache.commons.math.geometry.Vector3D vector3D88 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D89 = vector3D81.add(vector3D88);
        double double90 = org.apache.commons.math.geometry.Vector3D.angle(vector3D76, vector3D89);
        double double91 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D53, vector3D76);
        double double92 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D45, vector3D76);
        org.apache.commons.math.geometry.Vector3D vector3D93 = vector3D19.subtract(vector3D45);
        org.apache.commons.math.geometry.Vector3D vector3D94 = new org.apache.commons.math.geometry.Vector3D((double) 10L, vector3D19);
        org.apache.commons.math.geometry.Vector3D vector3D95 = vector3D19.negate();
        org.apache.commons.math.geometry.Vector3D vector3D96 = vector3D0.add(0.9588510772084059d, vector3D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D19 and vector3D95", vector3D19.equals(vector3D95) ? vector3D19.hashCode() == vector3D95.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double3 = vector3D2.getX();
        boolean boolean4 = vector3D2.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double7 = vector3D6.getX();
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D2, (double) '#', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D2.add(vector3D9);
        double double11 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D2);
        org.apache.commons.math.geometry.Vector3D vector3D13 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double14 = vector3D13.getX();
        boolean boolean15 = vector3D13.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double18 = vector3D17.getX();
        org.apache.commons.math.geometry.Vector3D vector3D19 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D13, (double) '#', vector3D17);
        org.apache.commons.math.geometry.Vector3D vector3D21 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D24 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double25 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D21, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D27 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double28 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D26, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = vector3D21.add(vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D33 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D37 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D38 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D39 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double40 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D38, vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D37.subtract(vector3D39);
        org.apache.commons.math.geometry.Vector3D vector3D43 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D44 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D27, Double.NEGATIVE_INFINITY, vector3D33, (double) (byte) -1, vector3D41, (double) 10L, vector3D43);
        double double45 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D19, vector3D41);
        org.apache.commons.math.geometry.Vector3D vector3D46 = vector3D0.add(vector3D19);
        double double47 = vector3D0.getAlpha();
        org.apache.commons.math.geometry.Vector3D vector3D48 = vector3D0.orthogonal();
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D0.orthogonal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D43 and vector3D48", vector3D43.equals(vector3D48) ? vector3D43.hashCode() == vector3D48.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math.geometry.Vector3D vector3D4 = new org.apache.commons.math.geometry.Vector3D((double) ' ', (double) 10);
        org.apache.commons.math.geometry.Vector3D vector3D5 = vector3D4.negate();
        org.apache.commons.math.geometry.Vector3D vector3D6 = new org.apache.commons.math.geometry.Vector3D(33.52610922848042d, vector3D4);
        org.apache.commons.math.geometry.Vector3D vector3D7 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D10 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double11 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D7, vector3D10);
        org.apache.commons.math.geometry.Vector3D vector3D14 = org.apache.commons.math.geometry.Vector3D.NaN;
        java.lang.String str15 = vector3D14.toString();
        org.apache.commons.math.geometry.Vector3D vector3D17 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D18 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double19 = vector3D18.getX();
        double double20 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D17, vector3D18);
        org.apache.commons.math.geometry.Vector3D vector3D22 = org.apache.commons.math.geometry.Vector3D.NaN;
        org.apache.commons.math.geometry.Vector3D vector3D23 = new org.apache.commons.math.geometry.Vector3D((double) 1.0f, vector3D14, 10.0d, vector3D17, (double) 10.0f, vector3D22);
        org.apache.commons.math.geometry.Vector3D vector3D24 = vector3D7.add(100.0d, vector3D14);
        double double25 = org.apache.commons.math.geometry.Vector3D.distance(vector3D4, vector3D24);
        org.apache.commons.math.geometry.Vector3D vector3D26 = new org.apache.commons.math.geometry.Vector3D((double) 1.0f, vector3D4);
        double double27 = vector3D4.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double31 = vector3D30.getX();
        boolean boolean32 = vector3D30.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D34 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double35 = vector3D34.getX();
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D30, (double) '#', vector3D34);
        double double37 = vector3D36.getNorm();
        double double38 = vector3D36.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D40 = org.apache.commons.math.geometry.Vector3D.ZERO;
        org.apache.commons.math.geometry.Vector3D vector3D41 = vector3D36.add(0.009999666686665238d, vector3D40);
        org.apache.commons.math.geometry.Vector3D vector3D42 = new org.apache.commons.math.geometry.Vector3D((double) (short) -1, vector3D40);
        double double43 = org.apache.commons.math.geometry.Vector3D.distanceSq(vector3D4, vector3D40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D40 and vector3D42", vector3D40.equals(vector3D42) ? vector3D40.hashCode() == vector3D42.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math.geometry.Vector3D vector3D0 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D2 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double3 = vector3D2.getX();
        boolean boolean4 = vector3D2.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D6 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double7 = vector3D6.getX();
        org.apache.commons.math.geometry.Vector3D vector3D8 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D2, (double) '#', vector3D6);
        org.apache.commons.math.geometry.Vector3D vector3D9 = org.apache.commons.math.geometry.Vector3D.PLUS_I;
        org.apache.commons.math.geometry.Vector3D vector3D10 = vector3D2.add(vector3D9);
        double double11 = org.apache.commons.math.geometry.Vector3D.distance(vector3D0, vector3D2);
        double double12 = vector3D0.getNormSq();
        org.apache.commons.math.geometry.Vector3D vector3D13 = vector3D0.orthogonal();
        double double14 = vector3D0.getZ();
        org.apache.commons.math.geometry.Vector3D vector3D16 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double17 = vector3D16.getX();
        boolean boolean18 = vector3D16.isInfinite();
        org.apache.commons.math.geometry.Vector3D vector3D20 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        double double21 = vector3D20.getX();
        org.apache.commons.math.geometry.Vector3D vector3D22 = new org.apache.commons.math.geometry.Vector3D((double) (short) 10, vector3D16, (double) '#', vector3D20);
        org.apache.commons.math.geometry.Vector3D vector3D24 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D27 = new org.apache.commons.math.geometry.Vector3D((double) 1L, (double) (-1));
        double double28 = org.apache.commons.math.geometry.Vector3D.dotProduct(vector3D24, vector3D27);
        org.apache.commons.math.geometry.Vector3D vector3D29 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D30 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double31 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D29, vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D32 = vector3D24.add(vector3D30);
        org.apache.commons.math.geometry.Vector3D vector3D36 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D40 = new org.apache.commons.math.geometry.Vector3D(1.0d, 0.0d);
        org.apache.commons.math.geometry.Vector3D vector3D41 = org.apache.commons.math.geometry.Vector3D.POSITIVE_INFINITY;
        org.apache.commons.math.geometry.Vector3D vector3D42 = org.apache.commons.math.geometry.Vector3D.NEGATIVE_INFINITY;
        double double43 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D41, vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D44 = vector3D40.subtract(vector3D42);
        org.apache.commons.math.geometry.Vector3D vector3D46 = org.apache.commons.math.geometry.Vector3D.PLUS_K;
        org.apache.commons.math.geometry.Vector3D vector3D47 = new org.apache.commons.math.geometry.Vector3D(1.0d, vector3D30, Double.NEGATIVE_INFINITY, vector3D36, (double) (byte) -1, vector3D44, (double) 10L, vector3D46);
        double double48 = org.apache.commons.math.geometry.Vector3D.distance1(vector3D22, vector3D44);
        org.apache.commons.math.geometry.Vector3D vector3D49 = vector3D44.normalize();
        double double50 = org.apache.commons.math.geometry.Vector3D.distanceInf(vector3D0, vector3D49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D46", vector3D13.equals(vector3D46) ? vector3D13.hashCode() == vector3D46.hashCode() : true);
    }
}

