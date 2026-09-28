package com.fasterxml.jackson.core.sym;

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
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432221069));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash((-432233131), (-432807676), (-1654346617));
        int int8 = byteQuadsCanonicalizer1.calcHash((-432236071));
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        int int10 = byteQuadsCanonicalizer1.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-41777064) + "'", int6 == (-41777064));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432806963) + "'", int8 == (-432806963));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.totalCount();
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432222389);
        int int12 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "1) test1003(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432203127) + "'", int1 == (-432203127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "1) test1003(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432203127) + "'", int3 == (-432203127));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        byteQuadsCanonicalizer0._hashArea = intArray11;
        int int15 = byteQuadsCanonicalizer0._secondaryStart;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = byteQuadsCanonicalizer0.findName(2073961006);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1990734311 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "2) test1004(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 756843252 + "'", int13 == 756843252);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.calcHash((-2023759883), 1073894391);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "3) test1005(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432203109) + "'", int1 == (-432203109));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "2) test1005(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1042701530 + "'", int5 == 1042701530);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1135496089);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "4) test1006(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1005594936 + "'", int4 == 1005594936);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234855));
        int int2 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._longNameOffset = (-432215793);
        int int5 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        int int12 = byteQuadsCanonicalizer0._spilloverEnd;
        int int13 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.hashSeed();
        int int10 = byteQuadsCanonicalizer8._longNameOffset;
        int int11 = byteQuadsCanonicalizer8.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        byteQuadsCanonicalizer12._spilloverEnd = (byte) 100;
        int int19 = byteQuadsCanonicalizer12._spilloverEnd;
        int int20 = byteQuadsCanonicalizer12.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        byteQuadsCanonicalizer21._count = (byte) 100;
        java.lang.String[] strArray25 = byteQuadsCanonicalizer21._names;
        int[] intArray30 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int32 = byteQuadsCanonicalizer21.calcHash(intArray30, 4);
        java.lang.String[] strArray38 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer21._names = strArray38;
        byteQuadsCanonicalizer12._names = strArray38;
        byteQuadsCanonicalizer8._names = strArray38;
        byteQuadsCanonicalizer0._names = strArray38;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int44 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0.release();
        boolean boolean46 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "5) test1009(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432203061) + "'", int9 == (-432203061));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "3) test1009(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 292949447 + "'", int32 == 292949447);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._intern = false;
        int int10 = byteQuadsCanonicalizer0._hashSize;
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = (-1953084381);
        int int11 = byteQuadsCanonicalizer0.calcHash(1091455544, 0);
        int int12 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "6) test1011(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 410583513 + "'", int11 == 410583513);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432237891));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        int int11 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1458255080);
        int int14 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "7) test1013(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584825728 + "'", int10 == 584825728);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(460502028);
        int int2 = byteQuadsCanonicalizer1._secondaryStart;
        int int3 = byteQuadsCanonicalizer1._secondaryStart;
        byteQuadsCanonicalizer1._tertiaryShift = (-432207321);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._intern = true;
        int int9 = byteQuadsCanonicalizer4._longNameOffset;
        byteQuadsCanonicalizer4._tertiaryShift = (-432220903);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "8) test1015(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432202943) + "'", int1 == (-432202943));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = 1791970984;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = 850815938;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        int int15 = byteQuadsCanonicalizer0.calcHash(488616572);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "9) test1016(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433036701) + "'", int5 == (-433036701));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "4) test1016(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432202937) + "'", int10 == (-432202937));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "1) test1016(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-80996761) + "'", int15 == (-80996761));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = (-432230027);
        int int15 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-961434091);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "10) test1017(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584826817 + "'", int10 == 584826817);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "5) test1017(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432202931) + "'", int12 == (-432202931));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "11) test1018(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432202919) + "'", int1 == (-432202919));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "6) test1018(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432202919) + "'", int3 == (-432202919));
// flaky "2) test1018(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726459430 + "'", int8 == 726459430);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0.makeChild(1951254063);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "12) test1020(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432202867) + "'", int7 == (-432202867));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.Class<?> wildcardClass9 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        int int5 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "13) test1022(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432202845) + "'", int1 == (-432202845));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1913951951));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        java.lang.String[] strArray12 = null;
        byteQuadsCanonicalizer0._names = strArray12;
        byteQuadsCanonicalizer0._tertiaryShift = (-432220191);
        int int16 = byteQuadsCanonicalizer0._longNameOffset;
        int int17 = byteQuadsCanonicalizer0._tertiaryStart;
        int int20 = byteQuadsCanonicalizer0.calcHash((-432819013), 1871178543);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "14) test1024(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433036789) + "'", int11 == (-433036789));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "7) test1024(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 46133337 + "'", int20 == 46133337);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int15 = byteQuadsCanonicalizer0.calcHash((-1529115260));
        boolean boolean16 = byteQuadsCanonicalizer0.maybeDirty();
        int int17 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "15) test1025(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2061938941 + "'", int11 == 2061938941);
// flaky "8) test1025(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1122170738 + "'", int15 == 1122170738);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild((-432216709));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer0.makeChild((-432231821));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "16) test1026(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100061702 + "'", int7 == 100061702);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._intern = true;
        int int10 = byteQuadsCanonicalizer3.calcHash((-432231187), (-432228301), (-1967485713));
        java.lang.String[] strArray11 = byteQuadsCanonicalizer3._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1481041286) + "'", int10 == (-1481041286));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(429638624);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1097223542);
        byteQuadsCanonicalizer1._tertiaryStart = (-432217537);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4._longNameOffset;
        byteQuadsCanonicalizer4._tertiaryStart = 0;
        int int8 = byteQuadsCanonicalizer4._tertiaryShift;
        int int10 = byteQuadsCanonicalizer4.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer4.makeChild((-432232707));
        int[] intArray19 = new int[] { (-432224835), 585076000, (-432228709), (-432820704), 1487490903, (-432230311) };
        byteQuadsCanonicalizer4._hashArea = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = byteQuadsCanonicalizer1.findName(intArray19, 898137613);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "17) test1029(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99161 + "'", int10 == 99161);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-432224835), 585076000, (-432228709), (-432820704), 1487490903, (-432230311) });
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        byteQuadsCanonicalizer6._tertiaryStart = 950858184;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer6._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._tertiaryStart = 851021273;
        int int11 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "18) test1031(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432202733) + "'", int1 == (-432202733));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(726801331);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0.calcHash(726812095, (-432228893));
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int11 = byteQuadsCanonicalizer0.calcHash((-1011409797));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "19) test1033(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 595702828 + "'", int8 == 595702828);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "9) test1033(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 629702000 + "'", int11 == 629702000);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1.release();
        byteQuadsCanonicalizer1.release();
        java.lang.String str10 = byteQuadsCanonicalizer1.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str10, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '4');
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "20) test1035(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433036953) + "'", int5 == (-433036953));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "10) test1035(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-433036964) + "'", int8 == (-433036964));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1.maybeDirty();
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(726601090);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.Class<?> wildcardClass6 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "21) test1039(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432202625) + "'", int5 == (-432202625));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer7._names = strArray24;
        int int26 = byteQuadsCanonicalizer7.bucketCount();
        boolean boolean27 = byteQuadsCanonicalizer7._failOnDoS;
        int int28 = byteQuadsCanonicalizer7.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer32._hashSize = (short) 10;
        int int35 = byteQuadsCanonicalizer32._hashSize;
        byteQuadsCanonicalizer32._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer38 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int39 = byteQuadsCanonicalizer38._hashSize;
        byteQuadsCanonicalizer38._count = (byte) 100;
        java.lang.String[] strArray42 = byteQuadsCanonicalizer38._names;
        byteQuadsCanonicalizer38._spilloverEnd = (byte) 100;
        int int45 = byteQuadsCanonicalizer38._spilloverEnd;
        int int46 = byteQuadsCanonicalizer38.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int48 = byteQuadsCanonicalizer47._hashSize;
        byteQuadsCanonicalizer47._count = (byte) 100;
        java.lang.String[] strArray51 = byteQuadsCanonicalizer47._names;
        int[] intArray56 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int58 = byteQuadsCanonicalizer47.calcHash(intArray56, 4);
        java.lang.String[] strArray64 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer47._names = strArray64;
        byteQuadsCanonicalizer38._names = strArray64;
        java.lang.String[] strArray67 = new java.lang.String[] {};
        byteQuadsCanonicalizer38._names = strArray67;
        byteQuadsCanonicalizer32._names = strArray67;
        byteQuadsCanonicalizer30._names = strArray67;
        byteQuadsCanonicalizer7._names = strArray67;
        byteQuadsCanonicalizer0._names = strArray67;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "22) test1040(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432202603) + "'", int1 == (-432202603));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "11) test1040(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 477310349 + "'", int18 == 477310349);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "3) test1040(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 477310349 + "'", int58 == 477310349);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] {});
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        int[] intArray10 = byteQuadsCanonicalizer9._hashArea;
        int int11 = byteQuadsCanonicalizer9._secondaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._longNameOffset;
        byteQuadsCanonicalizer13._tertiaryStart = 0;
        int int17 = byteQuadsCanonicalizer13._tertiaryShift;
        int int19 = byteQuadsCanonicalizer13.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = byteQuadsCanonicalizer13.makeChild((-432232707));
        int[] intArray28 = new int[] { (-432224835), 585076000, (-432228709), (-432820704), 1487490903, (-432230311) };
        byteQuadsCanonicalizer13._hashArea = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = byteQuadsCanonicalizer9.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray28, (-432220367));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 256 + "'", int11 == 256);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "23) test1041(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99369 + "'", int19 == 99369);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432224835), 585076000, (-432228709), (-432820704), 1487490903, (-432230311) });
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432227913));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "24) test1043(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1093629551) + "'", int6 == (-1093629551));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "12) test1043(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432202561) + "'", int8 == (-432202561));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer1.makeChild((-432220375));
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        int int15 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = (-432232235);
        java.lang.String[] strArray18 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "25) test1045(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2005671535 + "'", int11 == 2005671535);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        java.lang.String[] strArray17 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer0._names = strArray17;
        boolean boolean19 = byteQuadsCanonicalizer0._intern;
        int int20 = byteQuadsCanonicalizer0.hashSeed();
        int int22 = byteQuadsCanonicalizer0.calcHash(153089931);
        byteQuadsCanonicalizer0._longNameOffset = 726667087;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "26) test1046(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-176516100) + "'", int11 == (-176516100));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "13) test1046(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432202507) + "'", int20 == (-432202507));
// flaky "4) test1046(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-282253155) + "'", int22 == (-282253155));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "27) test1047(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 889916693 + "'", int4 == 889916693);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = 27137223;
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "28) test1048(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1325844286) + "'", int6 == (-1325844286));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6784305 + "'", int11 == 6784305);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._longNameOffset = 726679957;
        byteQuadsCanonicalizer0._longNameOffset = (-432213813);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-407901806));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        int int15 = byteQuadsCanonicalizer13._spilloverEnd;
        int int16 = byteQuadsCanonicalizer13.primaryCount();
        int int17 = byteQuadsCanonicalizer13._longNameOffset;
        int int18 = byteQuadsCanonicalizer13._tertiaryStart;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        int int21 = byteQuadsCanonicalizer19._spilloverEnd;
        int int22 = byteQuadsCanonicalizer19._tertiaryShift;
        int int26 = byteQuadsCanonicalizer19.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer19._reportTooManyCollisions();
        int int28 = byteQuadsCanonicalizer19.hashSeed();
        int int29 = byteQuadsCanonicalizer19.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = byteQuadsCanonicalizer19.makeChild((-432230027));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray34 = byteQuadsCanonicalizer33._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        int[] intArray44 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int46 = byteQuadsCanonicalizer35.calcHash(intArray44, 4);
        byteQuadsCanonicalizer35._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer49 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int50 = byteQuadsCanonicalizer49._hashSize;
        byteQuadsCanonicalizer49._count = (byte) 100;
        java.lang.String[] strArray53 = byteQuadsCanonicalizer49._names;
        int[] intArray58 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int60 = byteQuadsCanonicalizer49.calcHash(intArray58, 4);
        byteQuadsCanonicalizer35._hashArea = intArray58;
        byteQuadsCanonicalizer33._hashArea = intArray58;
        java.lang.String str64 = byteQuadsCanonicalizer31.findName(intArray58, (-432226507));
        byteQuadsCanonicalizer13._hashArea = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            int int67 = byteQuadsCanonicalizer0.calcHash(intArray58, (-1654346617));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "29) test1051(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433037209) + "'", int11 == (-433037209));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "14) test1051(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 292800431 + "'", int26 == 292800431);
// flaky "5) test1051(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-432202421) + "'", int28 == (-432202421));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test1051(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1555538689) + "'", int46 == (-1555538689));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test1051(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1555538689) + "'", int60 == (-1555538689));
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int15 = byteQuadsCanonicalizer0.calcHash((-1529115260));
        byteQuadsCanonicalizer0._longNameOffset = (-432229721);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "30) test1053(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1857759875) + "'", int11 == (-1857759875));
// flaky "15) test1053(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1122172338 + "'", int15 == 1122172338);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._longNameOffset = 726679957;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int10 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-202237041);
        byteQuadsCanonicalizer0._intern = true;
        int int16 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._longNameOffset = (-432223195);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "31) test1055(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584820004 + "'", int10 == 584820004);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        java.lang.Class<?> wildcardClass8 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._count = (-1779947825);
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        int int2 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer3.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer3._hashSize = (-432857107);
        int int10 = byteQuadsCanonicalizer3._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        int[] intArray22 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        byteQuadsCanonicalizer11._hashArea = intArray22;
        byteQuadsCanonicalizer3._hashArea = intArray22;
        byteQuadsCanonicalizer0._hashArea = intArray22;
        int[] intArray30 = new int[] { (-432232857), (-432216899) };
        byteQuadsCanonicalizer0._hashArea = intArray30;
        int int32 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
// flaky "32) test1058(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 472548764 + "'", int7 == 472548764);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "16) test1058(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 231823658 + "'", int24 == 231823658);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432232857), (-432216899) });
// flaky "6) test1058(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-432202239) + "'", int32 == (-432202239));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._count = 0;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryStart = 872635325;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "33) test1060(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432202221) + "'", int1 == (-432202221));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-432857107);
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "34) test1061(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432202215) + "'", int1 == (-432202215));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "17) test1061(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432202215) + "'", int3 == (-432202215));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._secondaryStart = (-432211215);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "35) test1062(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432202195) + "'", int1 == (-432202195));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "18) test1062(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432202195) + "'", int3 == (-432202195));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 601297471;
        int int17 = byteQuadsCanonicalizer0.calcHash((-543395630));
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int22 = byteQuadsCanonicalizer0.calcHash(726666781, (-738985040), (-432216425));
        byteQuadsCanonicalizer0._tertiaryStart = 1754150247;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "36) test1063(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2073176141 + "'", int11 == 2073176141);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "19) test1063(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 966931016 + "'", int17 == 966931016);
// flaky "7) test1063(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1930133708) + "'", int22 == (-1930133708));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = (-432230027);
        byteQuadsCanonicalizer0._longNameOffset = 1072045803;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-2023759883);
        int int20 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "37) test1064(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584814406 + "'", int10 == 584814406);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "20) test1064(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432202135) + "'", int12 == (-432202135));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int3 = byteQuadsCanonicalizer0.calcHash((int) (short) 100);
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        int int6 = byteQuadsCanonicalizer0.tertiaryCount();
        int int7 = byteQuadsCanonicalizer0.size();
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "38) test1065(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-433035338) + "'", int3 == (-433035338));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        boolean boolean5 = byteQuadsCanonicalizer1.maybeDirty();
        java.lang.String[] strArray6 = byteQuadsCanonicalizer1._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-2105879442);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.hashSeed();
        int int9 = byteQuadsCanonicalizer7._longNameOffset;
        int int10 = byteQuadsCanonicalizer7.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        byteQuadsCanonicalizer11._spilloverEnd = (byte) 100;
        int int18 = byteQuadsCanonicalizer11._spilloverEnd;
        int int19 = byteQuadsCanonicalizer11.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        java.lang.String[] strArray37 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer20._names = strArray37;
        byteQuadsCanonicalizer11._names = strArray37;
        java.lang.String[] strArray40 = new java.lang.String[] {};
        byteQuadsCanonicalizer11._names = strArray40;
        byteQuadsCanonicalizer7._names = strArray40;
        byteQuadsCanonicalizer0._names = strArray40;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
// flaky "39) test1067(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432202093) + "'", int8 == (-432202093));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "21) test1067(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1409870154) + "'", int31 == (-1409870154));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0.release();
        int int12 = byteQuadsCanonicalizer0.calcHash((-432206583), 513272256);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "40) test1068(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432202085) + "'", int7 == (-432202085));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "22) test1068(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-890274014) + "'", int12 == (-890274014));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._count = 726921598;
        int int12 = byteQuadsCanonicalizer0.calcHash((-937635559));
        int int13 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "41) test1069(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1314981189 + "'", int6 == 1314981189);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "23) test1069(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 774053824 + "'", int12 == 774053824);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._tertiaryStart = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._longNameOffset;
        byteQuadsCanonicalizer19._tertiaryStart = 0;
        boolean boolean23 = byteQuadsCanonicalizer19.maybeDirty();
        byteQuadsCanonicalizer19._spilloverEnd = (-2066636029);
        int int26 = byteQuadsCanonicalizer19.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27.hashSeed();
        int int29 = byteQuadsCanonicalizer27._longNameOffset;
        int int30 = byteQuadsCanonicalizer27.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        byteQuadsCanonicalizer31._spilloverEnd = (byte) 100;
        int int38 = byteQuadsCanonicalizer31._spilloverEnd;
        int int39 = byteQuadsCanonicalizer31.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        byteQuadsCanonicalizer40._count = (byte) 100;
        java.lang.String[] strArray44 = byteQuadsCanonicalizer40._names;
        int[] intArray49 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int51 = byteQuadsCanonicalizer40.calcHash(intArray49, 4);
        java.lang.String[] strArray57 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer40._names = strArray57;
        byteQuadsCanonicalizer31._names = strArray57;
        byteQuadsCanonicalizer27._names = strArray57;
        byteQuadsCanonicalizer19._names = strArray57;
        byteQuadsCanonicalizer0._names = strArray57;
        int int63 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "42) test1071(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 594775306 + "'", int17 == 594775306);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-516659008) + "'", int26 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
// flaky "24) test1071(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-432202063) + "'", int28 == (-432202063));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "8) test1071(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 594775306 + "'", int51 == 594775306);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer0._hashArea = intArray23;
        int int27 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray28 = byteQuadsCanonicalizer0._names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = byteQuadsCanonicalizer0.findName(562124991, (-1913692398));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1937614177 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "43) test1073(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 584230741 + "'", int11 == 584230741);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "25) test1073(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 584230741 + "'", int25 == 584230741);
// flaky "9) test1073(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432202047) + "'", int27 == (-432202047));
        org.junit.Assert.assertNull(strArray28);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432231821));
        int int2 = byteQuadsCanonicalizer1._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432214951));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray2 = byteQuadsCanonicalizer1._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer3._hashSize;
        byteQuadsCanonicalizer3._count = (byte) 100;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer3._names;
        int[] intArray12 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int14 = byteQuadsCanonicalizer3.calcHash(intArray12, 4);
        byteQuadsCanonicalizer3._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        int[] intArray26 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int28 = byteQuadsCanonicalizer17.calcHash(intArray26, 4);
        byteQuadsCanonicalizer3._hashArea = intArray26;
        byteQuadsCanonicalizer1._hashArea = intArray26;
        int int31 = byteQuadsCanonicalizer1.spilloverCount();
        boolean boolean32 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "44) test1076(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-478228329) + "'", int14 == (-478228329));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "26) test1076(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-478228329) + "'", int28 == (-478228329));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0._count;
        java.lang.Class<?> wildcardClass6 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        int int13 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "45) test1078(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584817196 + "'", int10 == 584817196);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "27) test1078(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432201949) + "'", int12 == (-432201949));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = 1791970984;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = 850815938;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        boolean boolean14 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "46) test1079(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433035627) + "'", int5 == (-433035627));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "28) test1079(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432201927) + "'", int10 == (-432201927));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0.primaryCount();
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._hashSize = 1859293132;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432223437));
        java.lang.String[] strArray16 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "47) test1081(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432201887) + "'", int1 == (-432201887));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "29) test1081(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432201887) + "'", int3 == (-432201887));
// flaky "10) test1081(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726467701 + "'", int8 == 726467701);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "2) test1081(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 119886 + "'", int15 == 119886);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        java.lang.String[] strArray12 = null;
        byteQuadsCanonicalizer0._names = strArray12;
        byteQuadsCanonicalizer0._tertiaryShift = (-432220191);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "48) test1082(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433035697) + "'", int11 == (-433035697));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer16);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "49) test1083(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432201861) + "'", int1 == (-432201861));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        int int6 = byteQuadsCanonicalizer1.calcHash(586131556, (-432227289));
        int int7 = byteQuadsCanonicalizer1.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-858580259) + "'", int6 == (-858580259));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-316328391) + "'", int7 == (-316328391));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        byteQuadsCanonicalizer0._tertiaryShift = 100;
        int int16 = byteQuadsCanonicalizer0.calcHash((-432228903), 1391350493, (-432227289));
        java.lang.String[] strArray17 = byteQuadsCanonicalizer0._names;
        int int18 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "50) test1086(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1196594881 + "'", int6 == 1196594881);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "30) test1086(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1235790429) + "'", int16 == (-1235790429));
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        int[] intArray8 = byteQuadsCanonicalizer0._hashArea;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(967004677);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._secondaryStart = (-432858399);
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        int int12 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = 8570;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "51) test1089(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432201771) + "'", int1 == (-432201771));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1776808604) + "'", int12 == (-1776808604));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432203729));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 3846;
        int int12 = byteQuadsCanonicalizer0.calcHash(797454223);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "52) test1092(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-910597768) + "'", int12 == (-910597768));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._tertiaryShift = 726740410;
        int int10 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._hashSize = (-1010728234);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "53) test1093(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433035865) + "'", int5 == (-433035865));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-1942409570));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "54) test1095(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2071375474 + "'", int4 == 2071375474);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432222723));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "55) test1097(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432201603) + "'", int4 == (-432201603));
// flaky "31) test1097(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850569248 + "'", int7 == 850569248);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(873049829);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild(1754387191);
        byteQuadsCanonicalizer0._longNameOffset = 1772192179;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-198368878) + "'", int8 == (-198368878));
// flaky "56) test1099(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432201587) + "'", int9 == (-432201587));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "57) test1100(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432201573) + "'", int1 == (-432201573));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer5);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        int int8 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._secondaryStart = (-432858451);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "58) test1101(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432201567) + "'", int4 == (-432201567));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432231765));
        int int2 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        byteQuadsCanonicalizer0._intern = false;
        int int17 = byteQuadsCanonicalizer0.calcHash((-432225413));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "59) test1103(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-929264281) + "'", int11 == (-929264281));
// flaky "32) test1103(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 123859 + "'", int17 == 123859);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432215459));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer1.makeChild((-432231575));
        int int14 = byteQuadsCanonicalizer13._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1373664638 + "'", int11 == 1373664638);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(726691972);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        int int9 = byteQuadsCanonicalizer0._hashSize;
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432223467);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "60) test1107(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432201509) + "'", int4 == (-432201509));
// flaky "33) test1107(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850563740 + "'", int7 == 850563740);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1122192358);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        int int7 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "61) test1109(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432201383) + "'", int1 == (-432201383));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432215719);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "62) test1110(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432201375) + "'", int1 == (-432201375));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        int int12 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "63) test1111(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432201365) + "'", int1 == (-432201365));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "34) test1111(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432201365) + "'", int3 == (-432201365));
// flaky "11) test1111(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726472543 + "'", int8 == 726472543);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        boolean boolean12 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._count = 726770920;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer0.makeChild(24041);
        byteQuadsCanonicalizer16._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "64) test1112(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433036255) + "'", int11 == (-433036255));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int[] intArray1 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234527));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._hashSize = (-432227101);
        int int8 = byteQuadsCanonicalizer0.calcHash(726715588);
        int int10 = byteQuadsCanonicalizer0.calcHash((-1799852163));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "65) test1115(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-849187787) + "'", int8 == (-849187787));
// flaky "35) test1115(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1921181969 + "'", int10 == 1921181969);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1789185047);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        int int5 = byteQuadsCanonicalizer1._spilloverEnd;
        int int6 = byteQuadsCanonicalizer1._hashSize;
        int int10 = byteQuadsCanonicalizer1.calcHash((-432213359), 726799855, 442694019);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432807221) + "'", int4 == (-432807221));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1025074909 + "'", int10 == 1025074909);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer0.makeChild(0);
        int int14 = byteQuadsCanonicalizer13._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "66) test1118(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1762920574 + "'", int7 == 1762920574);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "36) test1118(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432201231) + "'", int9 == (-432201231));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(850855124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(584769253);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer8.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer8._hashSize = (-432857107);
        int int15 = byteQuadsCanonicalizer8._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        int[] intArray27 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int29 = byteQuadsCanonicalizer18.calcHash(intArray27, 4);
        byteQuadsCanonicalizer16._hashArea = intArray27;
        byteQuadsCanonicalizer8._hashArea = intArray27;
        byteQuadsCanonicalizer0._hashArea = intArray27;
        int int33 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean34 = byteQuadsCanonicalizer0.maybeDirty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=726770920, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", 900086368, 584761819, 102773028);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 675252847 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "67) test1121(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1793823882 + "'", int12 == 1793823882);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "37) test1121(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-68413005) + "'", int29 == (-68413005));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0.spilloverCount();
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int9 = byteQuadsCanonicalizer0.calcHash((-432228403), (-432229283), (-432226983));
        byteQuadsCanonicalizer0._longNameOffset = (-432225783);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "68) test1123(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 839069908 + "'", int9 == 839069908);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int8 = byteQuadsCanonicalizer0.calcHash((-432228293));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        int int11 = byteQuadsCanonicalizer9._spilloverEnd;
        int int12 = byteQuadsCanonicalizer9._longNameOffset;
        byteQuadsCanonicalizer9._count = ' ';
        int[] intArray15 = byteQuadsCanonicalizer9._hashArea;
        int int16 = byteQuadsCanonicalizer9._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        java.lang.String str22 = byteQuadsCanonicalizer17.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = byteQuadsCanonicalizer17._parent;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer17._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer25.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer25._hashSize = (-432857107);
        int int32 = byteQuadsCanonicalizer25._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int34 = byteQuadsCanonicalizer33.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        int[] intArray44 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int46 = byteQuadsCanonicalizer35.calcHash(intArray44, 4);
        byteQuadsCanonicalizer33._hashArea = intArray44;
        byteQuadsCanonicalizer25._hashArea = intArray44;
        byteQuadsCanonicalizer17._hashArea = intArray44;
        byteQuadsCanonicalizer9._hashArea = intArray44;
        // The following exception was thrown during execution in test generation
        try {
            int int52 = byteQuadsCanonicalizer0.calcHash(intArray44, (-1574754311));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "69) test1124(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433034381) + "'", int5 == (-433034381));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "38) test1124(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 105076 + "'", int8 == 105076);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str22, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
// flaky "12) test1124(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1804443095 + "'", int29 == 1804443095);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "3) test1124(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 325915617 + "'", int46 == 325915617);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer1.makeChild((-432811187));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer8.makeChild(586131826);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryShift = 586080877;
        byteQuadsCanonicalizer0._spilloverEnd = (-1446089868);
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        java.lang.Class<?> wildcardClass12 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        int int13 = byteQuadsCanonicalizer9.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer14._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        byteQuadsCanonicalizer14._hashArea = intArray37;
        byteQuadsCanonicalizer9._hashArea = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = byteQuadsCanonicalizer0.calcHash(intArray37, (-743258544));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "70) test1127(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432201089) + "'", int4 == (-432201089));
// flaky "39) test1127(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850555730 + "'", int7 == 850555730);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "13) test1127(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2003578918 + "'", int25 == 2003578918);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "4) test1127(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2003578918 + "'", int39 == 2003578918);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(726566431);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        byteQuadsCanonicalizer0._spilloverEnd = (-432858953);
        int int10 = byteQuadsCanonicalizer0.totalCount();
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._count = (-432216049);
        byteQuadsCanonicalizer0._secondaryStart = (-432221561);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-108214739) + "'", int11 == (-108214739));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432233457));
        byteQuadsCanonicalizer1._tertiaryShift = 726715588;
        int int4 = byteQuadsCanonicalizer1.size();
        int int5 = byteQuadsCanonicalizer1.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432233457) + "'", int5 == (-432233457));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432226983));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0.release();
        java.lang.String[] strArray12 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        int[] intArray22 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "71) test1132(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1864939758) + "'", int6 == (-1864939758));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "40) test1132(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 970224245 + "'", int24 == 970224245);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean10 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild((-432231971));
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        byteQuadsCanonicalizer0._tertiaryShift = 100;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432231413), 726920401);
        java.lang.String[] strArray16 = byteQuadsCanonicalizer0._names;
        int int17 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "72) test1135(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1846064292) + "'", int6 == (-1846064292));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "41) test1135(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 800534482 + "'", int15 == 800534482);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(850815938);
        int int2 = byteQuadsCanonicalizer1.primaryCount();
        int int3 = byteQuadsCanonicalizer1.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4._hashSize;
        java.lang.String str6 = byteQuadsCanonicalizer4.toString();
        byteQuadsCanonicalizer4._tertiaryShift = 850855124;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        byteQuadsCanonicalizer4._hashArea = intArray18;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = byteQuadsCanonicalizer1.calcHash(intArray18, 500457310);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "73) test1136(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1538575890) + "'", int20 == (-1538575890));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432231459);
        int int16 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._hashSize = 726645739;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "74) test1137(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1902208120 + "'", int11 == 1902208120);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = (-1529115260);
        byteQuadsCanonicalizer0._intern = true;
        int int14 = byteQuadsCanonicalizer0.calcHash((-182439848));
        int int15 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "75) test1138(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1785842435) + "'", int6 == (-1785842435));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
// flaky "42) test1138(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 320608038 + "'", int14 == 320608038);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean11 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0.release();
        int int13 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "76) test1139(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2091946329 + "'", int7 == 2091946329);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "43) test1139(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432200809) + "'", int9 == (-432200809));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-432857107);
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "77) test1140(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200789) + "'", int1 == (-432200789));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "44) test1140(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432200789) + "'", int3 == (-432200789));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        java.lang.String[] strArray12 = null;
        byteQuadsCanonicalizer0._names = strArray12;
        byteQuadsCanonicalizer0._tertiaryShift = (-432220191);
        int int16 = byteQuadsCanonicalizer0._longNameOffset;
        int int17 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-432212571);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "78) test1141(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433034773) + "'", int11 == (-433034773));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryStart = (-432228391);
        boolean boolean14 = byteQuadsCanonicalizer0._intern;
        int int15 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "79) test1142(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200729) + "'", int1 == (-432200729));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "45) test1142(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432200729) + "'", int3 == (-432200729));
// flaky "14) test1142(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726477475 + "'", int8 == 726477475);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(13360056);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "80) test1144(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432200693) + "'", int6 == (-432200693));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-198368878));
        int int2 = byteQuadsCanonicalizer1._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._spilloverEnd;
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        boolean boolean7 = byteQuadsCanonicalizer1._failOnDoS;
        int[] intArray8 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1.release();
        byteQuadsCanonicalizer1._secondaryStart = (-2138635169);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(58232367);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = 1081706716;
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1200382541));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.hashSeed();
        int int7 = byteQuadsCanonicalizer3.calcHash((-432821224), (-432219089));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        int int13 = byteQuadsCanonicalizer9.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer14._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        byteQuadsCanonicalizer14._hashArea = intArray37;
        byteQuadsCanonicalizer9._hashArea = intArray37;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = byteQuadsCanonicalizer3.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", intArray37, 106348);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432858451) + "'", int4 == (-432858451));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 494035670 + "'", int7 == 494035670);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "81) test1152(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2110089694 + "'", int25 == 2110089694);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "46) test1152(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2110089694 + "'", int39 == 2110089694);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._longNameOffset = 726775456;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        int int3 = byteQuadsCanonicalizer0._tertiaryStart;
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._count = (-432220869);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "82) test1154(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200495) + "'", int1 == (-432200495));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-202237041);
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "83) test1155(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433035017) + "'", int5 == (-433035017));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        byteQuadsCanonicalizer0._tertiaryStart = (-432230135);
        int int9 = byteQuadsCanonicalizer0.totalCount();
        int int12 = byteQuadsCanonicalizer0.calcHash((-849176249), 1158871334);
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "84) test1156(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 316107501 + "'", int12 == 316107501);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = 64;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        int[] intArray8 = null;
        byteQuadsCanonicalizer0._hashArea = intArray8;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray7);
// flaky "85) test1157(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432200443) + "'", int10 == (-432200443));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        int int12 = byteQuadsCanonicalizer0.calcHash((int) (byte) 0, (-186803919));
        boolean boolean13 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "86) test1158(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1277701) + "'", int12 == (-1277701));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.size();
        int int7 = byteQuadsCanonicalizer3.calcHash((-432807290), 1794842379);
        byteQuadsCanonicalizer3._hashSize = (-432233335);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer3._parent;
        java.lang.String str11 = byteQuadsCanonicalizer10.toString();
        int int12 = byteQuadsCanonicalizer10._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-202237041) + "'", int7 == (-202237041));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "87) test1160(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432200413) + "'", int6 == (-432200413));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.totalCount();
        int int12 = byteQuadsCanonicalizer0.calcHash((int) (byte) 0, (-186803919));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0.makeChild((-432228815));
        int int15 = byteQuadsCanonicalizer14._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "88) test1161(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1281769) + "'", int12 == (-1281769));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = 1791970984;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = 850815938;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0._parent;
        int int15 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "89) test1162(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433035159) + "'", int5 == (-433035159));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "47) test1162(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432200371) + "'", int10 == (-432200371));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer14);
// flaky "15) test1162(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432200371) + "'", int15 == (-432200371));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = 0;
        int int7 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "90) test1163(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200361) + "'", int1 == (-432200361));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._spilloverEnd = (-432237359);
        int int7 = byteQuadsCanonicalizer0.calcHash(726921598);
        int int9 = byteQuadsCanonicalizer0.calcHash((-430186399));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "91) test1164(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-849119371) + "'", int7 == (-849119371));
// flaky "48) test1164(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6734792 + "'", int9 == 6734792);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._spilloverEnd = (-432819249);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        int int8 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "92) test1166(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1681070459 + "'", int4 == 1681070459);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432857107) + "'", int8 == (-432857107));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(850815938);
        int int2 = byteQuadsCanonicalizer1.primaryCount();
        int int3 = byteQuadsCanonicalizer1.spilloverCount();
        int int4 = byteQuadsCanonicalizer1._spilloverEnd;
        int int5 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432232965));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0.calcHash((-2023759883), 1073894391);
        byteQuadsCanonicalizer0._spilloverEnd = (-827237719);
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "93) test1170(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200263) + "'", int1 == (-432200263));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "49) test1170(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1042880351 + "'", int5 == 1042880351);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = 1791970984;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = 850815938;
        int int13 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean14 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "94) test1171(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433033245) + "'", int5 == (-433033245));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "50) test1171(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432200249) + "'", int10 == (-432200249));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._longNameOffset;
        byteQuadsCanonicalizer19._tertiaryStart = 0;
        boolean boolean23 = byteQuadsCanonicalizer19.maybeDirty();
        byteQuadsCanonicalizer19._spilloverEnd = (-2066636029);
        int int26 = byteQuadsCanonicalizer19.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27.hashSeed();
        int int29 = byteQuadsCanonicalizer27._longNameOffset;
        int int30 = byteQuadsCanonicalizer27.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        byteQuadsCanonicalizer31._spilloverEnd = (byte) 100;
        int int38 = byteQuadsCanonicalizer31._spilloverEnd;
        int int39 = byteQuadsCanonicalizer31.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        byteQuadsCanonicalizer40._count = (byte) 100;
        java.lang.String[] strArray44 = byteQuadsCanonicalizer40._names;
        int[] intArray49 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int51 = byteQuadsCanonicalizer40.calcHash(intArray49, 4);
        java.lang.String[] strArray57 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer40._names = strArray57;
        byteQuadsCanonicalizer31._names = strArray57;
        byteQuadsCanonicalizer27._names = strArray57;
        byteQuadsCanonicalizer19._names = strArray57;
        byteQuadsCanonicalizer0._names = strArray57;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer63 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "95) test1172(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2030349562) + "'", int17 == (-2030349562));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-516659008) + "'", int26 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
// flaky "51) test1172(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-432200241) + "'", int28 == (-432200241));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "16) test1172(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-2030349562) + "'", int51 == (-2030349562));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNull(byteQuadsCanonicalizer63);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = (-432235313);
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = byteQuadsCanonicalizer9._intern;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "96) test1173(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432200223) + "'", int8 == (-432200223));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._count = (-458135483);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "97) test1174(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200215) + "'", int1 == (-432200215));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._secondaryStart = 1427773297;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "98) test1175(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1580659405 + "'", int7 == 1580659405);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0.calcHash(726732643, 950858184);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
        int int13 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432202403);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "99) test1176(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 114342 + "'", int6 == 114342);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "52) test1176(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1217040235 + "'", int10 == 1217040235);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "100) test1177(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1019656071 + "'", int6 == 1019656071);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "101) test1178(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200149) + "'", int1 == (-432200149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0.spilloverCount();
        int int15 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "102) test1179(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584597326 + "'", int10 == 584597326);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "53) test1179(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432200131) + "'", int12 == (-432200131));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432237891) + "'", int15 == (-432237891));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild((-432201079));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer7._names = strArray24;
        byteQuadsCanonicalizer0._names = strArray24;
        byteQuadsCanonicalizer0.release();
        java.lang.String[] strArray28 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-432215327);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "103) test1181(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200095) + "'", int1 == (-432200095));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "54) test1181(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-906998053) + "'", int18 == (-906998053));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer8.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer8._hashSize = (-432857107);
        int int15 = byteQuadsCanonicalizer8._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        int[] intArray27 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int29 = byteQuadsCanonicalizer18.calcHash(intArray27, 4);
        byteQuadsCanonicalizer16._hashArea = intArray27;
        byteQuadsCanonicalizer8._hashArea = intArray27;
        byteQuadsCanonicalizer0._hashArea = intArray27;
        int int33 = byteQuadsCanonicalizer0._hashSize;
        boolean boolean34 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "104) test1182(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1257672196 + "'", int12 == 1257672196);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "55) test1182(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-448237676) + "'", int29 == (-448237676));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int int5 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int11 = byteQuadsCanonicalizer0.calcHash(1188658082);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "105) test1184(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200053) + "'", int1 == (-432200053));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "56) test1184(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432200053) + "'", int3 == (-432200053));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "17) test1184(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1594953662) + "'", int11 == (-1594953662));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        byteQuadsCanonicalizer0._count = (byte) -1;
        boolean boolean9 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "106) test1185(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-514782120) + "'", int6 == (-514782120));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "107) test1186(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432200017) + "'", int1 == (-432200017));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        int int2 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer3.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer3._hashSize = (-432857107);
        int int10 = byteQuadsCanonicalizer3._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        int[] intArray22 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        byteQuadsCanonicalizer11._hashArea = intArray22;
        byteQuadsCanonicalizer3._hashArea = intArray22;
        byteQuadsCanonicalizer0._hashArea = intArray22;
        byteQuadsCanonicalizer0._tertiaryShift = 584808079;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
// flaky "108) test1187(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1142725301 + "'", int7 == 1142725301);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "57) test1187(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1712541627) + "'", int24 == (-1712541627));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer3.primaryCount();
        int int10 = byteQuadsCanonicalizer3.secondaryCount();
        java.lang.String str13 = byteQuadsCanonicalizer3.findName((-432221393), (-432211329));
        int int14 = byteQuadsCanonicalizer3._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-2050116369));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235137));
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = byteQuadsCanonicalizer1.findName(intArray2, (-432215111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        int[] intArray19 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int21 = byteQuadsCanonicalizer10.calcHash(intArray19, 4);
        byteQuadsCanonicalizer8._hashArea = intArray19;
        byteQuadsCanonicalizer0._hashArea = intArray19;
        int int24 = byteQuadsCanonicalizer0._secondaryStart;
        int int25 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "109) test1191(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1348142185 + "'", int4 == 1348142185);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "58) test1191(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-597450254) + "'", int21 == (-597450254));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-432857107) + "'", int25 == (-432857107));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        byteQuadsCanonicalizer0._hashArea = intArray11;
        int int15 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432821314), 1388163119, (-432202013));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1453402229 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "110) test1192(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1558242898 + "'", int13 == 1558242898);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer16);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1979216242);
        boolean boolean2 = byteQuadsCanonicalizer1._failOnDoS;
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        java.lang.String str11 = byteQuadsCanonicalizer9.findName((-2105879442));
        int int12 = byteQuadsCanonicalizer9._count;
        byteQuadsCanonicalizer9._reportTooManyCollisions();
        byteQuadsCanonicalizer9._count = (-307302569);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int[] intArray5 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "111) test1195(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432199863) + "'", int4 == (-432199863));
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (-432225413);
        int int12 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        int int2 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._tertiaryShift = 1752546028;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._tertiaryShift = (-432215427);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.totalCount();
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        int int5 = byteQuadsCanonicalizer1._spilloverEnd;
        int int6 = byteQuadsCanonicalizer1._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432807221) + "'", int4 == (-432807221));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        byteQuadsCanonicalizer0._count = (-432232441);
        byteQuadsCanonicalizer0._tertiaryStart = (-432225773);
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0.calcHash(726812095, (-432228893));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        int int11 = byteQuadsCanonicalizer0.calcHash(2017327165);
        int int13 = byteQuadsCanonicalizer0.calcHash((-1742721349));
        int int14 = byteQuadsCanonicalizer0._tertiaryStart;
        int int15 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "112) test1202(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 595846630 + "'", int8 == 595846630);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer9);
// flaky "59) test1202(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1643602439) + "'", int11 == (-1643602439));
// flaky "18) test1202(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2115659357 + "'", int13 == 2115659357);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._count;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "113) test1203(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432199717) + "'", int4 == (-432199717));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._count = 595210654;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer0.makeChild((-432229659));
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "114) test1204(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432199687) + "'", int1 == (-432199687));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._intern = false;
        int[] intArray13 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "115) test1205(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-724312429) + "'", int7 == (-724312429));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "60) test1205(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432199679) + "'", int9 == (-432199679));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-2082617046));
        int int11 = byteQuadsCanonicalizer10.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray6 = byteQuadsCanonicalizer4._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.hashSeed();
        int int9 = byteQuadsCanonicalizer7._longNameOffset;
        int int10 = byteQuadsCanonicalizer7._longNameOffset;
        boolean boolean11 = byteQuadsCanonicalizer7._intern;
        int int12 = byteQuadsCanonicalizer7._secondaryStart;
        int int13 = byteQuadsCanonicalizer7._secondaryStart;
        int int14 = byteQuadsCanonicalizer7._tertiaryShift;
        byteQuadsCanonicalizer7.release();
        int int16 = byteQuadsCanonicalizer7._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer17._hashSize;
        byteQuadsCanonicalizer17._count = (byte) 100;
        java.lang.String[] strArray21 = byteQuadsCanonicalizer17._names;
        java.lang.String str22 = byteQuadsCanonicalizer17.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._hashSize;
        byteQuadsCanonicalizer23._count = (byte) 100;
        java.lang.String[] strArray27 = byteQuadsCanonicalizer23._names;
        int[] intArray32 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int34 = byteQuadsCanonicalizer23.calcHash(intArray32, 4);
        byteQuadsCanonicalizer17._hashArea = intArray32;
        byteQuadsCanonicalizer7._hashArea = intArray32;
        java.lang.String str38 = byteQuadsCanonicalizer4.findName(intArray32, (-2050116369));
        byteQuadsCanonicalizer4._longNameOffset = 726812095;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "116) test1207(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432199597) + "'", int1 == (-432199597));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
// flaky "61) test1207(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432199597) + "'", int8 == (-432199597));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str22, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "19) test1207(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1208048082) + "'", int34 == (-1208048082));
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer1.makeChild((-432220375));
        int[] intArray5 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "117) test1209(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-768124567) + "'", int7 == (-768124567));
// flaky "62) test1209(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432199573) + "'", int9 == (-432199573));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._count = (byte) 100;
        java.lang.String[] strArray12 = byteQuadsCanonicalizer8._names;
        int[] intArray17 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int19 = byteQuadsCanonicalizer8.calcHash(intArray17, 4);
        byteQuadsCanonicalizer8._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        int[] intArray31 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int33 = byteQuadsCanonicalizer22.calcHash(intArray31, 4);
        byteQuadsCanonicalizer8._hashArea = intArray31;
        byteQuadsCanonicalizer1._hashArea = intArray31;
        int int36 = byteQuadsCanonicalizer1.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37._hashSize;
        byteQuadsCanonicalizer37._count = (byte) 100;
        java.lang.String[] strArray41 = byteQuadsCanonicalizer37._names;
        int[] intArray46 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int48 = byteQuadsCanonicalizer37.calcHash(intArray46, 4);
        byteQuadsCanonicalizer37._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer51 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int52 = byteQuadsCanonicalizer51.hashSeed();
        java.lang.String[] strArray53 = byteQuadsCanonicalizer51._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer55 = byteQuadsCanonicalizer51.makeChild(1081706716);
        int int56 = byteQuadsCanonicalizer55.primaryCount();
        int[] intArray57 = byteQuadsCanonicalizer55._hashArea;
        byteQuadsCanonicalizer37._hashArea = intArray57;
        // The following exception was thrown during execution in test generation
        try {
            int int60 = byteQuadsCanonicalizer1.calcHash(intArray57, (-569244038));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "118) test1210(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 608152716 + "'", int19 == 608152716);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "63) test1210(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 608152716 + "'", int33 == 608152716);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "20) test1210(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 608152716 + "'", int48 == 608152716);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer51);
// flaky "5) test1210(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-432199559) + "'", int52 == (-432199559));
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(intArray57);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._count = 770249287;
        int[] intArray5 = byteQuadsCanonicalizer0._hashArea;
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean7 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String str11 = byteQuadsCanonicalizer3.findName(797443144);
        int int13 = byteQuadsCanonicalizer3.calcHash((-432232669));
        int int14 = byteQuadsCanonicalizer3.tertiaryCount();
        byteQuadsCanonicalizer3._spilloverEnd = 1567547600;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1031526 + "'", int13 == 1031526);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._hashSize = 726920401;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        int int14 = byteQuadsCanonicalizer0.calcHash((-1009984784), 1476442465, 1019656071);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-198368878) + "'", int8 == (-198368878));
// flaky "119) test1213(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432199537) + "'", int9 == (-432199537));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "64) test1213(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1304827299) + "'", int14 == (-1304827299));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432804524));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer13._hashSize = (short) 10;
        int int16 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        byteQuadsCanonicalizer19._spilloverEnd = (byte) 100;
        int int26 = byteQuadsCanonicalizer19._spilloverEnd;
        int int27 = byteQuadsCanonicalizer19.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        java.lang.String[] strArray45 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer28._names = strArray45;
        byteQuadsCanonicalizer19._names = strArray45;
        java.lang.String[] strArray48 = new java.lang.String[] {};
        byteQuadsCanonicalizer19._names = strArray48;
        byteQuadsCanonicalizer13._names = strArray48;
        byteQuadsCanonicalizer11._names = strArray48;
        byteQuadsCanonicalizer9._names = strArray48;
        byteQuadsCanonicalizer0._names = strArray48;
        byteQuadsCanonicalizer0._longNameOffset = 585022189;
        int int56 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "120) test1214(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-400658953) + "'", int39 == (-400658953));
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String str7 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str7, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0.primaryCount();
        int int8 = byteQuadsCanonicalizer0.hashSeed();
        int int9 = byteQuadsCanonicalizer0._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "121) test1216(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-888150736) + "'", int4 == (-888150736));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "65) test1216(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432199485) + "'", int8 == (-432199485));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        int int11 = byteQuadsCanonicalizer0.bucketCount();
        int int12 = byteQuadsCanonicalizer0.tertiaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0.makeChild(1312822398);
        byteQuadsCanonicalizer0._longNameOffset = 117015;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "122) test1217(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-695659168) + "'", int7 == (-695659168));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        boolean boolean12 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-432214127);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "123) test1218(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433033991) + "'", int11 == (-433033991));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        int int12 = byteQuadsCanonicalizer0.size();
        int int14 = byteQuadsCanonicalizer0.calcHash(0);
        java.lang.String[] strArray15 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "124) test1219(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-433034046) + "'", int14 == (-433034046));
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432208889));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild((-580650583));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = byteQuadsCanonicalizer0.findName(1859293132, 585148675);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1732070813 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432235879);
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        byteQuadsCanonicalizer1._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(2132657041);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        int int15 = byteQuadsCanonicalizer0.hashSeed();
        int int16 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "125) test1226(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-565358909) + "'", int11 == (-565358909));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "66) test1226(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432199247) + "'", int15 == (-432199247));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432820422));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        int int14 = byteQuadsCanonicalizer0.calcHash((-432220925), (-1339528678));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "126) test1228(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432199231) + "'", int1 == (-432199231));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "67) test1228(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432199231) + "'", int3 == (-432199231));
// flaky "21) test1228(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726490687 + "'", int8 == 726490687);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "6) test1228(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1301187629 + "'", int14 == 1301187629);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer0._parent;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = 726703924;
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        int int12 = byteQuadsCanonicalizer0._spilloverEnd;
        int int13 = byteQuadsCanonicalizer0.bucketCount();
        int int14 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "127) test1230(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1371529767) + "'", int7 == (-1371529767));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 726703924 + "'", int12 == 726703924);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._spilloverEnd = 64;
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._spilloverEnd = (-432218051);
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = (-432208717);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "128) test1232(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432199163) + "'", int4 == (-432199163));
// flaky "68) test1232(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850538117 + "'", int7 == 850538117);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235817));
        byteQuadsCanonicalizer1._hashSize = (-86011045);
        int int4 = byteQuadsCanonicalizer1.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild(103036);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._hashSize = 1081706716;
        int[] intArray11 = byteQuadsCanonicalizer0._hashArea;
        int int12 = byteQuadsCanonicalizer0.bucketCount();
        java.lang.String[] strArray13 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1081706716 + "'", int12 == 1081706716);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 3846;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._longNameOffset;
        byteQuadsCanonicalizer12._tertiaryStart = 0;
        boolean boolean16 = byteQuadsCanonicalizer12.maybeDirty();
        byteQuadsCanonicalizer12._spilloverEnd = (-2066636029);
        int int19 = byteQuadsCanonicalizer12.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20.hashSeed();
        int int22 = byteQuadsCanonicalizer20._longNameOffset;
        int int23 = byteQuadsCanonicalizer20.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        byteQuadsCanonicalizer24._count = (byte) 100;
        java.lang.String[] strArray28 = byteQuadsCanonicalizer24._names;
        byteQuadsCanonicalizer24._spilloverEnd = (byte) 100;
        int int31 = byteQuadsCanonicalizer24._spilloverEnd;
        int int32 = byteQuadsCanonicalizer24.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int34 = byteQuadsCanonicalizer33._hashSize;
        byteQuadsCanonicalizer33._count = (byte) 100;
        java.lang.String[] strArray37 = byteQuadsCanonicalizer33._names;
        int[] intArray42 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int44 = byteQuadsCanonicalizer33.calcHash(intArray42, 4);
        java.lang.String[] strArray50 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer33._names = strArray50;
        byteQuadsCanonicalizer24._names = strArray50;
        byteQuadsCanonicalizer20._names = strArray50;
        byteQuadsCanonicalizer12._names = strArray50;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer55 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int56 = byteQuadsCanonicalizer55._hashSize;
        byteQuadsCanonicalizer55._count = (byte) 100;
        java.lang.String[] strArray59 = byteQuadsCanonicalizer55._names;
        byteQuadsCanonicalizer55._spilloverEnd = (byte) 100;
        int int62 = byteQuadsCanonicalizer55._spilloverEnd;
        int int63 = byteQuadsCanonicalizer55.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer64 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int65 = byteQuadsCanonicalizer64._hashSize;
        byteQuadsCanonicalizer64._count = (byte) 100;
        java.lang.String[] strArray68 = byteQuadsCanonicalizer64._names;
        int[] intArray73 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int75 = byteQuadsCanonicalizer64.calcHash(intArray73, 4);
        java.lang.String[] strArray81 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer64._names = strArray81;
        byteQuadsCanonicalizer55._names = strArray81;
        byteQuadsCanonicalizer12._names = strArray81;
        byteQuadsCanonicalizer0._names = strArray81;
        int[] intArray86 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._tertiaryStart = (-432216365);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-516659008) + "'", int19 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
// flaky "129) test1235(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-432199121) + "'", int21 == (-432199121));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "69) test1235(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 576393132 + "'", int44 == 576393132);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(strArray59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "22) test1235(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 576393132 + "'", int75 == 576393132);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNull(intArray86);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 3846;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._longNameOffset;
        byteQuadsCanonicalizer12._tertiaryStart = 0;
        boolean boolean16 = byteQuadsCanonicalizer12.maybeDirty();
        byteQuadsCanonicalizer12._spilloverEnd = (-2066636029);
        int int19 = byteQuadsCanonicalizer12.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20.hashSeed();
        int int22 = byteQuadsCanonicalizer20._longNameOffset;
        int int23 = byteQuadsCanonicalizer20.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        byteQuadsCanonicalizer24._count = (byte) 100;
        java.lang.String[] strArray28 = byteQuadsCanonicalizer24._names;
        byteQuadsCanonicalizer24._spilloverEnd = (byte) 100;
        int int31 = byteQuadsCanonicalizer24._spilloverEnd;
        int int32 = byteQuadsCanonicalizer24.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer33 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int34 = byteQuadsCanonicalizer33._hashSize;
        byteQuadsCanonicalizer33._count = (byte) 100;
        java.lang.String[] strArray37 = byteQuadsCanonicalizer33._names;
        int[] intArray42 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int44 = byteQuadsCanonicalizer33.calcHash(intArray42, 4);
        java.lang.String[] strArray50 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer33._names = strArray50;
        byteQuadsCanonicalizer24._names = strArray50;
        byteQuadsCanonicalizer20._names = strArray50;
        byteQuadsCanonicalizer12._names = strArray50;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer55 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int56 = byteQuadsCanonicalizer55._hashSize;
        byteQuadsCanonicalizer55._count = (byte) 100;
        java.lang.String[] strArray59 = byteQuadsCanonicalizer55._names;
        byteQuadsCanonicalizer55._spilloverEnd = (byte) 100;
        int int62 = byteQuadsCanonicalizer55._spilloverEnd;
        int int63 = byteQuadsCanonicalizer55.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer64 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int65 = byteQuadsCanonicalizer64._hashSize;
        byteQuadsCanonicalizer64._count = (byte) 100;
        java.lang.String[] strArray68 = byteQuadsCanonicalizer64._names;
        int[] intArray73 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int75 = byteQuadsCanonicalizer64.calcHash(intArray73, 4);
        java.lang.String[] strArray81 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer64._names = strArray81;
        byteQuadsCanonicalizer55._names = strArray81;
        byteQuadsCanonicalizer12._names = strArray81;
        byteQuadsCanonicalizer0._names = strArray81;
        int int87 = byteQuadsCanonicalizer0.calcHash((-432234053));
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-516659008) + "'", int19 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
// flaky "130) test1236(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-432199105) + "'", int21 == (-432199105));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "70) test1236(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1577630409) + "'", int44 == (-1577630409));
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(strArray59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "23) test1236(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1577630409) + "'", int75 == (-1577630409));
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "7) test1236(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int87 + "' != '" + 101277 + "'", int87 == 101277);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int4 = byteQuadsCanonicalizer1.calcHash((-432235817));
        byteQuadsCanonicalizer1._tertiaryStart = (-432225485);
        int int7 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432807221) + "'", int4 == (-432807221));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryShift = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-791207515));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        int[] intArray19 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int21 = byteQuadsCanonicalizer10.calcHash(intArray19, 4);
        byteQuadsCanonicalizer8._hashArea = intArray19;
        byteQuadsCanonicalizer0._hashArea = intArray19;
        byteQuadsCanonicalizer0._count = (-432223999);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "131) test1240(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-686876084) + "'", int4 == (-686876084));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "71) test1240(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 479174009 + "'", int21 == 479174009);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4._hashSize;
        byteQuadsCanonicalizer4._count = (byte) 100;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer4._names;
        byteQuadsCanonicalizer4._spilloverEnd = (byte) 100;
        int int11 = byteQuadsCanonicalizer4._spilloverEnd;
        int int12 = byteQuadsCanonicalizer4.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        int[] intArray22 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean35 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer37 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int38 = byteQuadsCanonicalizer37.hashSeed();
        int int39 = byteQuadsCanonicalizer37._longNameOffset;
        int int40 = byteQuadsCanonicalizer37._longNameOffset;
        boolean boolean41 = byteQuadsCanonicalizer37._intern;
        int int42 = byteQuadsCanonicalizer37._secondaryStart;
        int int43 = byteQuadsCanonicalizer37._secondaryStart;
        int int44 = byteQuadsCanonicalizer37._tertiaryShift;
        byteQuadsCanonicalizer37.release();
        int int46 = byteQuadsCanonicalizer37._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer47 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int48 = byteQuadsCanonicalizer47._hashSize;
        byteQuadsCanonicalizer47._count = (byte) 100;
        java.lang.String[] strArray51 = byteQuadsCanonicalizer47._names;
        java.lang.String str52 = byteQuadsCanonicalizer47.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer53 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int54 = byteQuadsCanonicalizer53._hashSize;
        byteQuadsCanonicalizer53._count = (byte) 100;
        java.lang.String[] strArray57 = byteQuadsCanonicalizer53._names;
        int[] intArray62 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int64 = byteQuadsCanonicalizer53.calcHash(intArray62, 4);
        byteQuadsCanonicalizer47._hashArea = intArray62;
        byteQuadsCanonicalizer37._hashArea = intArray62;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray62, 726703924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "132) test1241(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432199043) + "'", int1 == (-432199043));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "72) test1241(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1201891747) + "'", int24 == (-1201891747));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer37);
// flaky "24) test1241(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-432199043) + "'", int38 == (-432199043));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str52, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(strArray57);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "8) test1241(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1201891747) + "'", int64 == (-1201891747));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteQuadsCanonicalizer6._spilloverEnd;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "133) test1242(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432199029) + "'", int1 == (-432199029));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "73) test1242(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432199029) + "'", int3 == (-432199029));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 850855124;
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(850828601);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2.hashSeed();
        int int4 = byteQuadsCanonicalizer2._longNameOffset;
        int int5 = byteQuadsCanonicalizer2.hashSeed();
        byteQuadsCanonicalizer2._longNameOffset = (short) 10;
        int int10 = byteQuadsCanonicalizer2.calcHash((int) '#', (int) (short) 10);
        int int11 = byteQuadsCanonicalizer2._secondaryStart;
        byteQuadsCanonicalizer2._tertiaryShift = (-432857889);
        boolean boolean14 = byteQuadsCanonicalizer2.maybeDirty();
        int int15 = byteQuadsCanonicalizer2._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int17 = byteQuadsCanonicalizer16._hashSize;
        java.lang.String str18 = byteQuadsCanonicalizer16.toString();
        int[] intArray23 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer16._hashArea = intArray23;
        byteQuadsCanonicalizer2._hashArea = intArray23;
        boolean boolean26 = byteQuadsCanonicalizer2.maybeDirty();
        int[] intArray27 = byteQuadsCanonicalizer2._hashArea;
        byteQuadsCanonicalizer1._hashArea = intArray27;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
// flaky "134) test1244(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432199011) + "'", int3 == (-432199011));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "74) test1244(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432199011) + "'", int5 == (-432199011));
// flaky "25) test1244(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 726502279 + "'", int10 == 726502279);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str18, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        java.lang.String str11 = byteQuadsCanonicalizer9.findName((-2105879442));
        byteQuadsCanonicalizer9._tertiaryStart = (-1733437941);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        java.lang.String str9 = byteQuadsCanonicalizer6.findName((-432232965), (-432235911));
        int int10 = byteQuadsCanonicalizer6._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 448 + "'", int10 == 448);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432232707));
        byteQuadsCanonicalizer0._secondaryStart = 0;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer12._hashSize = (short) 10;
        int int15 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        byteQuadsCanonicalizer18._spilloverEnd = (byte) 100;
        int int25 = byteQuadsCanonicalizer18._spilloverEnd;
        int int26 = byteQuadsCanonicalizer18.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27._hashSize;
        byteQuadsCanonicalizer27._count = (byte) 100;
        java.lang.String[] strArray31 = byteQuadsCanonicalizer27._names;
        int[] intArray36 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int38 = byteQuadsCanonicalizer27.calcHash(intArray36, 4);
        java.lang.String[] strArray44 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer27._names = strArray44;
        byteQuadsCanonicalizer18._names = strArray44;
        java.lang.String[] strArray47 = new java.lang.String[] {};
        byteQuadsCanonicalizer18._names = strArray47;
        byteQuadsCanonicalizer12._names = strArray47;
        byteQuadsCanonicalizer0._names = strArray47;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "135) test1247(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 111218 + "'", int6 == 111218);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "75) test1247(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 729852100 + "'", int38 == 729852100);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] {});
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1._hashSize;
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        int[] intArray4 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(intArray4);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._longNameOffset = (-432857107);
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int10 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "136) test1249(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432198937) + "'", int1 == (-432198937));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "76) test1249(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432198937) + "'", int3 == (-432198937));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-745777500));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432227153));
        int int2 = byteQuadsCanonicalizer1.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer3._hashSize;
        java.lang.String str5 = byteQuadsCanonicalizer3.toString();
        int[] intArray10 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer3._hashArea = intArray10;
        byteQuadsCanonicalizer1._hashArea = intArray10;
        int int13 = byteQuadsCanonicalizer1._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._tertiaryStart = 872635325;
        boolean boolean10 = byteQuadsCanonicalizer0._intern;
        int int11 = byteQuadsCanonicalizer0.size();
        int int12 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "137) test1252(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432198889) + "'", int1 == (-432198889));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int4 = byteQuadsCanonicalizer0._tertiaryStart;
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432234855));
        int int2 = byteQuadsCanonicalizer1._count;
        int int3 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._hashSize = (-432227577);
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int14 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "138) test1256(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-689376946) + "'", int6 == (-689376946));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        byteQuadsCanonicalizer4._hashSize = (-432236017);
        int int8 = byteQuadsCanonicalizer4._hashSize;
        byteQuadsCanonicalizer4.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer4._parent;
        int int11 = byteQuadsCanonicalizer4.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "139) test1257(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432198783) + "'", int1 == (-432198783));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432236017) + "'", int8 == (-432236017));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = 1791970984;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = 850815938;
        int int13 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._hashSize = (-432804152);
        int[] intArray16 = byteQuadsCanonicalizer0._hashArea;
        int int17 = byteQuadsCanonicalizer0._spilloverEnd;
        int int18 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "140) test1258(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433032668) + "'", int5 == (-433032668));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "77) test1258(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432198775) + "'", int10 == (-432198775));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._spilloverEnd = 726751867;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        int int11 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432210697);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 181687966 + "'", int11 == 181687966);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1029717943);
        int int16 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._hashSize = (-432228433);
        boolean boolean20 = byteQuadsCanonicalizer0._intern;
        int[] intArray21 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "141) test1261(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-329778385) + "'", int11 == (-329778385));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int9 = byteQuadsCanonicalizer0.size();
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        int int13 = byteQuadsCanonicalizer0.calcHash(0, (-1386690286));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "142) test1262(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1660350234 + "'", int13 == 1660350234);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432804524));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer13._hashSize = (short) 10;
        int int16 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._hashSize = 1797043;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        byteQuadsCanonicalizer19._spilloverEnd = (byte) 100;
        int int26 = byteQuadsCanonicalizer19._spilloverEnd;
        int int27 = byteQuadsCanonicalizer19.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        java.lang.String[] strArray45 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer28._names = strArray45;
        byteQuadsCanonicalizer19._names = strArray45;
        java.lang.String[] strArray48 = new java.lang.String[] {};
        byteQuadsCanonicalizer19._names = strArray48;
        byteQuadsCanonicalizer13._names = strArray48;
        byteQuadsCanonicalizer11._names = strArray48;
        byteQuadsCanonicalizer9._names = strArray48;
        byteQuadsCanonicalizer0._names = strArray48;
        int int54 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._secondaryStart = (-1574728945);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "143) test1263(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1518290129 + "'", int39 == 1518290129);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        int int7 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "144) test1264(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-432198699) + "'", int7 == (-432198699));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        boolean boolean3 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1._intern = false;
        int int6 = byteQuadsCanonicalizer1._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        int int13 = byteQuadsCanonicalizer0.calcHash(1869614560);
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "145) test1266(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-658896473) + "'", int6 == (-658896473));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
// flaky "78) test1266(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1991951476) + "'", int13 == (-1991951476));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str15, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        int int8 = byteQuadsCanonicalizer1.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "146) test1268(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432198663) + "'", int4 == (-432198663));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int8 = byteQuadsCanonicalizer0._count;
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer11);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        byteQuadsCanonicalizer14._count = (byte) 100;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer14._names;
        int[] intArray23 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int25 = byteQuadsCanonicalizer14.calcHash(intArray23, 4);
        byteQuadsCanonicalizer0._hashArea = intArray23;
        int int27 = byteQuadsCanonicalizer0._secondaryStart;
        int int28 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._longNameOffset = 1715158130;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "147) test1270(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-358452942) + "'", int11 == (-358452942));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "79) test1270(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-358452942) + "'", int25 == (-358452942));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        int int9 = byteQuadsCanonicalizer0._hashSize;
        int int10 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._tertiaryShift = (-432223467);
        int int13 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "148) test1271(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432198639) + "'", int4 == (-432198639));
// flaky "80) test1271(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850542554 + "'", int7 == 850542554);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "26) test1271(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-432198639) + "'", int13 == (-432198639));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._tertiaryShift = (-70027317);
        int int7 = byteQuadsCanonicalizer1.calcHash((-403081391), (-292742555));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1272802614 + "'", int7 == 1272802614);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        byteQuadsCanonicalizer9._secondaryStart = (-432233701);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = byteQuadsCanonicalizer9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -432233698 out of bounds for length 512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray6 = byteQuadsCanonicalizer4._hashArea;
        int int7 = byteQuadsCanonicalizer4.secondaryCount();
        int int9 = byteQuadsCanonicalizer4.calcHash((-432228115));
        java.lang.String str12 = byteQuadsCanonicalizer4.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432211351));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "149) test1274(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432198609) + "'", int1 == (-432198609));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "81) test1274(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 103642 + "'", int9 == 103642);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str12, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        int int5 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = 2097935745;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        byteQuadsCanonicalizer1._hashSize = 0;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1548189191));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        byteQuadsCanonicalizer11._spilloverEnd = (byte) 100;
        int int18 = byteQuadsCanonicalizer11._spilloverEnd;
        int int19 = byteQuadsCanonicalizer11.secondaryCount();
        byteQuadsCanonicalizer11._longNameOffset = 3846;
        java.lang.String str22 = byteQuadsCanonicalizer11.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int24 = byteQuadsCanonicalizer23._longNameOffset;
        byteQuadsCanonicalizer23._tertiaryStart = 0;
        boolean boolean27 = byteQuadsCanonicalizer23.maybeDirty();
        byteQuadsCanonicalizer23._spilloverEnd = (-2066636029);
        int int30 = byteQuadsCanonicalizer23.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31.hashSeed();
        int int33 = byteQuadsCanonicalizer31._longNameOffset;
        int int34 = byteQuadsCanonicalizer31.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        byteQuadsCanonicalizer35._spilloverEnd = (byte) 100;
        int int42 = byteQuadsCanonicalizer35._spilloverEnd;
        int int43 = byteQuadsCanonicalizer35.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int45 = byteQuadsCanonicalizer44._hashSize;
        byteQuadsCanonicalizer44._count = (byte) 100;
        java.lang.String[] strArray48 = byteQuadsCanonicalizer44._names;
        int[] intArray53 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int55 = byteQuadsCanonicalizer44.calcHash(intArray53, 4);
        java.lang.String[] strArray61 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer44._names = strArray61;
        byteQuadsCanonicalizer35._names = strArray61;
        byteQuadsCanonicalizer31._names = strArray61;
        byteQuadsCanonicalizer23._names = strArray61;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer66 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int67 = byteQuadsCanonicalizer66._hashSize;
        byteQuadsCanonicalizer66._count = (byte) 100;
        java.lang.String[] strArray70 = byteQuadsCanonicalizer66._names;
        byteQuadsCanonicalizer66._spilloverEnd = (byte) 100;
        int int73 = byteQuadsCanonicalizer66._spilloverEnd;
        int int74 = byteQuadsCanonicalizer66.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer75 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int76 = byteQuadsCanonicalizer75._hashSize;
        byteQuadsCanonicalizer75._count = (byte) 100;
        java.lang.String[] strArray79 = byteQuadsCanonicalizer75._names;
        int[] intArray84 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int86 = byteQuadsCanonicalizer75.calcHash(intArray84, 4);
        java.lang.String[] strArray92 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer75._names = strArray92;
        byteQuadsCanonicalizer66._names = strArray92;
        byteQuadsCanonicalizer23._names = strArray92;
        byteQuadsCanonicalizer11._names = strArray92;
        byteQuadsCanonicalizer10._names = strArray92;
        byteQuadsCanonicalizer1._names = strArray92;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]" + "'", str22, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-516659008) + "'", int30 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
// flaky "150) test1276(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-432198589) + "'", int32 == (-432198589));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "82) test1276(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1001252316 + "'", int55 == 1001252316);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(strArray70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(strArray79);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "27) test1276(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1001252316 + "'", int86 == 1001252316);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        int int6 = byteQuadsCanonicalizer1.totalCount();
        int[] intArray7 = byteQuadsCanonicalizer1._hashArea;
        int int8 = byteQuadsCanonicalizer1.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._tertiaryStart = 851021273;
        int int13 = byteQuadsCanonicalizer0.calcHash((int) ' ', 0);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        int int16 = byteQuadsCanonicalizer14._spilloverEnd;
        int int17 = byteQuadsCanonicalizer14._longNameOffset;
        byteQuadsCanonicalizer14._count = ' ';
        int int20 = byteQuadsCanonicalizer14.spilloverCount();
        int int21 = byteQuadsCanonicalizer14._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer23 = byteQuadsCanonicalizer14.makeChild(726927673);
        int[] intArray24 = byteQuadsCanonicalizer23._hashArea;
        byteQuadsCanonicalizer0._hashArea = intArray24;
        int int26 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "151) test1278(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432198561) + "'", int1 == (-432198561));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "83) test1278(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 726503503 + "'", int13 == 726503503);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-925242568));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        int int3 = byteQuadsCanonicalizer1._tertiaryStart;
        int int4 = byteQuadsCanonicalizer1.totalCount();
        int int5 = byteQuadsCanonicalizer1._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7.hashSeed();
        int int9 = byteQuadsCanonicalizer7._longNameOffset;
        int int10 = byteQuadsCanonicalizer7.hashSeed();
        byteQuadsCanonicalizer7._longNameOffset = (short) 10;
        int int15 = byteQuadsCanonicalizer7.calcHash((int) '#', (int) (short) 10);
        int int16 = byteQuadsCanonicalizer7._secondaryStart;
        byteQuadsCanonicalizer7._tertiaryShift = (-432857889);
        boolean boolean19 = byteQuadsCanonicalizer7.maybeDirty();
        int int20 = byteQuadsCanonicalizer7._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        java.lang.String str23 = byteQuadsCanonicalizer21.toString();
        int[] intArray28 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer21._hashArea = intArray28;
        byteQuadsCanonicalizer7._hashArea = intArray28;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = byteQuadsCanonicalizer1.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray28, (-432208741));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
// flaky "152) test1280(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-432198533) + "'", int8 == (-432198533));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "84) test1280(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432198533) + "'", int10 == (-432198533));
// flaky "28) test1280(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 726500758 + "'", int15 == 726500758);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str23, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int14 = byteQuadsCanonicalizer0._count;
        java.lang.String str15 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "153) test1281(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1315278014 + "'", int11 == 1315278014);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str15, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1070321381);
        byteQuadsCanonicalizer0._secondaryStart = (-584220967);
        int int7 = byteQuadsCanonicalizer0.calcHash((-1662223595));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "154) test1282(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2060877664 + "'", int7 == 2060877664);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1127713687);
        int[] intArray2 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432231459);
        int int16 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "155) test1284(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-345489788) + "'", int11 == (-345489788));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash((-432857889), (-432802824), (-432235691));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        byteQuadsCanonicalizer6._spilloverEnd = (byte) 100;
        int int13 = byteQuadsCanonicalizer6._spilloverEnd;
        int int14 = byteQuadsCanonicalizer6.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        int[] intArray24 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        java.lang.String[] strArray32 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer15._names = strArray32;
        byteQuadsCanonicalizer6._names = strArray32;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        int[] intArray44 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int46 = byteQuadsCanonicalizer35.calcHash(intArray44, 4);
        byteQuadsCanonicalizer6._hashArea = intArray44;
        byteQuadsCanonicalizer0._hashArea = intArray44;
        int int50 = byteQuadsCanonicalizer0.calcHash(11880);
        int[] intArray51 = byteQuadsCanonicalizer0._hashArea;
        int int54 = byteQuadsCanonicalizer0.calcHash(0, (-432220775));
        int int55 = byteQuadsCanonicalizer0._count;
        int int56 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String str57 = byteQuadsCanonicalizer0.toString();
        int int58 = byteQuadsCanonicalizer0._secondaryStart;
        int int59 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "156) test1285(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-491406708) + "'", int5 == (-491406708));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "85) test1285(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1484134292 + "'", int26 == 1484134292);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "29) test1285(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1484134292 + "'", int46 == 1484134292);
// flaky "9) test1285(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-432829832) + "'", int50 == (-432829832));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "2) test1285(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-906537864) + "'", int54 == (-906537864));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str57, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean15 = byteQuadsCanonicalizer0._intern;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "157) test1286(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-202679374) + "'", int11 == (-202679374));
// flaky "86) test1286(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432198377) + "'", int14 == (-432198377));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = (-1281769);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "158) test1287(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433033068) + "'", int5 == (-433033068));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.size();
        int int4 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean5 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryStart = (-1070321381);
        int int4 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._intern = true;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(850815938);
        int int2 = byteQuadsCanonicalizer1._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int int2 = byteQuadsCanonicalizer1.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer1.makeChild((-432215719));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1.makeChild((-432232881));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(111461789);
        int int2 = byteQuadsCanonicalizer1._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-1776808604);
        boolean boolean22 = byteQuadsCanonicalizer0.maybeDirty();
        int int23 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = 1979216242;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26.hashSeed();
        int int28 = byteQuadsCanonicalizer26._longNameOffset;
        int int29 = byteQuadsCanonicalizer26.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer30 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int31 = byteQuadsCanonicalizer30._hashSize;
        byteQuadsCanonicalizer30._count = (byte) 100;
        java.lang.String[] strArray34 = byteQuadsCanonicalizer30._names;
        byteQuadsCanonicalizer30._spilloverEnd = (byte) 100;
        int int37 = byteQuadsCanonicalizer30._spilloverEnd;
        int int38 = byteQuadsCanonicalizer30.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer39 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int40 = byteQuadsCanonicalizer39._hashSize;
        byteQuadsCanonicalizer39._count = (byte) 100;
        java.lang.String[] strArray43 = byteQuadsCanonicalizer39._names;
        int[] intArray48 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int50 = byteQuadsCanonicalizer39.calcHash(intArray48, 4);
        java.lang.String[] strArray56 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer39._names = strArray56;
        byteQuadsCanonicalizer30._names = strArray56;
        java.lang.String[] strArray59 = new java.lang.String[] {};
        byteQuadsCanonicalizer30._names = strArray59;
        byteQuadsCanonicalizer26._names = strArray59;
        byteQuadsCanonicalizer0._names = strArray59;
        int int64 = byteQuadsCanonicalizer0.calcHash(726700099);
        int int65 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "159) test1293(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 742342925 + "'", int17 == 742342925);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "87) test1293(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-432198209) + "'", int23 == (-432198209));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
// flaky "30) test1293(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-432198209) + "'", int27 == (-432198209));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "10) test1293(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 742342925 + "'", int50 == 742342925);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] {});
// flaky "3) test1293(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-849191551) + "'", int64 == (-849191551));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        int int8 = byteQuadsCanonicalizer1.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int12 = byteQuadsCanonicalizer0.calcHash((-552967), (-1623339145), (-1669855521));
        java.lang.String[] strArray13 = null;
        byteQuadsCanonicalizer0._names = strArray13;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "160) test1295(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-454476893) + "'", int4 == (-454476893));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "88) test1295(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 653074436 + "'", int12 == 653074436);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432224835));
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int3 = byteQuadsCanonicalizer1.size();
        byteQuadsCanonicalizer1._spilloverEnd = (-752865931);
        byteQuadsCanonicalizer1._spilloverEnd = 0;
        byteQuadsCanonicalizer1._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(535941472);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2.hashSeed();
        int int4 = byteQuadsCanonicalizer2._longNameOffset;
        int int6 = byteQuadsCanonicalizer2.calcHash((-432236713));
        int int7 = byteQuadsCanonicalizer2.spilloverCount();
        int[] intArray8 = byteQuadsCanonicalizer2._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        int int11 = byteQuadsCanonicalizer9._spilloverEnd;
        int int12 = byteQuadsCanonicalizer9._longNameOffset;
        byteQuadsCanonicalizer9._count = ' ';
        byteQuadsCanonicalizer9._secondaryStart = (-432237891);
        int int19 = byteQuadsCanonicalizer9.calcHash((-432238147), 1973355417);
        boolean boolean20 = byteQuadsCanonicalizer9._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21.hashSeed();
        int int23 = byteQuadsCanonicalizer21._longNameOffset;
        int int24 = byteQuadsCanonicalizer21._longNameOffset;
        boolean boolean25 = byteQuadsCanonicalizer21._intern;
        int int26 = byteQuadsCanonicalizer21._secondaryStart;
        int int27 = byteQuadsCanonicalizer21._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer28 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int29 = byteQuadsCanonicalizer28._hashSize;
        byteQuadsCanonicalizer28._count = (byte) 100;
        java.lang.String[] strArray32 = byteQuadsCanonicalizer28._names;
        int[] intArray37 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int39 = byteQuadsCanonicalizer28.calcHash(intArray37, 4);
        java.lang.String[] strArray45 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer28._names = strArray45;
        byteQuadsCanonicalizer21._names = strArray45;
        byteQuadsCanonicalizer9._names = strArray45;
        byteQuadsCanonicalizer2._names = strArray45;
        byteQuadsCanonicalizer1._names = strArray45;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
// flaky "161) test1297(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432198173) + "'", int3 == (-432198173));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "89) test1297(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 113326 + "'", int6 == 113326);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "31) test1297(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 584781664 + "'", int19 == 584781664);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
// flaky "11) test1297(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-432198173) + "'", int22 == (-432198173));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(strArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "4) test1297(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 783156103 + "'", int39 == 783156103);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "162) test1298(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 801467351 + "'", int6 == 801467351);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        java.lang.String[] strArray5 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        int[] intArray19 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int21 = byteQuadsCanonicalizer10.calcHash(intArray19, 4);
        byteQuadsCanonicalizer8._hashArea = intArray19;
        byteQuadsCanonicalizer0._hashArea = intArray19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", (-432238147), (-432198913), 849535817);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -561002849 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "163) test1299(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-464331650) + "'", int4 == (-464331650));
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "90) test1299(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 648690433 + "'", int21 == 648690433);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432235137));
        byteQuadsCanonicalizer1._hashSize = 1;
        byteQuadsCanonicalizer1.release();
        int int5 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._longNameOffset = (-433036033);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "164) test1301(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432198117) + "'", int1 == (-432198117));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "91) test1301(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432198117) + "'", int3 == (-432198117));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (short) 10;
        int int4 = byteQuadsCanonicalizer1._hashSize;
        byteQuadsCanonicalizer1._hashSize = 1797043;
        byteQuadsCanonicalizer1._hashSize = 0;
        int int9 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._count = (byte) 100;
        java.lang.String[] strArray12 = byteQuadsCanonicalizer8._names;
        int[] intArray17 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int19 = byteQuadsCanonicalizer8.calcHash(intArray17, 4);
        byteQuadsCanonicalizer8._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22._hashSize;
        byteQuadsCanonicalizer22._count = (byte) 100;
        java.lang.String[] strArray26 = byteQuadsCanonicalizer22._names;
        int[] intArray31 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int33 = byteQuadsCanonicalizer22.calcHash(intArray31, 4);
        byteQuadsCanonicalizer8._hashArea = intArray31;
        byteQuadsCanonicalizer1._hashArea = intArray31;
        int int36 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "165) test1303(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 201880919 + "'", int19 == 201880919);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "92) test1303(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 201880919 + "'", int33 == 201880919);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3._reportTooManyCollisions();
        int int5 = byteQuadsCanonicalizer3._count;
        byteQuadsCanonicalizer3._hashSize = 850563740;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432235003);
        int int17 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean18 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._tertiaryStart = (-432225301);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "166) test1305(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584780494 + "'", int10 == 584780494);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "93) test1305(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432198083) + "'", int12 == (-432198083));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int7 = byteQuadsCanonicalizer0.calcHash((-1776808604), (int) (short) 100);
        int int8 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._spilloverEnd = (-432218051);
        int int12 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "167) test1306(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432198077) + "'", int4 == (-432198077));
// flaky "94) test1306(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 850530071 + "'", int7 == 850530071);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean3 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-432225773);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String str4 = byteQuadsCanonicalizer0.toString();
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._hashSize = (-432232235);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str4, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        java.lang.String[] strArray26 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer9._names = strArray26;
        byteQuadsCanonicalizer0._names = strArray26;
        java.lang.String[] strArray29 = new java.lang.String[] {};
        byteQuadsCanonicalizer0._names = strArray29;
        int int31 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32.hashSeed();
        int int34 = byteQuadsCanonicalizer32._longNameOffset;
        int int35 = byteQuadsCanonicalizer32.hashSeed();
        byteQuadsCanonicalizer32._longNameOffset = (short) 10;
        int int40 = byteQuadsCanonicalizer32.calcHash((int) '#', (int) (short) 10);
        int int41 = byteQuadsCanonicalizer32._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer42 = byteQuadsCanonicalizer32._parent;
        java.lang.String[] strArray43 = byteQuadsCanonicalizer32._names;
        int int47 = byteQuadsCanonicalizer32.calcHash(0, 1365014251, 770249287);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer48 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int49 = byteQuadsCanonicalizer48._longNameOffset;
        byteQuadsCanonicalizer48._tertiaryStart = 0;
        boolean boolean52 = byteQuadsCanonicalizer48.maybeDirty();
        byteQuadsCanonicalizer48._spilloverEnd = (-2066636029);
        int int55 = byteQuadsCanonicalizer48.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer56 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int57 = byteQuadsCanonicalizer56.hashSeed();
        int int58 = byteQuadsCanonicalizer56._longNameOffset;
        int int59 = byteQuadsCanonicalizer56.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer60 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int61 = byteQuadsCanonicalizer60._hashSize;
        byteQuadsCanonicalizer60._count = (byte) 100;
        java.lang.String[] strArray64 = byteQuadsCanonicalizer60._names;
        byteQuadsCanonicalizer60._spilloverEnd = (byte) 100;
        int int67 = byteQuadsCanonicalizer60._spilloverEnd;
        int int68 = byteQuadsCanonicalizer60.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer69 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int70 = byteQuadsCanonicalizer69._hashSize;
        byteQuadsCanonicalizer69._count = (byte) 100;
        java.lang.String[] strArray73 = byteQuadsCanonicalizer69._names;
        int[] intArray78 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int80 = byteQuadsCanonicalizer69.calcHash(intArray78, 4);
        java.lang.String[] strArray86 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer69._names = strArray86;
        byteQuadsCanonicalizer60._names = strArray86;
        byteQuadsCanonicalizer56._names = strArray86;
        byteQuadsCanonicalizer48._names = strArray86;
        byteQuadsCanonicalizer32._names = strArray86;
        byteQuadsCanonicalizer0._names = strArray86;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "168) test1309(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 596047270 + "'", int20 == 596047270);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
// flaky "95) test1309(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-432198037) + "'", int33 == (-432198037));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
// flaky "32) test1309(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-432198037) + "'", int35 == (-432198037));
// flaky "12) test1309(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 726504655 + "'", int40 == 726504655);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer42);
        org.junit.Assert.assertNull(strArray43);
// flaky "5) test1309(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-502852732) + "'", int47 == (-502852732));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-516659008) + "'", int55 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer56);
// flaky "1) test1309(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-432198037) + "'", int57 == (-432198037));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(strArray64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "1) test1309(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 596047270 + "'", int80 == 596047270);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        int int13 = byteQuadsCanonicalizer3.calcHash((-432210279), (-432210537), 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1310718317 + "'", int13 == 1310718317);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-658896473));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._secondaryStart = 1217455144;
        java.lang.String[] strArray7 = null;
        byteQuadsCanonicalizer0._names = strArray7;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9._hashSize;
        byteQuadsCanonicalizer9._count = (byte) 100;
        java.lang.String[] strArray13 = byteQuadsCanonicalizer9._names;
        int[] intArray18 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int20 = byteQuadsCanonicalizer9.calcHash(intArray18, 4);
        java.lang.String[] strArray26 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer9._names = strArray26;
        byteQuadsCanonicalizer0._names = strArray26;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        int[] intArray38 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int40 = byteQuadsCanonicalizer29.calcHash(intArray38, 4);
        byteQuadsCanonicalizer0._hashArea = intArray38;
        byteQuadsCanonicalizer0._count = (-432202479);
        int int45 = byteQuadsCanonicalizer0.calcHash(1122214214);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "169) test1313(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1636901811) + "'", int20 == (-1636901811));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "96) test1313(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1636901811) + "'", int40 == (-1636901811));
// flaky "33) test1313(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1529513694) + "'", int45 == (-1529513694));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0.calcHash(850843766, (-915896330), 0);
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "170) test1314(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197947) + "'", int1 == (-432197947));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "97) test1314(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 889899169 + "'", int9 == 889899169);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-543627745));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        java.lang.Class<?> wildcardClass9 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0._count;
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = (-1953084381);
        int int11 = byteQuadsCanonicalizer0.calcHash(1091455544, 0);
        java.lang.String str12 = byteQuadsCanonicalizer0.toString();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "171) test1317(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 412069323 + "'", int11 == 412069323);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str12, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer0._hashArea = intArray7;
        int int9 = byteQuadsCanonicalizer0.size();
        java.lang.String[] strArray10 = byteQuadsCanonicalizer0._names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = byteQuadsCanonicalizer0.findName((-432204057), 1859293132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -809233093 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        int int15 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._tertiaryStart = 585148675;
        boolean boolean18 = byteQuadsCanonicalizer0.maybeDirty();
        int int19 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "172) test1319(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1748861057) + "'", int11 == (-1748861057));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3.release();
        java.lang.String str9 = byteQuadsCanonicalizer3.findName((-432226435), (-432820089), 726804715);
        int int10 = byteQuadsCanonicalizer3._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-2044500639));
        boolean boolean2 = byteQuadsCanonicalizer1._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int4 = byteQuadsCanonicalizer3.size();
        int int7 = byteQuadsCanonicalizer3.calcHash((-432807290), 1794842379);
        byteQuadsCanonicalizer3._hashSize = (-432233335);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer3._parent;
        int int11 = byteQuadsCanonicalizer3._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-202237041) + "'", int7 == (-202237041));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "173) test1324(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197811) + "'", int1 == (-432197811));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "98) test1324(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432197811) + "'", int3 == (-432197811));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.Class<?> wildcardClass4 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._hashSize = (-432231821);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = byteQuadsCanonicalizer0.makeChild((-432210017));
        java.lang.String[] strArray12 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer0.makeChild(856242840);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-432230825);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int11 = byteQuadsCanonicalizer0.calcHash(1885226014, 585148675, (-432215793));
        java.lang.String str12 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "174) test1327(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197761) + "'", int1 == (-432197761));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "99) test1327(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-643794329) + "'", int11 == (-643794329));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str12, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=-432230825, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        java.lang.String str9 = byteQuadsCanonicalizer6.findName((-432232965), (-432235911));
        int int10 = byteQuadsCanonicalizer6.totalCount();
        byteQuadsCanonicalizer6._hashSize = (-432234841);
        java.lang.Class<?> wildcardClass13 = byteQuadsCanonicalizer6.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._secondaryStart = (-432236017);
        int int14 = byteQuadsCanonicalizer0.calcHash(726926494, (-432237577));
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "175) test1329(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1662043930) + "'", int7 == (-1662043930));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "100) test1329(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432197717) + "'", int9 == (-432197717));
// flaky "34) test1329(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 601103044 + "'", int14 == 601103044);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432230393));
        int int2 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(5951790);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 1741453774;
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "176) test1332(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197643) + "'", int1 == (-432197643));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash((-432857889), (-432802824), (-432235691));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        byteQuadsCanonicalizer6._spilloverEnd = (byte) 100;
        int int13 = byteQuadsCanonicalizer6._spilloverEnd;
        int int14 = byteQuadsCanonicalizer6.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        int[] intArray24 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        java.lang.String[] strArray32 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer15._names = strArray32;
        byteQuadsCanonicalizer6._names = strArray32;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        int[] intArray44 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int46 = byteQuadsCanonicalizer35.calcHash(intArray44, 4);
        byteQuadsCanonicalizer6._hashArea = intArray44;
        byteQuadsCanonicalizer0._hashArea = intArray44;
        int int50 = byteQuadsCanonicalizer0.calcHash(11880);
        int[] intArray51 = byteQuadsCanonicalizer0._hashArea;
        int int54 = byteQuadsCanonicalizer0.calcHash(0, (-432220775));
        int int55 = byteQuadsCanonicalizer0._count;
        int int56 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String str57 = byteQuadsCanonicalizer0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = byteQuadsCanonicalizer0.findName(600013180, 1243199876);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1749946653 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "177) test1333(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-656679645) + "'", int5 == (-656679645));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "101) test1333(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-658006791) + "'", int26 == (-658006791));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "35) test1333(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-658006791) + "'", int46 == (-658006791));
// flaky "13) test1333(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-432831474) + "'", int50 == (-432831474));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "6) test1333(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-906543858) + "'", int54 == (-906543858));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str57, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432224835));
        int int2 = byteQuadsCanonicalizer1._hashSize;
        int int3 = byteQuadsCanonicalizer1.secondaryCount();
        int int4 = byteQuadsCanonicalizer1._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432223521));
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int5 = byteQuadsCanonicalizer1.calcHash((-432236463), (-432236613), 2075315505);
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1200682433 + "'", int5 == 1200682433);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer0._names;
        int int13 = byteQuadsCanonicalizer0.calcHash(1869614560);
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        int int15 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "178) test1337(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 77763604 + "'", int6 == 77763604);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
// flaky "102) test1337(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1991945278) + "'", int13 == (-1991945278));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String[] strArray3 = byteQuadsCanonicalizer0._names;
        int int4 = byteQuadsCanonicalizer0._spilloverEnd;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int7 = byteQuadsCanonicalizer6.bucketCount();
        boolean boolean8 = byteQuadsCanonicalizer6._intern;
        byteQuadsCanonicalizer6._intern = false;
        byteQuadsCanonicalizer6._spilloverEnd = 850855124;
        int[] intArray13 = byteQuadsCanonicalizer6._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int18 = byteQuadsCanonicalizer14.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer14._hashSize = (-432857107);
        int int21 = byteQuadsCanonicalizer14._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer22 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer22.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24._hashSize;
        byteQuadsCanonicalizer24._count = (byte) 100;
        java.lang.String[] strArray28 = byteQuadsCanonicalizer24._names;
        int[] intArray33 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int35 = byteQuadsCanonicalizer24.calcHash(intArray33, 4);
        byteQuadsCanonicalizer22._hashArea = intArray33;
        byteQuadsCanonicalizer14._hashArea = intArray33;
        byteQuadsCanonicalizer6._hashArea = intArray33;
        byteQuadsCanonicalizer0._hashArea = intArray33;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
// flaky "179) test1338(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2080484815) + "'", int18 == (-2080484815));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "103) test1338(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 849714025 + "'", int35 == 849714025);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(5951790);
        int int2 = byteQuadsCanonicalizer1._secondaryStart;
        int[] intArray3 = byteQuadsCanonicalizer1._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._longNameOffset = 0;
        int int9 = byteQuadsCanonicalizer0._count;
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        int int11 = byteQuadsCanonicalizer0.secondaryCount();
        int int12 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = 622936314;
        int int15 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean16 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "180) test1340(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432197533) + "'", int15 == (-432197533));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        boolean boolean14 = byteQuadsCanonicalizer2._failOnDoS;
        int int15 = byteQuadsCanonicalizer2.primaryCount();
        int int16 = byteQuadsCanonicalizer2.secondaryCount();
        int int17 = byteQuadsCanonicalizer2._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        int[] intArray27 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int29 = byteQuadsCanonicalizer18.calcHash(intArray27, 4);
        java.lang.String[] strArray35 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer18._names = strArray35;
        byteQuadsCanonicalizer2._names = strArray35;
        byteQuadsCanonicalizer1._names = strArray35;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "181) test1341(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-774828479) + "'", int13 == (-774828479));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "104) test1341(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-774828479) + "'", int29 == (-774828479));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) '4');
        boolean boolean2 = byteQuadsCanonicalizer1._intern;
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int11 = byteQuadsCanonicalizer0.calcHash(586131556);
        byteQuadsCanonicalizer0._tertiaryStart = (-432818871);
        int int14 = byteQuadsCanonicalizer0.secondaryCount();
        int int15 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "182) test1343(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-992014084) + "'", int11 == (-992014084));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int7 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "183) test1344(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197477) + "'", int1 == (-432197477));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "105) test1344(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432197477) + "'", int3 == (-432197477));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = (-432230027);
        int int15 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._hashSize = (-432209901);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "184) test1345(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584583664 + "'", int10 == 584583664);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "106) test1345(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432197465) + "'", int12 == (-432197465));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryShift = (-432228709);
        int int13 = byteQuadsCanonicalizer0.calcHash((-1872252284), 1332192405, 42842510);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "185) test1346(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-6725442) + "'", int4 == (-6725442));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "107) test1346(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-894033338) + "'", int13 == (-894033338));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        byteQuadsCanonicalizer7._count = (byte) 100;
        java.lang.String[] strArray11 = byteQuadsCanonicalizer7._names;
        int[] intArray16 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int18 = byteQuadsCanonicalizer7.calcHash(intArray16, 4);
        java.lang.String[] strArray24 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer7._names = strArray24;
        byteQuadsCanonicalizer1._names = strArray24;
        byteQuadsCanonicalizer1.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "186) test1347(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-934010218) + "'", int18 == (-934010218));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._longNameOffset = (-1960738167);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "187) test1349(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584587219 + "'", int10 == 584587219);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "188) test1350(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197405) + "'", int1 == (-432197405));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        int int15 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._intern = true;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer0._names;
        int int19 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "189) test1351(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584583214 + "'", int10 == 584583214);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "108) test1351(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432197399) + "'", int12 == (-432197399));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strArray18);
// flaky "36) test1351(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-432197399) + "'", int19 == (-432197399));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0.bucketCount();
        int int20 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "190) test1352(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1355610455 + "'", int17 == 1355610455);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(1910040666);
        int int2 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432236371));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-1157391731));
        boolean boolean9 = byteQuadsCanonicalizer8.maybeDirty();
        byteQuadsCanonicalizer8._tertiaryStart = 1091455544;
        byteQuadsCanonicalizer8._hashSize = (-432218051);
        boolean boolean14 = byteQuadsCanonicalizer8.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "191) test1355(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108967 + "'", int6 == 108967);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 6000;
        int int9 = byteQuadsCanonicalizer0.bucketCount();
        int int11 = byteQuadsCanonicalizer0.calcHash(586131556);
        int int12 = byteQuadsCanonicalizer0.primaryCount();
        int int13 = byteQuadsCanonicalizer0._tertiaryStart;
        int int14 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "192) test1356(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-992013530) + "'", int11 == (-992013530));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer1._parent;
        int int11 = byteQuadsCanonicalizer1.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = byteQuadsCanonicalizer1.makeChild((-432231575));
        byteQuadsCanonicalizer1._spilloverEnd = (-432205487);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1373664638 + "'", int11 == 1373664638);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 926034734;
        byteQuadsCanonicalizer0._intern = false;
        int int17 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "193) test1358(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2021290272 + "'", int11 == 2021290272);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        boolean boolean3 = byteQuadsCanonicalizer0._failOnDoS;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean7 = byteQuadsCanonicalizer0._intern;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "194) test1360(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197305) + "'", int1 == (-432197305));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int10 = byteQuadsCanonicalizer9.hashSeed();
        int int11 = byteQuadsCanonicalizer9._longNameOffset;
        int int12 = byteQuadsCanonicalizer9._longNameOffset;
        boolean boolean13 = byteQuadsCanonicalizer9._intern;
        int int14 = byteQuadsCanonicalizer9._secondaryStart;
        int int15 = byteQuadsCanonicalizer9._secondaryStart;
        int int16 = byteQuadsCanonicalizer9._tertiaryShift;
        byteQuadsCanonicalizer9.release();
        int int18 = byteQuadsCanonicalizer9._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        java.lang.String str24 = byteQuadsCanonicalizer19.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer25 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int26 = byteQuadsCanonicalizer25._hashSize;
        byteQuadsCanonicalizer25._count = (byte) 100;
        java.lang.String[] strArray29 = byteQuadsCanonicalizer25._names;
        int[] intArray34 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int36 = byteQuadsCanonicalizer25.calcHash(intArray34, 4);
        byteQuadsCanonicalizer19._hashArea = intArray34;
        byteQuadsCanonicalizer9._hashArea = intArray34;
        byteQuadsCanonicalizer0._hashArea = intArray34;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = byteQuadsCanonicalizer0.findName((-432216425), (-2131029837));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1820324287 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
// flaky "195) test1361(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432197285) + "'", int10 == (-432197285));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str24, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "109) test1361(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-635904283) + "'", int36 == (-635904283));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        boolean boolean3 = byteQuadsCanonicalizer0._intern;
        int[] intArray4 = byteQuadsCanonicalizer0._hashArea;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "196) test1362(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197267) + "'", int1 == (-432197267));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(intArray4);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(1610277492);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = byteQuadsCanonicalizer1.makeChild((-432811187));
        byteQuadsCanonicalizer1._spilloverEnd = (-432211535);
        int int10 = byteQuadsCanonicalizer1.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-108052884) + "'", int10 == (-108052884));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        java.lang.String str9 = byteQuadsCanonicalizer6.findName((-432232965), (-432235911));
        int int10 = byteQuadsCanonicalizer6.totalCount();
        byteQuadsCanonicalizer6._hashSize = (-432234841);
        int int13 = byteQuadsCanonicalizer6._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 384 + "'", int13 == 384);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1029717943);
        int int16 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._spilloverEnd = (-432824364);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "197) test1366(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 854343171 + "'", int11 == 854343171);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer17);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._spilloverEnd = 0;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0.release();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer7 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int8 = byteQuadsCanonicalizer7._hashSize;
        java.lang.String str9 = byteQuadsCanonicalizer7.toString();
        int[] intArray14 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer7._hashArea = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/25 pri/sec/ter/spill (=0), total:25]", intArray14, (-432228459));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._tertiaryStart = 851021273;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "198) test1369(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197199) + "'", int1 == (-432197199));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._tertiaryStart = 601297471;
        int int17 = byteQuadsCanonicalizer0.calcHash((-543395630));
        int int19 = byteQuadsCanonicalizer0.calcHash((-432818147));
        byteQuadsCanonicalizer0._intern = false;
        int int22 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "199) test1370(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1292983843) + "'", int11 == (-1292983843));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "110) test1370(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 966975761 + "'", int17 == 966975761);
// flaky "37) test1370(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 952656 + "'", int19 == 952656);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._hashSize = (-432231879);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        byteQuadsCanonicalizer0._tertiaryShift = 1762920574;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "200) test1371(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197185) + "'", int1 == (-432197185));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-317336036) + "'", int7 == (-317336036));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = 726703924;
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        int int12 = byteQuadsCanonicalizer0.secondaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "201) test1372(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-473482941) + "'", int7 == (-473482941));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = (-432230027);
        byteQuadsCanonicalizer0._longNameOffset = 1072045803;
        int int17 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "202) test1373(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584585050 + "'", int10 == 584585050);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "111) test1373(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432197173) + "'", int12 == (-432197173));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.primaryCount();
        int int4 = byteQuadsCanonicalizer0._longNameOffset;
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-1654346617));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int6 = byteQuadsCanonicalizer5._hashSize;
        byteQuadsCanonicalizer5._count = (byte) 100;
        java.lang.String[] strArray9 = byteQuadsCanonicalizer5._names;
        int[] intArray14 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int16 = byteQuadsCanonicalizer5.calcHash(intArray14, 4);
        byteQuadsCanonicalizer5._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._hashSize;
        byteQuadsCanonicalizer19._count = (byte) 100;
        java.lang.String[] strArray23 = byteQuadsCanonicalizer19._names;
        int[] intArray28 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int30 = byteQuadsCanonicalizer19.calcHash(intArray28, 4);
        byteQuadsCanonicalizer5._hashArea = intArray28;
        byteQuadsCanonicalizer0._hashArea = intArray28;
        int int33 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._hashSize = (-432197881);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "203) test1376(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1830178671) + "'", int16 == (-1830178671));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "112) test1376(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1830178671) + "'", int30 == (-1830178671));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0.spilloverCount();
        int int15 = byteQuadsCanonicalizer0._secondaryStart;
        int int16 = byteQuadsCanonicalizer0._spilloverEnd;
        int int17 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "204) test1377(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584585239 + "'", int10 == 584585239);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "113) test1377(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432197121) + "'", int12 == (-432197121));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-432237891) + "'", int15 == (-432237891));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.secondaryCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int[] intArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteQuadsCanonicalizer0.calcHash(intArray5, (-432220525));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = 1167071952;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-432225713));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        java.lang.String str16 = byteQuadsCanonicalizer11.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer11._parent;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer11._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer19.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer19._hashSize = (-432857107);
        int int26 = byteQuadsCanonicalizer19._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        int[] intArray38 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int40 = byteQuadsCanonicalizer29.calcHash(intArray38, 4);
        byteQuadsCanonicalizer27._hashArea = intArray38;
        byteQuadsCanonicalizer19._hashArea = intArray38;
        byteQuadsCanonicalizer11._hashArea = intArray38;
        byteQuadsCanonicalizer10._hashArea = intArray38;
        int int45 = byteQuadsCanonicalizer10._count;
        byteQuadsCanonicalizer10._intern = true;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer48 = byteQuadsCanonicalizer10._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "205) test1379(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432197103) + "'", int1 == (-432197103));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str16, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
// flaky "114) test1379(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-241748970) + "'", int23 == (-241748970));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "38) test1379(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 479967873 + "'", int40 == 479967873);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer48);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-724312429));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        byteQuadsCanonicalizer0._hashArea = intArray11;
        int int15 = byteQuadsCanonicalizer0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-1847829001), (-432199011));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -279152541 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "206) test1381(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1296142464) + "'", int13 == (-1296142464));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(726471553);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0._count;
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int10 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "207) test1383(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 279429565 + "'", int6 == 279429565);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(585130666);
        boolean boolean2 = byteQuadsCanonicalizer1.maybeDirty();
        byteQuadsCanonicalizer1._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        java.lang.String str7 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str7, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int5 = byteQuadsCanonicalizer0.calcHash((-432230027));
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "208) test1387(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99101 + "'", int5 == 99101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        byteQuadsCanonicalizer1._secondaryStart = 0;
        byteQuadsCanonicalizer1._spilloverEnd = 851025305;
        byteQuadsCanonicalizer1._hashSize = 1608546598;
        int int8 = byteQuadsCanonicalizer1.totalCount();
        int int9 = byteQuadsCanonicalizer1._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0.spilloverCount();
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild(0);
        int int9 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray7 = byteQuadsCanonicalizer0._names;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (-1194384256);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
// flaky "209) test1390(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432196989) + "'", int6 == (-432196989));
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int3 = byteQuadsCanonicalizer1._hashSize;
        int int5 = byteQuadsCanonicalizer1.calcHash((-432823208));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432346685) + "'", int5 == (-432346685));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int15 = byteQuadsCanonicalizer0.calcHash((-1529115260));
        int int16 = byteQuadsCanonicalizer0.bucketCount();
        int int17 = byteQuadsCanonicalizer0._spilloverEnd;
        int int18 = byteQuadsCanonicalizer0._spilloverEnd;
        int int19 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "210) test1392(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1820961796 + "'", int11 == 1820961796);
// flaky "115) test1392(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1122185103 + "'", int15 == 1122185103);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "39) test1392(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-432196963) + "'", int19 == (-432196963));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((int) (byte) -1);
        int int2 = byteQuadsCanonicalizer1._count;
        boolean boolean3 = byteQuadsCanonicalizer1._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer1.makeChild((-1008950360));
        int int6 = byteQuadsCanonicalizer5.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        java.lang.String str9 = byteQuadsCanonicalizer6.findName((-432232965), (-432235911));
        java.lang.String str14 = byteQuadsCanonicalizer6.addName("hi!", (-432220823), (-890274014), (-432817273));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        int int4 = byteQuadsCanonicalizer0.secondaryCount();
        boolean boolean5 = byteQuadsCanonicalizer0._failOnDoS;
        int int6 = byteQuadsCanonicalizer0.tertiaryCount();
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "211) test1396(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196927) + "'", int1 == (-432196927));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-432221335);
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.size();
        int int11 = byteQuadsCanonicalizer0._tertiaryShift;
        int int12 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "212) test1397(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-281291314) + "'", int4 == (-281291314));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "116) test1397(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432196903) + "'", int9 == (-432196903));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        byteQuadsCanonicalizer0._tertiaryShift = 1763641886;
        int int9 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "213) test1398(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1139902429 + "'", int6 == 1139902429);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryStart = (-432230027);
        byteQuadsCanonicalizer0._longNameOffset = 1072045803;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int18 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "214) test1399(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584554765 + "'", int10 == 584554765);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "117) test1399(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432196879) + "'", int12 == (-432196879));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        java.lang.Class<?> wildcardClass10 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._spilloverEnd = (-432235911);
        int int11 = byteQuadsCanonicalizer0.calcHash(2047601295);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "215) test1401(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-816093618) + "'", int7 == (-816093618));
// flaky "118) test1401(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1673611589) + "'", int11 == (-1673611589));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        int int8 = byteQuadsCanonicalizer3._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-1380866691));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0._longNameOffset;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8._hashSize;
        byteQuadsCanonicalizer8._count = (byte) 100;
        java.lang.String[] strArray12 = byteQuadsCanonicalizer8._names;
        java.lang.String str13 = byteQuadsCanonicalizer8.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = byteQuadsCanonicalizer8._parent;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer8._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer16.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer16._hashSize = (-432857107);
        int int23 = byteQuadsCanonicalizer16._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer24 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int25 = byteQuadsCanonicalizer24.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int27 = byteQuadsCanonicalizer26._hashSize;
        byteQuadsCanonicalizer26._count = (byte) 100;
        java.lang.String[] strArray30 = byteQuadsCanonicalizer26._names;
        int[] intArray35 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int37 = byteQuadsCanonicalizer26.calcHash(intArray35, 4);
        byteQuadsCanonicalizer24._hashArea = intArray35;
        byteQuadsCanonicalizer16._hashArea = intArray35;
        byteQuadsCanonicalizer8._hashArea = intArray35;
        byteQuadsCanonicalizer0._hashArea = intArray35;
        int int45 = byteQuadsCanonicalizer0.calcHash(850815938, (-432224267), 488291047);
        boolean boolean46 = byteQuadsCanonicalizer0._failOnDoS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = byteQuadsCanonicalizer0.findName((-432221335), 1041862019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1056593163 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str13, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
// flaky "216) test1404(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-83844231) + "'", int20 == (-83844231));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "119) test1404(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1288071272 + "'", int37 == 1288071272);
// flaky "40) test1404(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1683083942 + "'", int45 == 1683083942);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int int6 = byteQuadsCanonicalizer4._tertiaryShift;
        byteQuadsCanonicalizer4._secondaryStart = (-432857889);
        int int9 = byteQuadsCanonicalizer4.tertiaryCount();
        byteQuadsCanonicalizer4._count = 1300450668;
        int int12 = byteQuadsCanonicalizer4._count;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "217) test1405(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196795) + "'", int1 == (-432196795));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1300450668 + "'", int12 == 1300450668);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean3 = byteQuadsCanonicalizer0.maybeDirty();
        int int4 = byteQuadsCanonicalizer0.hashSeed();
        int int5 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._longNameOffset = 726921751;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "218) test1406(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-432196761) + "'", int4 == (-432196761));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(6784305);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.bucketCount();
        int int4 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._intern = false;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "219) test1408(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196739) + "'", int1 == (-432196739));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        java.lang.String str7 = byteQuadsCanonicalizer0.toString();
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "220) test1409(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 771819376 + "'", int6 == 771819376);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str7, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        byteQuadsCanonicalizer0._spilloverEnd = (-1029717943);
        int int16 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        byteQuadsCanonicalizer20._spilloverEnd = (byte) 100;
        int int27 = byteQuadsCanonicalizer20._spilloverEnd;
        int int28 = byteQuadsCanonicalizer20.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        int[] intArray38 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int40 = byteQuadsCanonicalizer29.calcHash(intArray38, 4);
        java.lang.String[] strArray46 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer29._names = strArray46;
        byteQuadsCanonicalizer20._names = strArray46;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer49 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int50 = byteQuadsCanonicalizer49._hashSize;
        byteQuadsCanonicalizer49._count = (byte) 100;
        java.lang.String[] strArray53 = byteQuadsCanonicalizer49._names;
        int[] intArray58 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int60 = byteQuadsCanonicalizer49.calcHash(intArray58, 4);
        byteQuadsCanonicalizer20._hashArea = intArray58;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = byteQuadsCanonicalizer0.addName("hi!", intArray58, 2110176992);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "221) test1410(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-460885743) + "'", int11 == (-460885743));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "120) test1410(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-460885743) + "'", int40 == (-460885743));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "41) test1410(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-460885743) + "'", int60 == (-460885743));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        int int6 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0._tertiaryShift;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "222) test1412(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196677) + "'", int1 == (-432196677));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "121) test1412(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432196677) + "'", int3 == (-432196677));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19._longNameOffset;
        byteQuadsCanonicalizer19._tertiaryStart = 0;
        boolean boolean23 = byteQuadsCanonicalizer19.maybeDirty();
        byteQuadsCanonicalizer19._spilloverEnd = (-2066636029);
        int int26 = byteQuadsCanonicalizer19.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27.hashSeed();
        int int29 = byteQuadsCanonicalizer27._longNameOffset;
        int int30 = byteQuadsCanonicalizer27.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int32 = byteQuadsCanonicalizer31._hashSize;
        byteQuadsCanonicalizer31._count = (byte) 100;
        java.lang.String[] strArray35 = byteQuadsCanonicalizer31._names;
        byteQuadsCanonicalizer31._spilloverEnd = (byte) 100;
        int int38 = byteQuadsCanonicalizer31._spilloverEnd;
        int int39 = byteQuadsCanonicalizer31.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer40 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int41 = byteQuadsCanonicalizer40._hashSize;
        byteQuadsCanonicalizer40._count = (byte) 100;
        java.lang.String[] strArray44 = byteQuadsCanonicalizer40._names;
        int[] intArray49 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int51 = byteQuadsCanonicalizer40.calcHash(intArray49, 4);
        java.lang.String[] strArray57 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer40._names = strArray57;
        byteQuadsCanonicalizer31._names = strArray57;
        byteQuadsCanonicalizer27._names = strArray57;
        byteQuadsCanonicalizer19._names = strArray57;
        byteQuadsCanonicalizer0._names = strArray57;
        int int66 = byteQuadsCanonicalizer0.calcHash((-432230011), 0, 726770920);
        int int67 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "223) test1413(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1015725718) + "'", int17 == (-1015725718));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-516659008) + "'", int26 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
// flaky "122) test1413(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-432196669) + "'", int28 == (-432196669));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "42) test1413(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1015725718) + "'", int51 == (-1015725718));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
// flaky "14) test1413(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1377163365 + "'", int66 == 1377163365);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        int int6 = byteQuadsCanonicalizer0._longNameOffset;
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        int int8 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.Class<?> wildcardClass9 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432231459);
        int int16 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0.release();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int20 = byteQuadsCanonicalizer19.hashSeed();
        int int24 = byteQuadsCanonicalizer19.calcHash(0, (int) 'a', (int) (short) 100);
        boolean boolean25 = byteQuadsCanonicalizer19.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer26 = byteQuadsCanonicalizer19._parent;
        int int29 = byteQuadsCanonicalizer19.calcHash((-790193954), (-432802824));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer31 = byteQuadsCanonicalizer19.makeChild((-432231575));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32._hashSize;
        int int34 = byteQuadsCanonicalizer32._spilloverEnd;
        int int35 = byteQuadsCanonicalizer32._tertiaryShift;
        int int39 = byteQuadsCanonicalizer32.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer32._reportTooManyCollisions();
        int int41 = byteQuadsCanonicalizer32.hashSeed();
        int int42 = byteQuadsCanonicalizer32.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer44 = byteQuadsCanonicalizer32.makeChild((-432230027));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer46 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432807290));
        int[] intArray47 = byteQuadsCanonicalizer46._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer48 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int49 = byteQuadsCanonicalizer48._hashSize;
        byteQuadsCanonicalizer48._count = (byte) 100;
        java.lang.String[] strArray52 = byteQuadsCanonicalizer48._names;
        int[] intArray57 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int59 = byteQuadsCanonicalizer48.calcHash(intArray57, 4);
        byteQuadsCanonicalizer48._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer62 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int63 = byteQuadsCanonicalizer62._hashSize;
        byteQuadsCanonicalizer62._count = (byte) 100;
        java.lang.String[] strArray66 = byteQuadsCanonicalizer62._names;
        int[] intArray71 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int73 = byteQuadsCanonicalizer62.calcHash(intArray71, 4);
        byteQuadsCanonicalizer48._hashArea = intArray71;
        byteQuadsCanonicalizer46._hashArea = intArray71;
        java.lang.String str77 = byteQuadsCanonicalizer44.findName(intArray71, (-432226507));
        java.lang.String str79 = byteQuadsCanonicalizer31.findName(intArray71, (-432205465));
        // The following exception was thrown during execution in test generation
        try {
            int int81 = byteQuadsCanonicalizer0.calcHash(intArray71, (-432200413));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "224) test1415(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2079406541) + "'", int11 == (-2079406541));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1797043 + "'", int24 == 1797043);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1373664638 + "'", int29 == 1373664638);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer31);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
// flaky "123) test1415(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-226029814) + "'", int39 == (-226029814));
// flaky "43) test1415(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-432196643) + "'", int41 == (-432196643));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer44);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer46);
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "15) test1415(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-2079406541) + "'", int59 == (-2079406541));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "7) test1415(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-2079406541) + "'", int73 == (-2079406541));
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        int int11 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        int int17 = byteQuadsCanonicalizer13.bucketCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer18 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int19 = byteQuadsCanonicalizer18._hashSize;
        byteQuadsCanonicalizer18._count = (byte) 100;
        java.lang.String[] strArray22 = byteQuadsCanonicalizer18._names;
        int[] intArray27 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int29 = byteQuadsCanonicalizer18.calcHash(intArray27, 4);
        byteQuadsCanonicalizer18._intern = false;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer32 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int33 = byteQuadsCanonicalizer32._hashSize;
        byteQuadsCanonicalizer32._count = (byte) 100;
        java.lang.String[] strArray36 = byteQuadsCanonicalizer32._names;
        int[] intArray41 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int43 = byteQuadsCanonicalizer32.calcHash(intArray41, 4);
        byteQuadsCanonicalizer18._hashArea = intArray41;
        byteQuadsCanonicalizer13._hashArea = intArray41;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", intArray41, 970224245);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "225) test1416(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584552254 + "'", int10 == 584552254);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "124) test1416(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1714626401 + "'", int29 == 1714626401);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "44) test1416(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1714626401 + "'", int43 == 1714626401);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._tertiaryShift = 726740410;
        int int11 = byteQuadsCanonicalizer0.calcHash((-631239760));
        int int12 = byteQuadsCanonicalizer0.tertiaryCount();
        int int13 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "226) test1417(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433030706) + "'", int5 == (-433030706));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "125) test1417(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1012838775 + "'", int11 == 1012838775);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash((-432857889), (-432802824), (-432235691));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        byteQuadsCanonicalizer6._spilloverEnd = (byte) 100;
        int int13 = byteQuadsCanonicalizer6._spilloverEnd;
        int int14 = byteQuadsCanonicalizer6.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        byteQuadsCanonicalizer15._count = (byte) 100;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer15._names;
        int[] intArray24 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int26 = byteQuadsCanonicalizer15.calcHash(intArray24, 4);
        java.lang.String[] strArray32 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer15._names = strArray32;
        byteQuadsCanonicalizer6._names = strArray32;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        int[] intArray44 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int46 = byteQuadsCanonicalizer35.calcHash(intArray44, 4);
        byteQuadsCanonicalizer6._hashArea = intArray44;
        byteQuadsCanonicalizer0._hashArea = intArray44;
        int int50 = byteQuadsCanonicalizer0.calcHash(11880);
        int[] intArray51 = byteQuadsCanonicalizer0._hashArea;
        int int54 = byteQuadsCanonicalizer0.calcHash(0, (-432220775));
        byteQuadsCanonicalizer0._tertiaryShift = (-432215719);
        byteQuadsCanonicalizer0._secondaryStart = 1355610455;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "227) test1418(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-296080291) + "'", int5 == (-296080291));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "126) test1418(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 660151321 + "'", int26 == 660151321);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "45) test1418(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 660151321 + "'", int46 == 660151321);
// flaky "16) test1418(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-433037264) + "'", int50 == (-433037264));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "8) test1418(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-905743794) + "'", int54 == (-905743794));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryShift = 726923506;
        byteQuadsCanonicalizer0._tertiaryShift = 100;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432231413), 726920401);
        java.lang.String[] strArray16 = byteQuadsCanonicalizer0._names;
        int int17 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "228) test1419(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1734984000 + "'", int6 == 1734984000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky "127) test1419(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 800575783 + "'", int15 == 800575783);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = byteQuadsCanonicalizer0._parent;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = byteQuadsCanonicalizer2.spilloverCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer2);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        java.lang.String[] strArray8 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._hashSize = (-432203743);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        int int4 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.spilloverCount();
        int int6 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "229) test1423(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432196535) + "'", int6 == (-432196535));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        int int13 = byteQuadsCanonicalizer0.size();
        byteQuadsCanonicalizer0._secondaryStart = (-432231459);
        int int16 = byteQuadsCanonicalizer0._secondaryStart;
        int int17 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "230) test1424(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1166857116) + "'", int11 == (-1166857116));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432231459) + "'", int16 == (-432231459));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432232075));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._tertiaryStart = 1167071952;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer0.makeChild((-432225713));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer11 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int12 = byteQuadsCanonicalizer11._hashSize;
        byteQuadsCanonicalizer11._count = (byte) 100;
        java.lang.String[] strArray15 = byteQuadsCanonicalizer11._names;
        java.lang.String str16 = byteQuadsCanonicalizer11.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer17 = byteQuadsCanonicalizer11._parent;
        java.lang.String[] strArray18 = byteQuadsCanonicalizer11._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int23 = byteQuadsCanonicalizer19.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer19._hashSize = (-432857107);
        int int26 = byteQuadsCanonicalizer19._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer27 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int28 = byteQuadsCanonicalizer27.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        int[] intArray38 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int40 = byteQuadsCanonicalizer29.calcHash(intArray38, 4);
        byteQuadsCanonicalizer27._hashArea = intArray38;
        byteQuadsCanonicalizer19._hashArea = intArray38;
        byteQuadsCanonicalizer11._hashArea = intArray38;
        byteQuadsCanonicalizer10._hashArea = intArray38;
        boolean boolean45 = byteQuadsCanonicalizer10._failOnDoS;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer46 = byteQuadsCanonicalizer10._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "231) test1426(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196501) + "'", int1 == (-432196501));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str16, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(byteQuadsCanonicalizer17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
// flaky "128) test1426(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-461401283) + "'", int23 == (-461401283));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "46) test1426(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1242646189 + "'", int40 == 1242646189);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer46);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int[] intArray6 = byteQuadsCanonicalizer0._hashArea;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._tertiaryStart;
        int int20 = byteQuadsCanonicalizer0.bucketCount();
        int int21 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "232) test1428(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 77974027 + "'", int17 == 77974027);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer0._names;
        int[] intArray15 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._spilloverEnd = (-432233373);
        java.lang.Class<?> wildcardClass18 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "233) test1429(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584558581 + "'", int10 == 584558581);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "129) test1429(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432196427) + "'", int12 == (-432196427));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = 1791970984;
        int int10 = byteQuadsCanonicalizer0.hashSeed();
        int int14 = byteQuadsCanonicalizer0.calcHash(1327434171, 586131826, 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "234) test1430(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433030888) + "'", int5 == (-433030888));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "130) test1430(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-432196419) + "'", int10 == (-432196419));
// flaky "47) test1430(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 438772332 + "'", int14 == 438772332);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        int int5 = byteQuadsCanonicalizer0.hashSeed();
        int int6 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "235) test1431(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-432196407) + "'", int5 == (-432196407));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int7 = byteQuadsCanonicalizer0.calcHash((-432232075), (-432210793));
        int int8 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._spilloverEnd = (-1574728945);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "236) test1432(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196399) + "'", int1 == (-432196399));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "131) test1432(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 517257668 + "'", int7 == 517257668);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int5 = byteQuadsCanonicalizer4._hashSize;
        byteQuadsCanonicalizer4._count = (byte) 100;
        java.lang.String[] strArray8 = byteQuadsCanonicalizer4._names;
        byteQuadsCanonicalizer4._spilloverEnd = (byte) 100;
        int int11 = byteQuadsCanonicalizer4._spilloverEnd;
        int int12 = byteQuadsCanonicalizer4.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer13 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int14 = byteQuadsCanonicalizer13._hashSize;
        byteQuadsCanonicalizer13._count = (byte) 100;
        java.lang.String[] strArray17 = byteQuadsCanonicalizer13._names;
        int[] intArray22 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int24 = byteQuadsCanonicalizer13.calcHash(intArray22, 4);
        java.lang.String[] strArray30 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer13._names = strArray30;
        byteQuadsCanonicalizer4._names = strArray30;
        byteQuadsCanonicalizer0._names = strArray30;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int35 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._longNameOffset = 0;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "237) test1433(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196393) + "'", int1 == (-432196393));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "132) test1433(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1043589872 + "'", int24 == 1043589872);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer5 = byteQuadsCanonicalizer0.makeChild(11880);
        boolean boolean6 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._count = (-2011398561);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "238) test1434(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196377) + "'", int1 == (-432196377));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "133) test1434(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432196377) + "'", int3 == (-432196377));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int4 = byteQuadsCanonicalizer0.bucketCount();
        int int5 = byteQuadsCanonicalizer0._tertiaryStart;
        int int6 = byteQuadsCanonicalizer0.primaryCount();
        int int7 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._hashSize = (-432231821);
        byteQuadsCanonicalizer0._intern = false;
        int int15 = byteQuadsCanonicalizer0.calcHash((-432206631), (-432205323), (-1875619870));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky "239) test1435(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1991521011) + "'", int15 == (-1991521011));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._secondaryStart;
        int int4 = byteQuadsCanonicalizer0.totalCount();
        int int5 = byteQuadsCanonicalizer0.bucketCount();
        int int6 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._longNameOffset = 726751228;
        int int9 = byteQuadsCanonicalizer0.spilloverCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "240) test1436(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196347) + "'", int1 == (-432196347));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        java.lang.String str9 = byteQuadsCanonicalizer0.toString();
        int int10 = byteQuadsCanonicalizer0._hashSize;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]" + "'", str9, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        java.lang.String str1 = byteQuadsCanonicalizer0.toString();
        int[] intArray2 = byteQuadsCanonicalizer0._hashArea;
        int int3 = byteQuadsCanonicalizer0._tertiaryStart;
        java.lang.Class<?> wildcardClass4 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str1, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNull(intArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(1332192405);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._tertiaryShift = 726566431;
        byteQuadsCanonicalizer0._spilloverEnd = (-432236371);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "241) test1440(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196257) + "'", int1 == (-432196257));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift(1319961173);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-1967485713));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        boolean boolean6 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._intern = true;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(111461789);
        byteQuadsCanonicalizer1._secondaryStart = (-432217417);
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        int int5 = byteQuadsCanonicalizer1._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        boolean boolean8 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 1023311;
        byteQuadsCanonicalizer0._tertiaryStart = (-488266);
        int int13 = byteQuadsCanonicalizer0.totalCount();
        int int14 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = byteQuadsCanonicalizer1.makeChild(1023311);
        int int6 = byteQuadsCanonicalizer3.calcHash(726920401, 4);
        byteQuadsCanonicalizer3.release();
        byteQuadsCanonicalizer3._tertiaryShift = 622936314;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer3._names;
        java.lang.String str13 = byteQuadsCanonicalizer3.findName(1372743964, 1934200746);
        int int14 = byteQuadsCanonicalizer3.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-825433012) + "'", int6 == (-825433012));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int6 = byteQuadsCanonicalizer1.calcHash(0, (int) 'a', (int) (short) 100);
        byteQuadsCanonicalizer1._longNameOffset = (-432235879);
        int int9 = byteQuadsCanonicalizer1.spilloverCount();
        int int10 = byteQuadsCanonicalizer1._count;
        byteQuadsCanonicalizer1._secondaryStart = (-432827769);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1797043 + "'", int6 == 1797043);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = (-202237041);
        byteQuadsCanonicalizer0._hashSize = (-432236747);
        int int16 = byteQuadsCanonicalizer0.size();
        int int17 = byteQuadsCanonicalizer0._secondaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "242) test1448(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584556484 + "'", int10 == 584556484);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-432237891) + "'", int17 == (-432237891));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0.totalCount();
        byteQuadsCanonicalizer0._count = (-432230825);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = byteQuadsCanonicalizer0.makeChild((-432823208));
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        boolean boolean10 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "243) test1449(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196175) + "'", int1 == (-432196175));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.hashSeed();
        int int3 = byteQuadsCanonicalizer1._hashSize;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer1._names;
        int int5 = byteQuadsCanonicalizer1._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432225301));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        byteQuadsCanonicalizer1._hashSize = (-432807676);
        int int4 = byteQuadsCanonicalizer1.tertiaryCount();
        int int7 = byteQuadsCanonicalizer1.calcHash(0, 2121761092);
        boolean boolean8 = byteQuadsCanonicalizer1.maybeDirty();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = byteQuadsCanonicalizer1.makeChild((-432226593));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1757557983) + "'", int7 == (-1757557983));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        int int15 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._count = (-1763871690);
        int int18 = byteQuadsCanonicalizer0._longNameOffset;
        int int20 = byteQuadsCanonicalizer0.calcHash(1836438956);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "244) test1453(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584562595 + "'", int10 == 584562595);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "134) test1453(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432196143) + "'", int12 == (-432196143));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "48) test1453(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1958617261) + "'", int20 == (-1958617261));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 926034734;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._secondaryStart = (-432227763);
        int int18 = byteQuadsCanonicalizer0.tertiaryCount();
        int int19 = byteQuadsCanonicalizer0.tertiaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "245) test1454(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-96503820) + "'", int11 == (-96503820));
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int5 = byteQuadsCanonicalizer0.calcHash((-432857889), (-432802824), (-432235691));
        java.lang.String[] strArray6 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = 889916693;
        byteQuadsCanonicalizer0._tertiaryStart = (-432809722);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "246) test1455(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 601554284 + "'", int5 == 601554284);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._hashSize = (-432236613);
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        boolean boolean6 = byteQuadsCanonicalizer0.maybeDirty();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "247) test1456(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196087) + "'", int1 == (-432196087));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot(0);
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.tertiaryCount();
        byteQuadsCanonicalizer1._secondaryStart = (-432235313);
        int int6 = byteQuadsCanonicalizer1.totalCount();
        boolean boolean7 = byteQuadsCanonicalizer1.maybeDirty();
        int int8 = byteQuadsCanonicalizer1.tertiaryCount();
        int int11 = byteQuadsCanonicalizer1.calcHash((-880939674), 726553579);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1749861493) + "'", int11 == (-1749861493));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        java.lang.String[] strArray2 = byteQuadsCanonicalizer0._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0.makeChild(1081706716);
        int int5 = byteQuadsCanonicalizer4.primaryCount();
        int[] intArray6 = byteQuadsCanonicalizer4._hashArea;
        int int7 = byteQuadsCanonicalizer4.secondaryCount();
        byteQuadsCanonicalizer4._spilloverEnd = (-432808935);
        java.lang.String str14 = byteQuadsCanonicalizer4.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", (-432200149), (-432214151), (-792185605));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "248) test1458(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432196075) + "'", int1 == (-432196075));
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str14, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = byteQuadsCanonicalizer0._parent;
        byteQuadsCanonicalizer0._longNameOffset = 926034734;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._secondaryStart = (-432227763);
        byteQuadsCanonicalizer0._intern = true;
        boolean boolean20 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "249) test1459(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1034187444 + "'", int11 == 1034187444);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        byteQuadsCanonicalizer0._hashArea = intArray11;
        int int15 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String[] strArray18 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" };
        byteQuadsCanonicalizer0._names = strArray18;
        java.lang.String str20 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = (-432226811);
        int int23 = byteQuadsCanonicalizer0._spilloverEnd;
        int[] intArray24 = byteQuadsCanonicalizer0._hashArea;
        int int25 = byteQuadsCanonicalizer0._tertiaryStart;
        byteQuadsCanonicalizer0._hashSize = (-1420518152);
        int int28 = byteQuadsCanonicalizer0.bucketCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "250) test1460(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2040930813 + "'", int13 == 2040930813);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str20, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-432237577), (-432237873), 100, (-1) });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1420518152) + "'", int28 == (-1420518152));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432858451));
        boolean boolean2 = byteQuadsCanonicalizer1.maybeDirty();
        int int3 = byteQuadsCanonicalizer1.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        boolean boolean8 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._spilloverEnd = 726703924;
        int int11 = byteQuadsCanonicalizer0._secondaryStart;
        int int12 = byteQuadsCanonicalizer0.size();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "251) test1462(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-709401868) + "'", int7 == (-709401868));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        boolean boolean12 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._count = 726770920;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer0.makeChild(24041);
        java.lang.String str19 = byteQuadsCanonicalizer16.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", (-432205103));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "252) test1463(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433029268) + "'", int11 == (-433029268));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]" + "'", str19, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-432238147), (-432237151), (-432235673));
        byteQuadsCanonicalizer0._intern = true;
        byteQuadsCanonicalizer0._spilloverEnd = (-432214225);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "253) test1464(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1307440034) + "'", int6 == (-1307440034));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        boolean boolean4 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._spilloverEnd = (-2066636029);
        int int7 = byteQuadsCanonicalizer0.spilloverCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.hashSeed();
        int int10 = byteQuadsCanonicalizer8._longNameOffset;
        int int11 = byteQuadsCanonicalizer8.totalCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12._hashSize;
        byteQuadsCanonicalizer12._count = (byte) 100;
        java.lang.String[] strArray16 = byteQuadsCanonicalizer12._names;
        byteQuadsCanonicalizer12._spilloverEnd = (byte) 100;
        int int19 = byteQuadsCanonicalizer12._spilloverEnd;
        int int20 = byteQuadsCanonicalizer12.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer21 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int22 = byteQuadsCanonicalizer21._hashSize;
        byteQuadsCanonicalizer21._count = (byte) 100;
        java.lang.String[] strArray25 = byteQuadsCanonicalizer21._names;
        int[] intArray30 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int32 = byteQuadsCanonicalizer21.calcHash(intArray30, 4);
        java.lang.String[] strArray38 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer21._names = strArray38;
        byteQuadsCanonicalizer12._names = strArray38;
        byteQuadsCanonicalizer8._names = strArray38;
        byteQuadsCanonicalizer0._names = strArray38;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer43 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int44 = byteQuadsCanonicalizer43._hashSize;
        byteQuadsCanonicalizer43._count = (byte) 100;
        java.lang.String[] strArray47 = byteQuadsCanonicalizer43._names;
        byteQuadsCanonicalizer43._spilloverEnd = (byte) 100;
        int int50 = byteQuadsCanonicalizer43._spilloverEnd;
        int int51 = byteQuadsCanonicalizer43.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer52 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int53 = byteQuadsCanonicalizer52._hashSize;
        byteQuadsCanonicalizer52._count = (byte) 100;
        java.lang.String[] strArray56 = byteQuadsCanonicalizer52._names;
        int[] intArray61 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int63 = byteQuadsCanonicalizer52.calcHash(intArray61, 4);
        java.lang.String[] strArray69 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" };
        byteQuadsCanonicalizer52._names = strArray69;
        byteQuadsCanonicalizer43._names = strArray69;
        byteQuadsCanonicalizer0._names = strArray69;
        int int73 = byteQuadsCanonicalizer0.size();
        java.lang.Class<?> wildcardClass74 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-516659008) + "'", int7 == (-516659008));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
// flaky "254) test1465(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432195983) + "'", int9 == (-432195983));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "135) test1465(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1792984778) + "'", int32 == (-1792984778));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "49) test1465(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1792984778) + "'", int63 == (-1792984778));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-664194707));
        byteQuadsCanonicalizer1._count = (-1446089868);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432237577));
        int int2 = byteQuadsCanonicalizer1.bucketCount();
        int int3 = byteQuadsCanonicalizer1.totalCount();
        byteQuadsCanonicalizer1._longNameOffset = 27137223;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer1._parent;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer6);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = byteQuadsCanonicalizer0._parent;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = byteQuadsCanonicalizer0.makeChild((-432236463));
        int int7 = byteQuadsCanonicalizer0._tertiaryStart;
        int int8 = byteQuadsCanonicalizer0.tertiaryCount();
        boolean boolean9 = byteQuadsCanonicalizer0.maybeDirty();
        int int12 = byteQuadsCanonicalizer0.calcHash((-432220593), (-1509909397));
        int int13 = byteQuadsCanonicalizer0._count;
        int int14 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteQuadsCanonicalizer4);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "255) test1468(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1463941068) + "'", int12 == (-1463941068));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        boolean boolean6 = byteQuadsCanonicalizer0._failOnDoS;
        int int7 = byteQuadsCanonicalizer0._hashSize;
        int int8 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._count = (-432223165);
        int int11 = byteQuadsCanonicalizer0.primaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer12 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int13 = byteQuadsCanonicalizer12.hashSeed();
        java.lang.String[] strArray14 = byteQuadsCanonicalizer12._names;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer16 = byteQuadsCanonicalizer12.makeChild(1081706716);
        int int17 = byteQuadsCanonicalizer16.primaryCount();
        int[] intArray18 = byteQuadsCanonicalizer16._hashArea;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer19 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int20 = byteQuadsCanonicalizer19.hashSeed();
        int int21 = byteQuadsCanonicalizer19._longNameOffset;
        int int22 = byteQuadsCanonicalizer19._longNameOffset;
        boolean boolean23 = byteQuadsCanonicalizer19._intern;
        int int24 = byteQuadsCanonicalizer19._secondaryStart;
        int int25 = byteQuadsCanonicalizer19._secondaryStart;
        int int26 = byteQuadsCanonicalizer19._tertiaryShift;
        byteQuadsCanonicalizer19.release();
        int int28 = byteQuadsCanonicalizer19._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer29 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int30 = byteQuadsCanonicalizer29._hashSize;
        byteQuadsCanonicalizer29._count = (byte) 100;
        java.lang.String[] strArray33 = byteQuadsCanonicalizer29._names;
        java.lang.String str34 = byteQuadsCanonicalizer29.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer35 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int36 = byteQuadsCanonicalizer35._hashSize;
        byteQuadsCanonicalizer35._count = (byte) 100;
        java.lang.String[] strArray39 = byteQuadsCanonicalizer35._names;
        int[] intArray44 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int46 = byteQuadsCanonicalizer35.calcHash(intArray44, 4);
        byteQuadsCanonicalizer29._hashArea = intArray44;
        byteQuadsCanonicalizer19._hashArea = intArray44;
        java.lang.String str50 = byteQuadsCanonicalizer16.findName(intArray44, (-2050116369));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = byteQuadsCanonicalizer0.findName(intArray44, 520508900);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer12);
// flaky "256) test1469(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-432195907) + "'", int13 == (-432195907));
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer19);
// flaky "136) test1469(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-432195907) + "'", int20 == (-432195907));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str34, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "50) test1469(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-457430748) + "'", int46 == (-457430748));
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._longNameOffset = 1869614560;
        int int13 = byteQuadsCanonicalizer0.size();
        int int16 = byteQuadsCanonicalizer0.calcHash((-1307440034), (-432211491));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "257) test1470(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432195897) + "'", int1 == (-432195897));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "137) test1470(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432195897) + "'", int3 == (-432195897));
// flaky "51) test1470(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726523393 + "'", int8 == 726523393);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "17) test1470(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40688251 + "'", int16 == 40688251);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer0.calcHash((-432238239), (-432238045), (int) ' ');
        byteQuadsCanonicalizer0._hashSize = (-432857107);
        int int7 = byteQuadsCanonicalizer0._count;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer8 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int9 = byteQuadsCanonicalizer8.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer10 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int11 = byteQuadsCanonicalizer10._hashSize;
        byteQuadsCanonicalizer10._count = (byte) 100;
        java.lang.String[] strArray14 = byteQuadsCanonicalizer10._names;
        int[] intArray19 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int21 = byteQuadsCanonicalizer10.calcHash(intArray19, 4);
        byteQuadsCanonicalizer8._hashArea = intArray19;
        byteQuadsCanonicalizer0._hashArea = intArray19;
        int int26 = byteQuadsCanonicalizer0.calcHash(1881134293, 1461807805);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "258) test1471(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-846225059) + "'", int4 == (-846225059));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "138) test1471(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 656844436 + "'", int21 == 656844436);
// flaky "52) test1471(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1777799028) + "'", int26 == (-1777799028));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryStart = 1533236718;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        int int14 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean15 = byteQuadsCanonicalizer0.maybeDirty();
        int int16 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "259) test1473(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1445455185 + "'", int11 == 1445455185);
// flaky "139) test1473(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-432195877) + "'", int14 == (-432195877));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "53) test1473(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-432195877) + "'", int16 == (-432195877));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._tertiaryStart = 1794842379;
        byteQuadsCanonicalizer0._intern = false;
        byteQuadsCanonicalizer0._secondaryStart = (-1409870154);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "260) test1474(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-68594154) + "'", int11 == (-68594154));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot((-432227153));
        int int2 = byteQuadsCanonicalizer1.size();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer3 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int4 = byteQuadsCanonicalizer3._hashSize;
        java.lang.String str5 = byteQuadsCanonicalizer3.toString();
        int[] intArray10 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer3._hashArea = intArray10;
        byteQuadsCanonicalizer1._hashArea = intArray10;
        byteQuadsCanonicalizer1._spilloverEnd = 726541987;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0._secondaryStart = 2038;
        int[] intArray15 = null;
        byteQuadsCanonicalizer0._hashArea = intArray15;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "261) test1476(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432195855) + "'", int1 == (-432195855));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "140) test1476(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432195855) + "'", int3 == (-432195855));
// flaky "54) test1476(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726522916 + "'", int8 == 726522916);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        int int5 = byteQuadsCanonicalizer0.calcHash((int) (short) 1);
        int int6 = byteQuadsCanonicalizer0.secondaryCount();
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._tertiaryStart = (-432198609);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
// flaky "262) test1477(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-433029416) + "'", int5 == (-433029416));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        int int8 = byteQuadsCanonicalizer0._longNameOffset;
        int int9 = byteQuadsCanonicalizer0.tertiaryCount();
        int[] intArray10 = byteQuadsCanonicalizer0._hashArea;
        byteQuadsCanonicalizer0._count = (-1509909397);
        byteQuadsCanonicalizer0._hashSize = (-432222389);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "263) test1478(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210387061 + "'", int6 == 210387061);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int9 = byteQuadsCanonicalizer0.hashSeed();
        int int10 = byteQuadsCanonicalizer0.bucketCount();
        int int11 = byteQuadsCanonicalizer0._tertiaryStart;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "264) test1479(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1389987758) + "'", int7 == (-1389987758));
// flaky "141) test1479(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-432195821) + "'", int9 == (-432195821));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._secondaryStart;
        java.lang.String str3 = byteQuadsCanonicalizer0.toString();
        int int4 = byteQuadsCanonicalizer0._secondaryStart;
        int int5 = byteQuadsCanonicalizer0._longNameOffset;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "265) test1480(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432195815) + "'", int1 == (-432195815));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str3, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        int int10 = byteQuadsCanonicalizer0._longNameOffset;
        int int11 = byteQuadsCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "266) test1481(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432195801) + "'", int1 == (-432195801));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "142) test1481(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432195801) + "'", int3 == (-432195801));
// flaky "55) test1481(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726525895 + "'", int8 == 726525895);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky "18) test1481(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-432195801) + "'", int11 == (-432195801));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (byte) 100;
        int int7 = byteQuadsCanonicalizer0._spilloverEnd;
        int int8 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String[] strArray9 = byteQuadsCanonicalizer0._names;
        int int11 = byteQuadsCanonicalizer0.calcHash((int) (byte) 1);
        boolean boolean12 = byteQuadsCanonicalizer0._intern;
        byteQuadsCanonicalizer0._count = 726770920;
        int int15 = byteQuadsCanonicalizer0.spilloverCount();
        int int16 = byteQuadsCanonicalizer0.tertiaryCount();
        int int17 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strArray9);
// flaky "267) test1482(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-433029488) + "'", int11 == (-433029488));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        java.lang.String str8 = byteQuadsCanonicalizer0.toString();
        int int9 = byteQuadsCanonicalizer0.primaryCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str8, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=32, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        int int7 = byteQuadsCanonicalizer0.calcHash(6000, (-432236993), 0);
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._secondaryStart = (-432236071);
        int int11 = byteQuadsCanonicalizer0.bucketCount();
        int int12 = byteQuadsCanonicalizer0.tertiaryCount();
        byteQuadsCanonicalizer0._tertiaryStart = (-432228177);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "268) test1484(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1397758209) + "'", int7 == (-1397758209));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        int int1 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._calcTertiaryShift((-432227289));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        boolean boolean12 = byteQuadsCanonicalizer0.maybeDirty();
        int int13 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer14 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int15 = byteQuadsCanonicalizer14._hashSize;
        java.lang.String str16 = byteQuadsCanonicalizer14.toString();
        int[] intArray21 = new int[] { (-432236385), (-432237577), 726930040, (-86011045) };
        byteQuadsCanonicalizer14._hashArea = intArray21;
        byteQuadsCanonicalizer0._hashArea = intArray21;
        boolean boolean24 = byteQuadsCanonicalizer0.maybeDirty();
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        byteQuadsCanonicalizer0._tertiaryStart = 1840309540;
        int int29 = byteQuadsCanonicalizer0._tertiaryShift;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = byteQuadsCanonicalizer0.findName(0, (-1312816649), (-1940311288));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2059662337 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "269) test1486(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432195703) + "'", int1 == (-432195703));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "143) test1486(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432195703) + "'", int3 == (-432195703));
// flaky "56) test1486(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726525067 + "'", int8 == 726525067);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str16, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-432236385), (-432237577), 726930040, (-86011045) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-432857889) + "'", int29 == (-432857889));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int6 = byteQuadsCanonicalizer0.calcHash((-86011045), 0, 10);
        int int7 = byteQuadsCanonicalizer0.bucketCount();
        int int8 = byteQuadsCanonicalizer0.bucketCount();
        int[] intArray9 = byteQuadsCanonicalizer0._hashArea;
        int int10 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._secondaryStart = (-432214501);
        boolean boolean14 = byteQuadsCanonicalizer0._failOnDoS;
        byteQuadsCanonicalizer0._longNameOffset = 586144840;
        byteQuadsCanonicalizer0._reportTooManyCollisions();
        int int18 = byteQuadsCanonicalizer0._tertiaryShift;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "270) test1487(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1938924622 + "'", int6 == 1938924622);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        java.lang.String str2 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryShift = 850855124;
        int int5 = byteQuadsCanonicalizer0._spilloverEnd;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str2, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._longNameOffset;
        int int10 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str11 = byteQuadsCanonicalizer0.toString();
        byteQuadsCanonicalizer0._tertiaryStart = (-432228391);
        boolean boolean14 = byteQuadsCanonicalizer0._intern;
        int int15 = byteQuadsCanonicalizer0.totalCount();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "271) test1489(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432195603) + "'", int1 == (-432195603));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "144) test1489(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432195603) + "'", int3 == (-432195603));
// flaky "57) test1489(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726526246 + "'", int8 == 726526246);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str11, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0.hashSeed();
        byteQuadsCanonicalizer0._longNameOffset = (short) 10;
        int int8 = byteQuadsCanonicalizer0.calcHash((int) '#', (int) (short) 10);
        int int9 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857889);
        boolean boolean12 = byteQuadsCanonicalizer0._failOnDoS;
        int int13 = byteQuadsCanonicalizer0.primaryCount();
        java.lang.Class<?> wildcardClass14 = byteQuadsCanonicalizer0.getClass();
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "272) test1490(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432195583) + "'", int1 == (-432195583));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky "145) test1490(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-432195583) + "'", int3 == (-432195583));
// flaky "58) test1490(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 726528235 + "'", int8 == 726528235);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        byteQuadsCanonicalizer0._secondaryStart = (-432237891);
        int int10 = byteQuadsCanonicalizer0.calcHash((-432238147), 1973355417);
        boolean boolean11 = byteQuadsCanonicalizer0._failOnDoS;
        int int12 = byteQuadsCanonicalizer0.hashSeed();
        boolean boolean13 = byteQuadsCanonicalizer0._failOnDoS;
        int int14 = byteQuadsCanonicalizer0.bucketCount();
        byteQuadsCanonicalizer0._hashSize = (-432235003);
        byteQuadsCanonicalizer0._intern = true;
        java.lang.String[] strArray19 = byteQuadsCanonicalizer0._names;
        byteQuadsCanonicalizer0._spilloverEnd = (-432212507);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky "273) test1491(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 584601781 + "'", int10 == 584601781);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "146) test1491(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-432195571) + "'", int12 == (-432195571));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._tertiaryShift;
        java.lang.String str6 = byteQuadsCanonicalizer0.toString();
        int[] intArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = byteQuadsCanonicalizer0.findName(intArray7, (-432200281));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str6, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        java.lang.String str5 = byteQuadsCanonicalizer0.toString();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer6 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int7 = byteQuadsCanonicalizer6._hashSize;
        byteQuadsCanonicalizer6._count = (byte) 100;
        java.lang.String[] strArray10 = byteQuadsCanonicalizer6._names;
        int[] intArray15 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int17 = byteQuadsCanonicalizer6.calcHash(intArray15, 4);
        byteQuadsCanonicalizer0._hashArea = intArray15;
        int int19 = byteQuadsCanonicalizer0._secondaryStart;
        byteQuadsCanonicalizer0._secondaryStart = (-1776808604);
        byteQuadsCanonicalizer0._tertiaryStart = 1306978773;
        int int24 = byteQuadsCanonicalizer0._tertiaryShift;
        byteQuadsCanonicalizer0._secondaryStart = (-432215441);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str5, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "274) test1493(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1116649964 + "'", int17 == 1116649964);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.secondaryCount();
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int3 = byteQuadsCanonicalizer2._hashSize;
        byteQuadsCanonicalizer2._count = (byte) 100;
        java.lang.String[] strArray6 = byteQuadsCanonicalizer2._names;
        int[] intArray11 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int13 = byteQuadsCanonicalizer2.calcHash(intArray11, 4);
        byteQuadsCanonicalizer0._hashArea = intArray11;
        int int15 = byteQuadsCanonicalizer0.spilloverCount();
        java.lang.String[] strArray18 = new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" };
        byteQuadsCanonicalizer0._names = strArray18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=1, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", 956109619, 469886854, (-1958617261));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1280244761 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "275) test1494(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-464681957) + "'", int13 == (-464681957));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=100, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]", "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=64, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" });
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._tertiaryShift = (-432857136);
        int int6 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean7 = byteQuadsCanonicalizer0._failOnDoS;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-432857136) + "'", int6 == (-432857136));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._tertiaryStart = 0;
        int int4 = byteQuadsCanonicalizer0._tertiaryShift;
        boolean boolean5 = byteQuadsCanonicalizer0._intern;
        int int6 = byteQuadsCanonicalizer0._hashSize;
        int[] intArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = byteQuadsCanonicalizer0.addName("[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/-516659008 pri/sec/ter/spill (=0), total:-516659008]", intArray8, (-432209881));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        byteQuadsCanonicalizer0._count = (byte) 100;
        java.lang.String[] strArray4 = byteQuadsCanonicalizer0._names;
        int[] intArray9 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int11 = byteQuadsCanonicalizer0.calcHash(intArray9, 4);
        byteQuadsCanonicalizer0._intern = false;
        int int14 = byteQuadsCanonicalizer0._tertiaryStart;
        boolean boolean15 = byteQuadsCanonicalizer0._intern;
        boolean boolean16 = byteQuadsCanonicalizer0._failOnDoS;
        int int20 = byteQuadsCanonicalizer0.calcHash(850538117, 1608737209, (-432220067));
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "276) test1497(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1242273562 + "'", int11 == 1242273562);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "147) test1497(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1411774187) + "'", int20 == (-1411774187));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0.hashSeed();
        int int2 = byteQuadsCanonicalizer0._longNameOffset;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        boolean boolean4 = byteQuadsCanonicalizer0._intern;
        int int5 = byteQuadsCanonicalizer0._secondaryStart;
        int int6 = byteQuadsCanonicalizer0._spilloverEnd;
        byteQuadsCanonicalizer0._spilloverEnd = (-1776808604);
        byteQuadsCanonicalizer0._secondaryStart = (-432858399);
        int int11 = byteQuadsCanonicalizer0._longNameOffset;
        int int12 = byteQuadsCanonicalizer0._count;
        byteQuadsCanonicalizer0._tertiaryStart = (-432235673);
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer15 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int16 = byteQuadsCanonicalizer15._hashSize;
        java.lang.String str17 = byteQuadsCanonicalizer15.toString();
        byteQuadsCanonicalizer15._tertiaryShift = 850855124;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer20 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int21 = byteQuadsCanonicalizer20._hashSize;
        byteQuadsCanonicalizer20._count = (byte) 100;
        java.lang.String[] strArray24 = byteQuadsCanonicalizer20._names;
        int[] intArray29 = new int[] { (-432237577), (-432237873), (byte) 100, (-1) };
        int int31 = byteQuadsCanonicalizer20.calcHash(intArray29, 4);
        byteQuadsCanonicalizer15._hashArea = intArray29;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = byteQuadsCanonicalizer0.calcHash(intArray29, 900086368);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
// flaky "277) test1498(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-432195465) + "'", int1 == (-432195465));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]" + "'", str17, "[com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer: size=0, hashSize=0, 0/0/0/0 pri/sec/ter/spill (=0), total:0]");
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-432237577), (-432237873), 100, (-1) });
// flaky "148) test1498(com.fasterxml.jackson.core.sym.RegressionTest2)":         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 671872320 + "'", int31 == 671872320);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0._count;
        int int7 = byteQuadsCanonicalizer0.secondaryCount();
        byteQuadsCanonicalizer0.release();
        byteQuadsCanonicalizer0._longNameOffset = (-432200131);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.createRoot();
        int int1 = byteQuadsCanonicalizer0._hashSize;
        int int2 = byteQuadsCanonicalizer0._spilloverEnd;
        int int3 = byteQuadsCanonicalizer0._longNameOffset;
        byteQuadsCanonicalizer0._count = ' ';
        int int6 = byteQuadsCanonicalizer0.spilloverCount();
        int int7 = byteQuadsCanonicalizer0._hashSize;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer9 = byteQuadsCanonicalizer0.makeChild(726927673);
        byteQuadsCanonicalizer9._hashSize = 0;
        int int12 = byteQuadsCanonicalizer9._secondaryStart;
        byteQuadsCanonicalizer9._secondaryStart = 1293554033;
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteQuadsCanonicalizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
    }
}
